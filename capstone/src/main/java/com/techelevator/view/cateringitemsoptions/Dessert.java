package com.techelevator.view.cateringitemsoptions;


public class Dessert extends CateringItems {
    public Dessert(String identifier, String name, double price, int quantity) {
        super(identifier, name, price, quantity);
    }

    public void printMessage() {
        System.out.println("Sugar, Sugar, so Sweet!");
    }
}
