package com.techelevator;

import java.math.BigDecimal;

public abstract class InventoryItem  {
    private String position;
    private String name;
    private BigDecimal price;
    private static final int DEFAULT_INVENTORY = 5; //come back to this!!
    private int quantity = DEFAULT_INVENTORY;


public InventoryItem(String name, BigDecimal price){
    this.name = name;
    this.price = price;
}

    public String getName() {
    return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }



    public String toString() {
    return name + " " + price + " " + quantity;
    }

}
