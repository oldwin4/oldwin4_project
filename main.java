package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ProductmilkNotFoundException {
        File file = new File("products.csv");
        Productsdao doa = new ProductsmilkDaoCsvImplementation();
        System.out.println(doa.getprice("яблоки"));

        //Product product = new Product("молоко", 50, "молочный комбинат1");
        //doa.add(product);

        System.out.println(doa.exists("молоко" )
    }
}
