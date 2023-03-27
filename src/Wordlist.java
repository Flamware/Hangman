import java.util.Scanner;
import java.awt.Desktop;
import java.io.*;

public class Wordlist {
    private String word;
    private String rand_word;

    public String UserWord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        //control if the word is a string
        while (!sc.hasNext("[a-zA-Z]+")) {
            System.out.println("That's not a word!");
            System.out.print("Enter a word: ");
            this.word = sc.nextLine();
        }
        this.word = sc.nextLine();
        return this.word;
    }
    public String Random_Word() {
            File wordlist = new File("C:\\Users\\axela\\IdeaProjects\\Hangman\\words.txt");
            try {
                Desktop.getDesktop().open(wordlist);
            } catch (IOException e) {
                e.printStackTrace();
            }
          //create array with the words of the file
            String[] words = new String[1000000];
            try {
                Scanner sc = new Scanner(wordlist);
                int i = 0;
                while (sc.hasNextLine()) {
                    words[i] = sc.nextLine();
                    i++;
                }
                sc.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            //create a random number
            int rand = (int) (Math.random() * 100000);
            this.rand_word = words[rand];
            return this.rand_word;
    }

}