package com.booleanuk.api;

public class Product {
    private static int nextId = 1;
    private final int id;
    private String name;
    private String category;
    private int price;

    public Product(String name, String category, int price) {
        this.id = nextId++;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Product() {
        this.id = nextId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
