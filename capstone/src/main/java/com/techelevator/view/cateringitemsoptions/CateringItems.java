package com.techelevator.view.cateringitemsoptions;

import java.math.BigDecimal;

public abstract class CateringItems {
    private String identifier;
    private String name;
    private double price;
    private int quantity = 7;

    public String getIdentifier() {
        return identifier;
    }

    public void printMessage() {
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public CateringItems(String identifier, String name, double price, int quantity) {
        this.identifier = identifier;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
