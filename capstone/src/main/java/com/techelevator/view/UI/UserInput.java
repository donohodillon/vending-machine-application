package com.techelevator.view.UI;

import com.techelevator.view.application.Accounting;

import java.util.Scanner;

public class UserInput {
    Scanner scanner = new Scanner(System.in);

    public String getHomeScreenOption() {


        System.out.println("What would you like to do?\n");

        System.out.println("D. Display");
        System.out.println("P. Purchase");
        System.out.println("E. Exit");


        System.out.println("\nPlease select an option:");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toLowerCase();

        switch (option) {
            case "d":
                return "D";
            case "p":
                return "P";
            case "e":
                return "E";
            default:
                return "";
        }
    }

    public String getPurchasingProcessOption(Accounting accounting) {
        //Accounting accounting = new Accounting();
//        why does this cause .getFeedMoneyOption to call?
        // UPDATE THIS VALUE

        System.out.println("What would you like to do?\n");

        System.out.println("M. Feed Money");
        System.out.println("S. Select Item");
        System.out.println("F. Finish Transaction");

        System.out.println("\nCurrent Money Provided: $" + String.format("%.2f", accounting.getCurrentBalance()));

        System.out.println("\nPlease select an option:");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toLowerCase();

        switch (option) {
            case "m":
                return "M";
            case "s":
                return "S";
            case "f":
                return "F";
            default:
                return "";
        }
    }

    public String getInputIdentifier() {
        System.out.println("*************************************");
          System.out.println("\nPlease select enter in the option you would like to purchase: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption;

        return option;
    }

    public String getFeedMoneyOption() {
        System.out.println("Please enter money into the machine (1.00, 5.00, 10.00, or 20.00):");
        return scanner.nextLine();
    }
}

