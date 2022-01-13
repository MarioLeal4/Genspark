import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static final String[] WORDS = {
      "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CLASS", "NATIVE", "COWBOYS", "ROCKETS",
            "PRIVATE", "INTERFACE", "PACKAGE", "DEFAULT", "FINALLY",
    };

    private int nbErrors;
    private char[] wordFound;
    private String wordToFind;
    public static final int MAX_ERRORS = 6;


    public static final Random RANDOM = new Random();
    private ArrayList<String> letters = new ArrayList<>();

    //

    //Method to get random word from array
    String nextWordToFind() {

        System.out.println(WORDS[RANDOM.nextInt(WORDS.length)]);
        System.out.println("HI");
        return WORDS[RANDOM.nextInt(WORDS.length)];
    }

    public void newGame() {
        nbErrors = 0;
        letters.clear();
        wordToFind = nextWordToFind();

        wordFound = new char[wordToFind.length()];
        for(int i = 0; i< wordFound.length; i++) {
            wordFound[i] = '_';
        }
    }

    public boolean wordFound() {
        return wordToFind.contentEquals(new String(wordFound));
    }

    private void enter(String c) {
        if(!letters.contains(c)) {
            if(wordToFind.contains(c)) {
               int index = wordToFind.indexOf(c);

               while(index >= 0) {
                   wordFound[index] = c.charAt(0);
                   index = wordToFind.indexOf(c, index +1);
               }
            } else {
                nbErrors++;
            }
            letters.add(c);
        }
    }
    public String wordFoundContent() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i< wordFound.length; i++) {
            builder.append(wordFound[i]);

            if(i<wordFound.length -1) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }



    public void play() {
        try(Scanner input =new Scanner(System.in)) {
            while (nbErrors<MAX_ERRORS) {
                System.out.println("\nEnter a letter : ");
                String str = input.next();
                if(str.length() > 1) {
                    str = str.substring(0,1);
                }
                enter(str);
                System.out.println("\n" + wordFoundContent());
                if(nbErrors ==1) {
                    System.out.println("|----|");
                    System.out.println("O");
                }
                if(nbErrors ==2) {
                    System.out.println("|----|");
                    System.out.println("O");
                    System.out.println("|");
                }
                if(nbErrors ==3) {
                    System.out.println(" |----|");
                    System.out.println(" O");
                    System.out.println("\\|");
                }
                if(nbErrors == 4) {
                    System.out.println("  |----|");
                    System.out.println("  O");
                    System.out.println(" \\|/");

                }
                if(nbErrors == 5){
                    System.out.println("  |----|");
                    System.out.println("  O");
                    System.out.println(" \\|/");
                    System.out.println(" /");
                }

                if(wordFound()) {
                    System.out.println("\nYou win!");
                    break;
                } else {

                    System.out.println("\n=> Nb tries remaining : " + (MAX_ERRORS -nbErrors));
                }
            }
            if(nbErrors == MAX_ERRORS) {
                System.out.println("\nYou lose!");
                System.out.println("  |----|");
                System.out.println("  O");
                System.out.println(" \\|/");
                System.out.println(" / \\");
                System.out.println("=> Word to find was : " + wordToFind);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("HangMan");
        Hangman hangman = new Hangman();
        hangman.newGame();
        hangman.play();
    }

}
