package com.techelevator;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VendingMachine {
    Map<String, InventoryItem> inventoryPlacement = new HashMap<>();

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
                } //place the candy and gum

            }
        } catch (IOException e) {

        }

    }

    // add a method that scans inventory files and puts into map
}
