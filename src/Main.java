
public class Main {
    public static void main(String[] args) {
        int points = 10;
        Gamecontroler gamecontroler = new Gamecontroler();
        boolean status = false;
        Wordlist wordlist = new Wordlist();
        String guessed_word = "";

        //String userword = wordlist.UserWord();
        //System.out.println("Your word is: " + userword);

        String userword = wordlist.Random_Word();

        guessed_word = gamecontroler.setGuessedWord(userword, guessed_word);
        System.out.println("Your word is: " + guessed_word);

        while (status == gamecontroler.is_finished(guessed_word, points)) {
            char userchar = gamecontroler.readChar();
            System.out.println("Your character is: " + userchar);
            boolean isCharInWord = gamecontroler.isCharInWord(userchar, userword);
            points = gamecontroler.points(points, isCharInWord);
            System.out.println("Your points are: " + points);
            if (isCharInWord == true) {
                guessed_word = gamecontroler.updateGuessedWord(userchar, userword, guessed_word);
            }
            System.out.println("Your word is: " + guessed_word);
        }
        //print if status is true
    }
}