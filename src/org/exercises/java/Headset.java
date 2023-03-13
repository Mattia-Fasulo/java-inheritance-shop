package org.exercises.java;

import java.math.BigDecimal;

public class Headset extends Product{
    //ATTRIBUTES
    private String color;
    private String connection;

    //CONSTRUCTOR
    public Headset(){

    }
    public Headset(String name, String description, BigDecimal price, BigDecimal iva, String color, String connection){
        super(name,description, price, iva);
        this.color = color;
        this.connection = connection;
    }


    //METHODS

    @Override
    public String toString() {
        return "Headset{" +
                "id=" + getId() +
                ", color='" + color + '\'' +
                ", connection='" + connection + '\'' +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", price=" + getPrice() +
                ", iva=" + getIva() +
                '}';
    }


    //GETTER AND SETTER

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }
}
