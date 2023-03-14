package org.exercises.java;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numProducts;
        BigDecimal total = new BigDecimal("0");

        System.out.println("************************");
        System.out.println("Welcome in Java Shop");
        System.out.println("************************");

        System.out.println();

        System.out.print("How many products do you want to add? ");
        numProducts = Math.abs(Integer.parseInt(scanner.nextLine()));

        Product[] products = new Product[numProducts];

        System.out.println();



        for (int i = 0; i < numProducts; i++) {

            System.out.println("Choose the type of product to add to cart? ");
            System.out.println("1: Add a smartphone");
            System.out.println("2: Add a tv");
            System.out.println("3: Add a headset");

            System.out.println();

            System.out.print("Your option: ");
            String option = scanner.nextLine();
            System.out.println();

            System.out.print("Insert name: ");
            String name = scanner.nextLine();

            System.out.print("Insert description: ");
            String description = scanner.nextLine();

            System.out.print("Insert price: ");
            BigDecimal price = new BigDecimal(scanner.nextLine());

            System.out.print("Insert iva: ");
            BigDecimal iva = new BigDecimal(scanner.nextLine());

            switch (option) {
                case "1" -> {


                    System.out.print("Size storage: ");
                    int storage = Integer.parseInt(scanner.nextLine());

                    Smartphone smartphone = new Smartphone(name, description, price, iva, storage);
                    System.out.println();

                    System.out.println(smartphone);
                    System.out.println();

                    products[i] = smartphone;

                }
                case "2" -> {


                    System.out.print("Size tv: ");
                    int width = Integer.parseInt(scanner.nextLine());

                    System.out.print("Smart tv: ");
                    boolean smart = Boolean.parseBoolean(scanner.nextLine());

                    Tv tv = new Tv(name, description, price, iva, width, smart);
                    System.out.println(tv);
                    System.out.println();

                    products[i] = tv;
                }
                case "3" -> {


                    System.out.print("Insert color: ");
                    String color = scanner.nextLine();

                    System.out.print("Insert type of connection: ");
                    String connection = scanner.nextLine();

                    Headset headset = new Headset(name, description, price, iva, color, connection);
                    System.out.println(headset);
                    System.out.println();

                    products[i] = headset;

                }
                default ->{
                    System.out.println();
                    System.out.println("error");

                     i--;
                }


            }

        }

        System.out.println(Arrays.asList(products));

        System.out.println();
        System.out.print("Do you have a loyalty card? (true/false)");
        boolean loyalty = Boolean.parseBoolean(scanner.nextLine()) ;
        System.out.println();



        if (loyalty){
            for (Product product : products) {
                total = total.add(product.discount());
            }

        } else {
            for (Product product : products) {
                total = total.add(product.getPrice());
            }
        }

        System.out.println(total);

        scanner.close();
    }
}
