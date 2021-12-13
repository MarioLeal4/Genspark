package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("You are in a land of dragons. " +
                "In front of you, you see two caves.In one cave the dragon is friendly and share the treasure with you.");
        System.out.println("The other dragon is greedy and hungry and will eat you on sight. Which cave wil you choose? (1 or 2)");
        int cave = scan.nextInt();
        System.out.println(cave);
        if (cave == 1) {
            System.out.println("You approach the cave...");
            System.out.println("It is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
            System.out.println("Gobbles you down in one bite!");
        } else {
            System.out.println("You approach the cave...");
            System.out.println("It is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
            System.out.println("Says Hi would you like to have some of my treasure?");
        }
    }
}
