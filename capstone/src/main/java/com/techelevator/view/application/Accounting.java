package com.techelevator.view.application;

import com.techelevator.view.UI.UserInput;

import java.math.BigDecimal;

public class Accounting {

    private double dollarAmount;
    private double quarterAmount;
    private double dimeAmount;
    private double nickelAmount;
    private double pennyAmount;

    public double getDollarAmount() {
        return dollarAmount;
    }

    public double getQuarterAmount() {
        return quarterAmount;
    }

    public double getDimeAmount() {
        return dimeAmount;
    }

    public double getNickelAmount() {
        return nickelAmount;
    }

    public double getPennyAmount() {
        return pennyAmount;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    private double currentBalance = 0;

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Accounting(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Accounting() {
    }

    public double changeDispenser(double currentBalance) {


        double totalAmountInPennies = currentBalance * 100;

        dollarAmount = (int) (totalAmountInPennies / 100);
        totalAmountInPennies %= 100;
        quarterAmount = (int) (totalAmountInPennies / 25);
        totalAmountInPennies %= 25;
        dimeAmount = (int) (totalAmountInPennies / 10);
        totalAmountInPennies %= 10;
        nickelAmount = (int) (totalAmountInPennies / 5);
        totalAmountInPennies %= 5;
        return totalAmountInPennies;
    }

    public double addMoney(double moneyFed) {
        if (moneyFed == 1.00 || moneyFed == 5.00 || moneyFed == 10.00 || moneyFed == 20.00)
            return currentBalance += moneyFed;
        else
            return 0.00;
    }
}


