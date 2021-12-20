package com.company;

import java.util.Scanner;

public class Main {

    public static int randomNum() {
               int min = 1;
               int max = 20;
                return (int)(Math.random()*(max - min +1) + min);


    }



    public static boolean ifWon(int randomNumber, int guess) {
        if(randomNumber == guess) {
            return true;
        }
         else {
            return false;
        }
    }

    public static String gameFeedback(int randomNum, int guess) {


        if (randomNum == guess) {


            return "You won!";


        }
        else if (randomNum < guess) {
            return "guessed too high";

        }
        else {
            return "guessed too low";

        }


    }

    public static String getName() {
        Scanner getInput = new Scanner(System.in);
        String name = getInput.nextLine();

        return name;

    }

//    public static int getUserInput() {
//

//
//
//        //int numG = 6;
//        return guess;
//
//       // int i, guess;
//    }

    static void myGame(){


        int ran =randomNum();
        int numG = 6;
        int i;
        System.out.println("Hi, whats your name?");
        String name = getName();
        System.out.println("Well " + name + ", Im thinking of a number between 1 and 20 can you guess it?");

                Scanner getInput = new Scanner(System.in);



        //loop for the number of guesses
        for ( i = 0; i < numG; i++) {


            System.out.println("Take a guess.");
            int guess = getInput.nextInt();
            System.out.println(gameFeedback(ran, guess));
           if(ifWon(ran, guess) == true){

               break;
           }


        }

        if(i == numG) {

            System.out.println("You have ran out of tries... " +"The number was " + ran);
        }

    }
    public static void main(String[] args) {

        try{
        myGame();

        } catch (Exception e) {
            System.out.println("Caught Exception: Not a number!");
        }

    }
}
