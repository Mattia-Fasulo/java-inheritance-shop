package org.exercises.java;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Product{
    //ATTRIBUTES
    private final int IMEI;
    private int storage;

    //CONSTRUCTOR

    public Smartphone() {
        this.IMEI = super.generateId(1000000000);
        storage = 8;
    }

    public Smartphone(String name, String description, BigDecimal price, BigDecimal iva, int storage) {
        super(name,description, price, iva);
        this.IMEI = super.generateId(1000000000);
        this.storage = storage;
        if(storage < 8){
            this.storage = 8;
        } else if(storage > 64){
            this.storage = 64;
        }
    }



    //METHODS
    public BigDecimal discount(){

        BigDecimal discountProduct;
        if(storage < 32){
            discountProduct = getPrice().multiply(new BigDecimal("0.05"));
        } else {
            discountProduct = getPrice().multiply(new BigDecimal("0.02"));
        }
        return getPrice().subtract(discountProduct);
    }

    @Override
    public String toString() {
        return "Smartphone {" +
                "id=" + getId() +
                ", IMEI=" + IMEI +
                ", storage=" + storage +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", price=" + getPrice() +
                ", iva=" + getIva() +
                '}';
    }


    //GETTER AND SETTER

    public int getIMEI() {
        return IMEI;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
