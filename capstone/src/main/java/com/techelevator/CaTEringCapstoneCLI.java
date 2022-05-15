package com.techelevator;

import com.techelevator.view.application.Menu;

import java.io.IOException;


public class CaTEringCapstoneCLI {

    private Menu menu;

    public CaTEringCapstoneCLI(Menu menu) {
        this.menu = menu;
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        CaTEringCapstoneCLI cli = new CaTEringCapstoneCLI(menu);
        try {
            menu.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
