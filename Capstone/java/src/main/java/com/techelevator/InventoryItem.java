package com.techelevator;

import java.math.BigDecimal;

public abstract class InventoryItem  {
    private String position;
    private String name;
    private BigDecimal price;
    private boolean outOfStock; //change to integer for quantity to keep track

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

    public boolean isOutOfStock() {
        return outOfStock;
    }

    public void setOutOfStock(boolean outOfStock) {
        this.outOfStock = outOfStock;
    }



}
