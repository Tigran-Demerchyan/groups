package com.groups.model;

public class Item {
    private String name;
    private double price;
    private String currency;
    private Group group;

    public Item(String name, double price, String currency, Group group) {
        this.name = name;
        this.price = price;
        this.currency = currency;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", currency='" + currency + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
