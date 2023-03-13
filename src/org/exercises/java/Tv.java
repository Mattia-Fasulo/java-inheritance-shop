package org.exercises.java;

import java.math.BigDecimal;

public class Tv extends Product{
    //ATTRIBUTES
    private int width;
    private boolean smart;

    //CONSTRUCTOR
    public Tv(){
        width = 49;

    }

    public Tv(String name, String description, BigDecimal price, BigDecimal iva, int width, boolean smart){
        super(name,description, price, iva);
        this.width = width;
        this.smart = smart;
        if(width < 49){
            this.width = 49;
        }else if(width > 81){
            this.width = 81;
        }

    }
    //METHOD
    public BigDecimal discount(){

        BigDecimal discountProduct;
        if(!smart){
            discountProduct = getPrice().multiply(new BigDecimal("0.10"));
        } else {
            discountProduct = getPrice().multiply(new BigDecimal("0.02"));
        }
        return getPrice().subtract(discountProduct);
    }

    @Override
    public String toString() {
        return "Tv {" +
                "id=" + getId() +
                ", width=" + width +
                ", smart=" + smart +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", price=" + getPrice() +
                ", iva=" + getIva() +
                '}';
    }


    //GETTER E SETTER

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }
}
