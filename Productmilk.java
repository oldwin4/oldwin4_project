package com.company;

public class Productmilk {
    String name;
    int price;
    String supplierName;

    public Productmilk(String name, int price, String supplierName) {
        this.name = name;
        this.price = price;
        this.supplierName = supplierName;
    }

    public Productmilk(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
