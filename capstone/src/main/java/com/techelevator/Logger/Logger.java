package com.techelevator.Logger;

import java.io.*;
import java.time.LocalDateTime;

public class Logger {
    private File logFile;
    private PrintWriter writer;

    public Logger(String pathName) {
        this.logFile = new File(pathName);
        try {
            this.writer = new PrintWriter(new FileWriter(this.logFile, true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void write(String logMessage) {
        String rightNow = LocalDateTime.now().toString();
        this.writer.println(rightNow+logMessage);
        this.writer.flush();
    }

    public void close() throws IOException {
        this.writer.close();
    }
}
