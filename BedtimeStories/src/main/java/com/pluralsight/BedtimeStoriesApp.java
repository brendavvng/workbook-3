package com.pluralsight;

import java.io.FileInputStream;
import java.util.Scanner;

public class BedtimeStoriesApp {

    // importing scanner to read user input
    // declaring a Scanner object named myScanner
    // The 'static' keyword means this scanner belongs to the class itself
    static Scanner myScanner = new Scanner(System.in);


    // 'String[] args' is for any command-line arguments you might pass to the program
    public static void main(String[] args) {

        // The 'try' block contains code that might potentially cause an error (an "exception").
        try {
            System.out.println("\nWelcome to Bedtime Stories!\n");
            System.out.println("Which bedtime story would you like to read?");
            System.out.println("Please choose your options below (1-3): \n");
            System.out.print("1. Goldilocks and the Three Bears" + "\n2. Hansel and Gretel" + "\n3. Mary had a little lamb\n");
            System.out.print("Enter number: ");

            // using an int (a whole number) that the user types in
            // storing user input in bookChoice variable
            int bookChoice = myScanner.nextInt();
            // when user presses Enter after typing a number, Java reads the number but leaves the "Enter" key press (newline character) behind.
            myScanner.nextLine();

            // declaring variable name "fileName" to store file we want to open from user input
            String fileName = "";

            // 'if-else' statements check the value of 'bookChoice' and set the 'fileName'
            if (bookChoice == 1) {
                // if user chooses 1, 1 will be Goldilocks
                fileName = "goldilocks.txt";
            } else if (bookChoice == 2) {
                // if user chooses 2, 2 will be Hansel and Gretel
                fileName = "hansel_and_gretel.txt";
            } else if (bookChoice == 3) {
                // if user chooses 3, 3 will be Mary had a little lamb
                fileName = "mary_had_a_little_lamb.txt";
            } else {
                // will give an error if user does not choose 1-3
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                // Exit the program if the choice is invalid
                return;
            }

            // line creates a 'FileInputStream' object named 'fis'
            // opens the location of text files and the 'fileName' determined above
            FileInputStream fis = new FileInputStream("src/main/resources/" + fileName);
            Scanner fileScanner = new Scanner(fis);

            // initialize a variable to keep track of the line number in the file
            int lineNumber = 1;
            // creating while loop to continue to read lines of code in the fileScanner
            // fileScanner will read next line
            while (fileScanner.hasNextLine()) {
                //print out each line in the file
                // prints out as 'lineNumber', a colon, and the line of text to read
                System.out.println(lineNumber + ": " + fileScanner.nextLine());
                // after printing the line, we increment the 'lineNumber' so the next line will be numbered correctly
                lineNumber++;
            }

            // closing file scanner
            fileScanner.close();

        } catch (Exception e) {
            // printing error message and re-printing line of text of instructions
            System.out.println("Error. Now exiting: " + e.getMessage());
            // print the stack trace for debugging
            e.printStackTrace();
        } finally {
            // the 'finally' block is executed no matter what happens in the 'try' block
            // close the main scanner in the finally block
            myScanner.close();
        }
    }
}