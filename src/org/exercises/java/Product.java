package org.exercises.java;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {
    //ATTRIBUTES
    static int countProduct = 0;

    private final int id;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal iva;

    //CONSTRUCTOR
    public Product() {
        id = generateId();

        countProduct++;
    }

    public Product(String name, String description, BigDecimal price, BigDecimal iva) {
        id = generateId();
        this.name = name;
        this.description = description;
        this.price = price.setScale(2, RoundingMode.HALF_EVEN);
        this.iva = iva.setScale(2, RoundingMode.HALF_EVEN);

        countProduct++;
    }

    //GETTER AND SETTER
    public int getId() {
        return id;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;

        if (iva.compareTo(new BigDecimal(0)) < 0){
            this.iva = new BigDecimal("0").setScale(2, RoundingMode.HALF_UP);
        }

    }


    //METHODS
    public int generateId(){
        return generateId(1000);
    }

    public int generateId(int n){
        Random random = new Random();
        return random.nextInt(1, n);
    }

    public BigDecimal priceWithIva(){
        BigDecimal productIva = price.multiply(iva);
        return price.add(productIva);
    }

    @Override
    public String toString() {
        return "Product " + countProduct +  " {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", iva=" + iva +
                '}';
    }
}
