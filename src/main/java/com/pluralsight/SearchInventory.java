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
                String[] tokens = line.split("\\|");
                int iD = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double price = Double.parseDouble(tokens[2]);


                Product product = new Product(iD, name, price);

                inventory.add(product);

                line = reader.readLine();


            }
            reader.close();

        } catch (Exception e) {
            System.err.println("Something went wrong.");
        }


        return inventory;
    }

}
