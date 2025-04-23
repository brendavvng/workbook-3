package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {

    public static void main(String[] args) {

        // 10 quotes listed
        String[] quotes = { "Believe you can and you're halfway there.",
                "Happiness depends upon ourselves.",
                "The only way to have a friend is to be one.",
                "If you can dream it, you can do it.",
                "What we think, we become.",
                "Real change, enduring change, happens one step at a time.",
                "I think, therefore I am","Less is more",
                "You are never too old to set a new goal or to dream a new dream.",
                "It always seems impossible until it's done." };

        System.out.println("Please choose a number from 1-10 for a quote to display.");
        System.out.print("Enter: ");
        // initializing scanner to read user input
        Scanner myScanner = new Scanner(System.in);
        int userInput = myScanner.nextInt();


        // try/catch will help provide a nicer message to the user, when the index is out of bounds
        try {
            // print out a quote from the array, -1 will go back one since code starts at 0,
            // user actually means 1
            System.out.println(quotes[userInput - 1]);
        } catch (Exception e) { // catch will always need Exception e
          System.out.println(e.getMessage()); // printing out message from the exception
            System.out.println("Sorry, that number does not exist. Exiting out now.");
        }

    }
}