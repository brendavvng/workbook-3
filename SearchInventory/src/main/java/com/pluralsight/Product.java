package com.pluralsight;

public class Product {
    // declaring variables - this will hold the products info
    // private = can only be accessed from within this class
    private int id; // integer: 8 - the product ID
    private String name; // string: "I like animal crossing" - product name
    private double price; // double = 20.00 - product price

    // creating constructor that is creating the "Product" object
    // this gets called in the code when using "new Product()" under the ArrayList
    public Product(int id, String name, double price) {
        this.id = id; // assigning a variable to the id
        this.name = name; // assigning a variable to the name
        this.price = price; // assigning a variable to the price
    }
    // creating getters to allow the code to get the information requested
    public int getId() {
        // returns the value, also like giving back a result
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}
