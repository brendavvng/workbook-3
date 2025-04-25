package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class StoreApp {

    // calling on the "main" method, it has to be associated with the class
    // void = not returning any value, only performs actions and then finishes
    // String[] args is the method's parameter, args is name of the parameter which allows program to receive...
    // ...data from the command line when launched
    public static void main(String[] args) {
        // getInventory method to create Arraylist
        // this is how you load your product objects
        ArrayList<Product> inventory = getInventory();

        // initializing scanner to read user input
        Scanner myScanner = new Scanner(System.in);

        // printing out line
        System.out.println("Welcome to the Animal Crossing Store App!");
        System.out.println("We carry the following inventory: ");
        System.out.print("-------------------------------------");

        // start counting at index 0 - the first one
        // 0 < the inventory size
        // increment by one, to the last one
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            // printing out a specific format
            // % - marks the beginning of the format specifier that signals "printf" on how to display a value
            // %d - int, %s - strings, %.2f - float or double
            System.out.printf("\nid: %d | %s | Price: $%.2f",
                    // this is calling on the methods of the "Product" object
                    // referring to the product variable
                    // method is returning the id, name, and price properties of the "Product" object
                    p.getId(), p.getName(), p.getPrice());
            }
        }
    public static ArrayList<Product> getInventory() {
        // this code block is accessible from anywhere and returns a list of product objects
        // this method is named "getInventory" - method to create / provide list of products

        ArrayList<Product> inventory = new ArrayList<Product>();
        // this method creates an empty ArrayList that holds the "Product" objects
        // ArrayList has modifiable information
        inventory.add(new Product(1, "Fishing Rod", 25.99));
        inventory.add(new Product(2, "Bug Net", 12.50));
        inventory.add(new Product(3, "Watering Can", 19.99));
        inventory.add(new Product(4, "Shovel", 15.00));
        inventory.add(new Product(5, "Axe", 30.00));
        inventory.add(new Product(6, "Pickaxe", 27.50));

        // delivers results from the tasks
        return inventory;
    }
}

