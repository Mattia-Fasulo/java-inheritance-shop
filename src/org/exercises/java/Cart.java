package org.exercises.java;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numProducts;

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

            switch (option) {
                case "1" -> {
                    System.out.print("Insert name: ");
                    String nameSmartphone = scanner.nextLine();

                    System.out.print("Insert description: ");
                    String descriptionSmartphone = scanner.nextLine();

                    System.out.print("Insert price: ");
                    BigDecimal priceSmartphone = new BigDecimal(scanner.nextLine());

                    System.out.print("Insert iva: ");
                    BigDecimal ivaSmartphone = new BigDecimal(scanner.nextLine());

                    System.out.print("Size storage: ");
                    int storage = Integer.parseInt(scanner.nextLine());

                    Smartphone smartphone = new Smartphone(nameSmartphone, descriptionSmartphone, priceSmartphone, ivaSmartphone, storage);
                    System.out.println();

                    System.out.println(smartphone);
                    System.out.println();

                    products[i] = smartphone;

                }
                case "2" -> {
                    System.out.print("Insert name: ");
                    String nameTv = scanner.nextLine();

                    System.out.print("Insert description: ");
                    String descriptionTv = scanner.nextLine();

                    System.out.print("Insert price: ");
                    BigDecimal priceTv = new BigDecimal(scanner.nextLine());

                    System.out.print("Insert iva: ");
                    BigDecimal ivaTv = new BigDecimal(scanner.nextLine());

                    System.out.print("Size tv: ");
                    int width = Integer.parseInt(scanner.nextLine());

                    System.out.print("Smart tv: ");
                    boolean smart = Boolean.parseBoolean(scanner.nextLine());

                    Tv tv = new Tv(nameTv, descriptionTv, priceTv, ivaTv, width, smart);
                    System.out.println(tv);
                    System.out.println();

                    products[i] = tv;
                }
                case "3" -> {
                    System.out.print("Insert name: ");
                    String nameHeadset = scanner.nextLine();

                    System.out.print("Insert description: ");
                    String descriptionHeadset = scanner.nextLine();

                    System.out.print("Insert price: ");
                    BigDecimal priceHeadset = new BigDecimal(scanner.nextLine());

                    System.out.print("Insert iva: ");
                    BigDecimal ivaHeadset = new BigDecimal(scanner.nextLine());

                    System.out.print("Insert color: ");
                    String color = scanner.nextLine();

                    System.out.print("Insert type of connection: ");
                    String connection = scanner.nextLine();

                    Headset headset = new Headset(nameHeadset, descriptionHeadset, priceHeadset, ivaHeadset, color, connection);
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

        scanner.close();
    }
}
