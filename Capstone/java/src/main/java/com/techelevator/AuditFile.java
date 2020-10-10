package com.techelevator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AuditFile {


    LocalDateTime myDateObj = LocalDateTime.now();

    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");


    public void logDeposit(BigDecimal balance, BigDecimal dollars) {
        myDateObj = LocalDateTime.now();

        String formattedDate = myDateObj.format(myFormatObj);
        String auditPrintOut = (formattedDate + " " + "FEED MONEY:  " + "$" + balance + " $" + dollars);
        writeToFile(auditPrintOut);

    }

    private void writeToFile(String line) {
        try (FileOutputStream stream = new FileOutputStream("log.txt", true);
             PrintWriter writer = new PrintWriter(stream)) {
            writer.println(line);

        } catch (IOException e) {
            System.out.println("Couldn't write to file");

        }
    }

    public void logPurchase(BigDecimal balance, BigDecimal dollars) {
        myDateObj = LocalDateTime.now();


        String formattedDate = myDateObj.format(myFormatObj);
        String auditPrintOut = (formattedDate + " " +  + "$" + balance + " $" + dollars);
        writeToFile(auditPrintOut);

    }

    public void logTransaction(BigDecimal balance, BigDecimal dollars) {
        myDateObj = LocalDateTime.now();


        String formattedDate = myDateObj.format(myFormatObj);
        String auditPrintOut = (formattedDate + " " + "FEED MONEY:  " + "$" + balance + " $" + dollars);
        writeToFile(auditPrintOut);

    }

}
