package com.techelevator.view.cateringitemsoptions;

import com.techelevator.view.cateringitemsoptions.CateringItems;

import java.math.BigDecimal;

public class Drink extends CateringItems {
    public Drink(String identifier, String name, double price, int quantity) {
        super(identifier, name, price, quantity);
    }

    public void printMessage() {
        System.out.println("Drinky, Drinky, Slurp Slurp!");
    }
}
