package com.codegym.model;

public class Product {
    private int id;
    private String productName;
    private float price;
    private String manufacturer;

    public Product() {
    }

    public Product(int id, String productName, float price, String manufacturer) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
