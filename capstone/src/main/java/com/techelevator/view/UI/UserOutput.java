package com.techelevator.view.UI;

import com.techelevator.view.cateringitemsoptions.CateringItems;

import java.util.List;

public class UserOutput {
    public static void displayHomeScreen() {
        System.out.println();
        System.out.println("*************************************");
        System.out.println("  Dillon & Matt's Vending Machine  ");
        System.out.println("*************************************");
        System.out.println();
    }

    public static void displayPurchasingHomeScreen() {
        System.out.println();
        System.out.println("**************************************");
        System.out.println("         Purchasing Options         ");
        System.out.println("**************************************");
        System.out.println();
    }

    public static void listInventory(List<CateringItems> cateringItemsList) {
        for (CateringItems cateringItemsIterator : cateringItemsList) {
            System.out.printf("%-5s %-20s %6.2f %3d \n ", cateringItemsIterator.getIdentifier(), cateringItemsIterator.getName(),
                    cateringItemsIterator.getPrice(), cateringItemsIterator.getQuantity());
        }
    }
}
