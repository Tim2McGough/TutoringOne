package com.pluralsight;

public class Product {
    // This defines what the class 'Product' holds. Probably.
    private int id;
    private String name;
    private float price;
// this is a default constructor. Defaults are usually empty.
    public Product(){

    }
//  all args Constructor, all the fields have been passed into this.
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;

   }
//Getter: returns a value. Setters: manipulates data allowing you to set new values.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;

    }
// calls out the above.
    @Override
    public String toString() {
        return "Product{" +
                "id =" + id +
                ", Name='" + name + '\'' +
                ", Price=" + price +
                '}';
    }
}
