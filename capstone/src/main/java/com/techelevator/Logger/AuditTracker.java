package com.techelevator.Logger;

import com.techelevator.view.application.Accounting;
import com.techelevator.view.application.Menu;

import java.io.IOException;
import java.time.LocalDateTime;

public class AuditTracker extends Menu { // do we need to extend???
    public static void main(String[] args) {
        Logger logger = new Logger("Audit.txt");
        String rightNow = LocalDateTime.now().toString();




        try {
            logger.close();
        } catch (IOException e) {
            System.out.println("There was an error closing the file");
        }
    }
}
