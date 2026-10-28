package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;


public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();

        for (Product product : inventory) {
            System.out.println(product);
        }

    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("inventory.csv"));
            String line = reader.readLine();
            while(line != null) {

            }

        } catch (Exception e) {
            System.err.println("Something went wrong.");
        }

        inventory.add(new Product(1, "Phone", 499.99));
        inventory.add(new Product(2, "TV", 199.99));
        inventory.add(new Product(3, "Bed", 49.99));
        inventory.add(new Product(4, "book", 19.99));
        inventory.add(new Product(5, "Box", 5.99));


        return inventory;
    }
}
