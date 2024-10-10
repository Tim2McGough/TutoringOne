package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Product> inventory;
    public static void main(String[] args) {
        System.out.println("Hello store!");
        populateInventory();
        System.out.println(inventory);
    }
    //Method syntax: access modify. then return type. then identifier then () for params.
public static void populateInventory(){
        inventory = new ArrayList<>();

        Product hammer = new Product();
        hammer.setId(1);
        hammer.setName("Hammer");
        hammer.setPrice(12);

        Product skrewDriver = new Product(2,"Skrew Driver", 5);
        Product screDriver = new Product(3,"scre Driver", 4.22F);

        inventory.add(hammer);
        inventory.add(skrewDriver);
        inventory.add(screDriver);
    }

    public static ArrayList<Product> getInventory(){


        return inventory;

    }


}

/*Create a new Java application named SearchInventory. You will code the
application we saw in the previous pages. The application displays the inventory
that our store carries.
You will need to code the getInventory() method and create an initial
inventory of at least 5 products. An ArrayList's size can change and will
continue to grow as long as you have the energy to place products in the list
*/