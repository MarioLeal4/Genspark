import java.util.Scanner;

public class Main {


    public static String decision(int cave) {
        if(cave == 1) {
            return "You approach the cave..." + '\n' + "It is dark and spooky..." + '\n' +
                    "A large dragon jumps out in front of you! He opens his jaws and..." + '\n' + "Gobbles you down in one bite!";

        } if (cave == 2) {
            return "You approach the cave..." + '\n' + "It is dark and spooky..." + '\n'
                    + "A large dragon jumps out in front of you! He opens his jaws and..." + '\n' +
                    "Says Hi would you like to have some of my treasure?";
        } else {
            return null;
        }
    }

 static void myGame() {

     System.out.println("You are in a land of dragons. " +
             "In front of you, you see two caves.In one cave the dragon is friendly and share the treasure with you.");
     System.out.println("The other dragon is greedy and hungry and will eat you on sight. Which cave wil you choose? (1 or 2)");
     Scanner scan = new Scanner(System.in);
      int cave = scan.nextInt();
     System.out.println(decision(cave));
 }

    public static void main(String[] args) {

        try {

            myGame();

        } catch(Exception e) {
            System.out.println("Caught Exception: Not a number!");
        }

    }

}
