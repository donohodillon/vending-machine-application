package com.techelevator.view.application;

import com.techelevator.Logger.Logger;
import com.techelevator.view.UI.UserInput;
import com.techelevator.view.UI.UserOutput;
import com.techelevator.view.cateringitemsoptions.*;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Menu {
    UserInput userInput = new UserInput();
    Logger logger;
    Logger errorLogger;

    public void run() throws IOException {

        logger = new Logger("Audit.txt");

        List<CateringItems> cateringItems = readFromFile();

        boolean shouldLoop = true;
        while (shouldLoop) {
            try {
                UserOutput.displayHomeScreen();
                String choice = userInput.getHomeScreenOption();

                if (choice.equals("D")) {
                    listAllCateringItems(cateringItems);
                } else if (choice.equals("P")) {
                    Accounting accounting = new Accounting();
                    while (true) {
                        UserOutput.displayPurchasingHomeScreen();
                        String choice2 = userInput.getPurchasingProcessOption(accounting);
                        if (choice2.equals("M")) {
                            String money = userInput.getFeedMoneyOption();
                            double moneyDBL = Double.parseDouble(money);
                            accounting.addMoney(moneyDBL);
                            logger.write(" Money Fed: " + " " + "$" + String.format("%6.2f", moneyDBL)
                                    + " " + "$" + String.format("%6.2f", accounting.getCurrentBalance()));
                        } else if (choice2.equals("S")) {
                            listAllCateringItems(cateringItems);
                            String selectionIdentifier = userInput.getInputIdentifier().toLowerCase();
                            boolean found = false;
                            boolean enoughMoney = false;
                            for (CateringItems items : cateringItems) {
                                if (items.getIdentifier().toLowerCase().equals(selectionIdentifier)) {
                                    found = true;
                                    if (accounting.getCurrentBalance() >= items.getPrice()) {
                                        enoughMoney = true;
                                        if (items.getQuantity() == 0 && found) {
                                            System.out.println("\nITEM OUT OF STOCK!");
                                        } else if (items.getQuantity() >= 1) {
                                            items.setQuantity(items.getQuantity() - 1);
                                            items.printMessage();
                                            logger.write(" " + items.getName() + " " +
                                                    items.getIdentifier() + " " + "$" + String.format("%6.2f", accounting.getCurrentBalance())
                                                    + "$" + String.format("%6.2f", accounting.getCurrentBalance() - items.getPrice()));
                                            accounting.setCurrentBalance(accounting.getCurrentBalance() - items.getPrice());
                                        }
                                    }
                                }
                            }
                            if (!enoughMoney && found) {
                                System.out.println("\nPLEASE ENTER IN MORE MONEY INTO THE MACHINE!");
                            }
                            if (!found) {
                                System.out.println("\nITEM DOES NOT EXIST!");
                            }
                        } else if (choice2.equals("F")) {
                            accounting.changeDispenser(accounting.getCurrentBalance());
                            System.out.println("Dollars = " + accounting.getDollarAmount() + "\nQuarters = "
                                    + accounting.getQuarterAmount() + "\nDimes = " + accounting.getDimeAmount() + "\nNickels = "
                                    + accounting.getNickelAmount() + "\nPennies = " + accounting.getPennyAmount() + "\n --------THANK YOU COME AGAIN PLEASE THANKS--------");
                            logger.write(" " + "Change Given:" + "$" + String.format("%6.2f", accounting.getCurrentBalance()) + " " + "$"
                                    + (0.00));
                            //dispense change
                            break;
                        }
                    }
                } else if (choice.equals("E")) {
                    shouldLoop = false;
                }
            } catch (Exception e) {
                System.out.println("\nInvalid entry, please try again!");
            }

        }
    }

    private List<CateringItems> readFromFile() throws IOException {
        File inventoryFile = new File("catering.csv");
        List<CateringItems> cateringInventory = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(inventoryFile);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] lineArray = line.split(",");
                if (lineArray[2].equals("Munchy")) {
                    Munchy munchyItem = new Munchy(lineArray[0], lineArray[1], Double.parseDouble(lineArray[3]), 7);
                    cateringInventory.add(munchyItem);
                } else if (lineArray[2].equals("Drink")) {
                    Drink drinkItem = new Drink(lineArray[0], lineArray[1], Double.parseDouble(lineArray[3]), 7);
                    cateringInventory.add(drinkItem);
                } else if (lineArray[2].equals("Sandwich")) {
                    Sandwich sandwhichItem = new Sandwich(lineArray[0], lineArray[1], Double.parseDouble(lineArray[3]), 7);
                    cateringInventory.add(sandwhichItem);
                } else if (lineArray[2].equals("Dessert")) {
                    Dessert dessertItem = new Dessert(lineArray[0], lineArray[1], Double.parseDouble(lineArray[3]), 7);
                    cateringInventory.add(dessertItem);
                }
            }
        } catch (FileNotFoundException e) {
            logger.write(LocalDateTime.now().toString() + "unable to find file");
            logger.close();
            System.exit(0);
        }
        return cateringInventory;
    }


    private void listAllCateringItems(List<CateringItems> cateringItems) {
        UserOutput.listInventory(cateringItems);
    }
}
