import java.util.Scanner;
public class Gamecontroler {
    boolean status = false;
    public char readChar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        //control if the character is a letter
        while (!sc.hasNext("[a-zA-Z]+")) {
        System.out.println("That's not a letter!");
        System.out.print("Enter a letter: ");
        sc.nextLine();
        }
        char c = sc.next().charAt(0);
        return c;
    }
    //control if the character is in the word
    public boolean isCharInWord(char c, String word) {
        boolean isCharInWord = false;
        for (int i = 0; i < word.length(); i++) {
            if (c == word.charAt(i)) {
                isCharInWord = true;
            }
        }
        return isCharInWord;
    }
    //atribute a nomber a point to user
    public int points(int p, boolean b) {
        //if boolean is false the user lose a point
        if (b == false) {
            p--;
        }
        return p;
    }
    //print the word only with the character that the user has found
public String setGuessedWord(String word, String guessed_word) {
        for (int i = 0; i < word.length(); i++) {
            guessed_word = guessed_word + "_";
        }
        return guessed_word;
    }
//update guessed_word
    public String updateGuessedWord(char c, String word, String guessed_word) {
        for (int i = 0; i < word.length(); i++) {
            if (c == word.charAt(i)) {
                guessed_word = guessed_word.substring(0, i) + c + guessed_word.substring(i + 1);
            }
        }
        return guessed_word;
    }
    public boolean is_finished(String word, int p) {
       //game is finished if p=0 or word contains only letters
        if (p == 0 || word.contains("_") == false) {
            status = true;
        }
        return status;
    }
}
