package com.ai.model;

import java.io.Serializable;
import java.sql.Blob;

public class Product implements Serializable {
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Blob getImage() {
        return image;
    }
    public void setImage(Blob image) {
        this.image = image;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    private int id;
    private String name;
    private String description;
    public boolean isIs_stock() {
        return is_stock;
    }
    public void setIs_stock(boolean is_stock) {
        this.is_stock = is_stock;
    }
    public boolean isIs_deleted() {
        return is_deleted;
    }
    public void setIs_deleted(boolean is_deleted) {
        this.is_deleted = is_deleted;
    }

    private Blob image;
    private int quantity;
    private double price;
    private boolean is_stock;
    private boolean is_deleted;
    

}
