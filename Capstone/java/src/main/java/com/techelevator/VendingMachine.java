package com.techelevator;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class VendingMachine {
    private BigDecimal balance = BigDecimal.ZERO;

    public BigDecimal getBalance() {
        return balance;
    }

    public void depositBalance(int dollars) {
        this.balance = balance.add(BigDecimal.valueOf(dollars));

    }

    Map<String, InventoryItem> inventoryPlacement = new LinkedHashMap<>();
    public String listInventory(){
        String result = "";
        for (Map.Entry<String, InventoryItem> itemEntry : inventoryPlacement.entrySet()) {
            result += itemEntry.getKey() + " " + " " + itemEntry.getValue() + "\n";

        } return result;
    }
//gets price from item
    public BigDecimal getPrice(String slotNumber) {
       InventoryItem item = inventoryPlacement.get(slotNumber);
       return item.getPrice();
    }



    public VendingMachine() {
        loadInventory();
    }

    public void loadInventory() {
        Path inventoryFile = Paths.get("inventory.txt");
        try (Scanner input = new Scanner (inventoryFile)){
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String [] lineParts = line.split("\\|");
                String position = lineParts[0];
                String name = lineParts[1];
                BigDecimal price = new BigDecimal(lineParts[2]);
                String type = lineParts[3];
                if(type.equals("Chip")) {
                    Chip product = new Chip (name, price);
                    inventoryPlacement.put(position, product);
                } else if(type.equals("Candy")) {
                    Candy product = new Candy (name, price);
                    inventoryPlacement.put(position, product);
                } else if(type.equals("Gum")) {
                    Gum product = new Gum (name, price);
                    inventoryPlacement.put(position, product);
                } else if(type.equals("Drink")) {
                    Drink product = new Drink (name, price);
                    inventoryPlacement.put(position, product);
                }
            }
        } catch (IOException e) {

        }

    }
    public String makePurchase(String purchase) {


        balance = getPrice("A2")
    }


//        public void inventoryScanner() {
//            Path sourcePath = Paths.get()
//        }

    // add a method that scans inventory files and puts into map
}
