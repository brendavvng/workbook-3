package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheApp {

    // creating static DateTimeFormatter to get time stamp format pattern of 2025-04-25  hour:minute:seconds
    static DateTimeFormatter timeStampFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss");
    // creating scanner to read user input
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        // when the application launches, it makes an entry in the log
        logAction("Launch");

        // create a variable that will keep us looping the question for the user
        // until they decide to quit
        boolean appRunning = true;

        // if you did not want to use the boolean variable, you could write in "true" with the while loop
        // for example, "while(true) {"
        // and also include the "break" to stop the loop

        while(appRunning) {
            // creating question to ask user // displaying question to the user
            System.out.println("Enter a search term (X to exit): ");
            // store their answer in the variable searchTerm and using scanner to read input - then will go to the next line
            String searchTerm = myScanner.nextLine();

            if(searchTerm.equalsIgnoreCase("x")) {

                // creating line to let user know they're now exiting
                System.out.println("Have a nice life!");
                // this is the action to exit the app
                logAction("exit");
                // to have the loop stop running, appRunning will be false
                appRunning = false;

            }else {
                // log the search term to the log file
                logAction("search " + searchTerm);
            }


        }


    }

    // this is the method that will create and maintain our log file, this is an action to our file
    public static void logAction(String theAction) {

        // try/catch allows us to try and write to the file
        try {

            // create a FileWriter and set append to true so it adds to the file, not override its contents
            FileWriter outputFile = new FileWriter("src/main/resources/logs.txt", true);
            // create the buffered writer to write to the log file
            BufferedWriter bufWriter = new BufferedWriter(outputFile);
            // file writer and buffered writer go hand in hand - always need to have them both together

            // creates a date and time
            LocalDateTime timeStamp = LocalDateTime.now();
            // create the line to write to the log file by concating the timestamp in the correct format + a space + the action
            // this is basically saying:
            // buffWriter, write the timeStamp in the format that I want and include the action, the word / the "search" from the user
            bufWriter.write(timeStamp.format(timeStampFormatter) + "  " + theAction);
            // adding a new line, make sure you have a new line in the file
            bufWriter.newLine();
            // now close the bufWriter
            bufWriter.close();


        } catch (Exception e) {
            // if we ran into an issue writing to the file, display this instead
            System.out.println("There was an error writing to the file. " + e.getMessage());
        }


    }

}
