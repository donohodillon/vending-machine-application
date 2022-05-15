package com.techelevator.view.cateringitemsoptions;

import com.techelevator.view.cateringitemsoptions.CateringItems;

import java.math.BigDecimal;

public class Sandwich extends CateringItems {
    public Sandwich (String identifier,String name, double price,int quantity) {
        super(identifier,name, price,quantity);
    }

    public void printMessage(){
        System.out.println( "Sandwich So Delicious, Yum!");
    }
}
