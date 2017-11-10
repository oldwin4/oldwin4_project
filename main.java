package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ProductNotFoundException {
        File file = new File("products.csv");
        Productsdoa doa = new ProductsDoaCsvImplementation();
        System.out.println(doa.getprice("яблоки"));

        //Product product = new Product("молоко", 40, "молочный комбинат1");
        //doa.add(product);

        System.out.println(doa.exists("молоко" )
    }
}
