package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Hello! Whats your name?");
        String name = getInput.nextLine();
        int min = 1;
        int max = 20;
        int randomNum = (int)(Math.random()*(max - min +1) + min);


        //number of guesses player has
        int numG = 6;

        int i, guess;
        System.out.println("Well, " + name + ", I am thinking of a number between 1 and 20.");

        //loop for the number of guesses
        for ( i = 0; i < numG; i++) {

            System.out.println("Take a guess.");
            guess = getInput.nextInt();

            if(randomNum == guess) {
                System.out.println("Congratulations! " + "You guessed the number." );
                break;
            }
            else if (randomNum < guess) {
                System.out.println("The number you guessed is less than " + guess);
            }
            else if (randomNum > guess) {
                System.out.println("The number you guessed is greater than " + guess);
            }
        }

        if(i == numG) {
            System.out.println("You have ran out of tries");
            System.out.println("The number was " + randomNum);
        }
    }
}
