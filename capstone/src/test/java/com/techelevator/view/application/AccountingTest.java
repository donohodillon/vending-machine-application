package com.techelevator.view.application;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountingTest {
    @Test
    public void add_one_dollar_equals_one_dollar() {
        double dollarAmount = 1.00;
        double expected = 1.00;
        Accounting accounting = new Accounting();

        double actual = accounting.addMoney(dollarAmount);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void add_five_dollars_equals_five_dollars() {
        double dollarAmount = 5.00;
        double expected = 5.00;
        Accounting accounting = new Accounting();

        double actual = accounting.addMoney(dollarAmount);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void add_ten_dollars_equals_ten_dollars() {
        double dollarAmount = 10.00;
        double expected = 10.00;
        Accounting accounting = new Accounting();

        double actual = accounting.addMoney(dollarAmount);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void add_twenty_dollars_equals_twenty_dollars() {
        double dollarAmount = 20.00;
        double expected = 20.00;
        Accounting accounting = new Accounting();

        double actual = accounting.addMoney(dollarAmount);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void add_four_dollars_equals_zero() {
        double dollarAmount = 4.00;
        double expected = 0.00;
        Accounting accounting = new Accounting();

        double actual = accounting.addMoney(dollarAmount);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void add_zero_dollars_equals_zero() {
        double dollarAmount = 0.00;
        double expected = 0.00;
        Accounting accounting = new Accounting();

        double actual = accounting.addMoney(dollarAmount);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void add_negative_dollars_equals_zero() {
        double dollarAmount = -10.00;
        double expected = 0.00;
        Accounting accounting = new Accounting();

        double actual = accounting.addMoney(dollarAmount);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void current_balance_is_425() {
        double balanceAmount = 4.25;
        double expected = 0;
        Accounting accounting = new Accounting();
        double actual = accounting.changeDispenser(balanceAmount);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void current_balance_is_517() {
        double balanceAmount = 5.17;
        double expected = 0;
        Accounting accounting = new Accounting();
        double actual = accounting.changeDispenser(balanceAmount);

        Assert.assertNotEquals(expected, actual, 0);
    }

    @Test
    public void current_balance_is_950() {
        double balanceAmount = 9.50;
        double expected = 0;
        Accounting accounting = new Accounting();
        double actual = accounting.changeDispenser(balanceAmount);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void current_balance_is_1000() {
        double balanceAmount = 10.00;
        double expected = 0;
        Accounting accounting = new Accounting();
        double actual = accounting.changeDispenser(balanceAmount);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void current_balance_is_1225() {
        double balanceAmount = 12.25;
        double expected = 0;
        Accounting accounting = new Accounting();
        double actual = accounting.changeDispenser(balanceAmount);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void current_balance_is_1700() {
        double balanceAmount = 17.00;
        double expected = 0;
        Accounting accounting = new Accounting();
        double actual = accounting.changeDispenser(balanceAmount);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void current_balance_is_1750() {
        double balanceAmount = 17.50;
        double expected = 0;
        Accounting accounting = new Accounting();
        double actual = accounting.changeDispenser(balanceAmount);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void dollars_equals_4() {
        double balanceAmount = 4;
        double expectedDollarAmount = 4;
        double expectedQuarterAmount = 0;
        double expectedDimeAmount = 0;
        double expectedNickelAmount = 0;

        Accounting accounting = new Accounting();

        double accountingObject = accounting.changeDispenser(balanceAmount);
        double actualDollarAmount = accounting.getDollarAmount();
        double actualQuarterAmount = accounting.getQuarterAmount();
        double actualDimeAmount = accounting.getDimeAmount();
        double actualNickelAmount = accounting.getNickelAmount();

        Assert.assertEquals(expectedDollarAmount, actualDollarAmount, 0);
        Assert.assertEquals(expectedQuarterAmount, actualQuarterAmount, 0);
        Assert.assertEquals(expectedDimeAmount, actualDimeAmount, 0);
        Assert.assertEquals(expectedNickelAmount, actualNickelAmount, 0);


    }

    @Test
    public void dollars_equals_1750() {
        double balanceAmount = 17.50;
        double expectedDollarAmount = 17;
        double expectedQuarterAmount = 2;
        double expectedDimeAmount = 0;
        double expectedNickelAmount = 0;

        Accounting accounting = new Accounting();

        double accountingObject = accounting.changeDispenser(balanceAmount);
        double actualDollarAmount = accounting.getDollarAmount();
        double actualQuarterAmount = accounting.getQuarterAmount();
        double actualDimeAmount = accounting.getDimeAmount();
        double actualNickelAmount = accounting.getNickelAmount();

        Assert.assertEquals(expectedDollarAmount, actualDollarAmount, 0);
        Assert.assertEquals(expectedQuarterAmount, actualQuarterAmount, 0);
        Assert.assertEquals(expectedDimeAmount, actualDimeAmount, 0);
        Assert.assertEquals(expectedNickelAmount, actualNickelAmount, 0);


    }

    @Test
    public void dollars_equals_935() {
        double balanceAmount = 9.35;
        double expectedDollarAmount = 9;
        double expectedQuarterAmount = 1;
        double expectedDimeAmount = 1;
        double expectedNickelAmount = 0;

        Accounting accounting = new Accounting();

        double accountingObject = accounting.changeDispenser(balanceAmount);
        double actualDollarAmount = accounting.getDollarAmount();
        double actualQuarterAmount = accounting.getQuarterAmount();
        double actualDimeAmount = accounting.getDimeAmount();
        double actualNickelAmount = accounting.getNickelAmount();

        Assert.assertEquals(expectedDollarAmount, actualDollarAmount, 0);
        Assert.assertEquals(expectedQuarterAmount, actualQuarterAmount, 0);
        Assert.assertEquals(expectedDimeAmount, actualDimeAmount, 0);
        Assert.assertEquals(expectedNickelAmount, actualNickelAmount, 0);


    }

    @Test
    public void dollars_equals_105() {
        double balanceAmount = 1.05;
        double expectedDollarAmount = 1;
        double expectedQuarterAmount = 0;
        double expectedDimeAmount = 0;
        double expectedNickelAmount = 1;

        Accounting accounting = new Accounting();

        double accountingObject = accounting.changeDispenser(balanceAmount);
        double actualDollarAmount = accounting.getDollarAmount();
        double actualQuarterAmount = accounting.getQuarterAmount();
        double actualDimeAmount = accounting.getDimeAmount();
        double actualNickelAmount = accounting.getNickelAmount();

        Assert.assertEquals(expectedDollarAmount, actualDollarAmount, 0);
        Assert.assertEquals(expectedQuarterAmount, actualQuarterAmount, 0);
        Assert.assertEquals(expectedDimeAmount, actualDimeAmount, 0);
        Assert.assertEquals(expectedNickelAmount, actualNickelAmount, 0);


    }

    @Test
    public void dollars_equals_1535() {
        double balanceAmount = 15.35;
        double expectedDollarAmount = 15;
        double expectedQuarterAmount = 1;
        double expectedDimeAmount = 1;
        double expectedNickelAmount = 0;

        Accounting accounting = new Accounting();

        double accountingObject = accounting.changeDispenser(balanceAmount);
        double actualDollarAmount = accounting.getDollarAmount();
        double actualQuarterAmount = accounting.getQuarterAmount();
        double actualDimeAmount = accounting.getDimeAmount();
        double actualNickelAmount = accounting.getNickelAmount();

        Assert.assertEquals(expectedDollarAmount, actualDollarAmount, 0);
        Assert.assertEquals(expectedQuarterAmount, actualQuarterAmount, 0);
        Assert.assertEquals(expectedDimeAmount, actualDimeAmount, 0);
        Assert.assertEquals(expectedNickelAmount, actualNickelAmount, 0);


    }

    @Test
    public void dollars_equals_090(){
        double balanceAmount = 0.90;
        double expectedDollarAmount = 0;
        double expectedQuarterAmount = 3;
        double expectedDimeAmount = 1;
        double expectedNickelAmount = 1;

        Accounting accounting = new Accounting();

        double accountingObject = accounting.changeDispenser(balanceAmount);
        double actualDollarAmount = accounting.getDollarAmount();
        double actualQuarterAmount = accounting.getQuarterAmount();
        double actualDimeAmount = accounting.getDimeAmount();
        double actualNickelAmount = accounting.getNickelAmount();

        Assert.assertEquals(expectedDollarAmount,actualDollarAmount,0);
        Assert.assertEquals(expectedQuarterAmount,actualQuarterAmount,0);
        Assert.assertEquals(expectedDimeAmount,actualDimeAmount,0);
        Assert.assertEquals(expectedNickelAmount,actualNickelAmount,0);


    }

    @Test
    public void dollars_equals_950(){
        double balanceAmount = 9.50;
        double expectedDollarAmount = 9;
        double expectedQuarterAmount = 2;
        double expectedDimeAmount = 0;
        double expectedNickelAmount = 0;

        Accounting accounting = new Accounting();

        double accountingObject = accounting.changeDispenser(balanceAmount);
        double actualDollarAmount = accounting.getDollarAmount();
        double actualQuarterAmount = accounting.getQuarterAmount();
        double actualDimeAmount = accounting.getDimeAmount();
        double actualNickelAmount = accounting.getNickelAmount();

        Assert.assertEquals(expectedDollarAmount,actualDollarAmount,0);
        Assert.assertEquals(expectedQuarterAmount,actualQuarterAmount,0);
        Assert.assertEquals(expectedDimeAmount,actualDimeAmount,0);
        Assert.assertEquals(expectedNickelAmount,actualNickelAmount,0);


    }
    @Test
    public void dollars_equals_3765(){
        double balanceAmount = 37.65;
        double expectedDollarAmount = 37;
        double expectedQuarterAmount = 2;
        double expectedDimeAmount = 1;
        double expectedNickelAmount = 1;

        Accounting accounting = new Accounting();

        double accountingObject = accounting.changeDispenser(balanceAmount);
        double actualDollarAmount = accounting.getDollarAmount();
        double actualQuarterAmount = accounting.getQuarterAmount();
        double actualDimeAmount = accounting.getDimeAmount();
        double actualNickelAmount = accounting.getNickelAmount();

        Assert.assertEquals(expectedDollarAmount,actualDollarAmount,0);
        Assert.assertEquals(expectedQuarterAmount,actualQuarterAmount,0);
        Assert.assertEquals(expectedDimeAmount,actualDimeAmount,0);
        Assert.assertEquals(expectedNickelAmount,actualNickelAmount,0);


    }
}

