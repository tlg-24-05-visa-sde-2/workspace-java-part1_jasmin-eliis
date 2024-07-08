package com.celluflix;

public class Smartphone {
    //properties or attributes ("instance variables" or "fields")
    private String model;
    private double price;
    private int releaseYear;
    private String color = "Black";     //default color is black


    //functions or operations ("methods")
    public void sendText() {
        System.out.println("Text message has been delivered from your " + model + ".");
    }

    public void answerCall() {
        System.out.println("Call answered by your " + model + ".");
    }

    public void takePhoto() {
        System.out.println("Photo successfully taken from your " + model + ".");
    }

    //constructors
    public Smartphone(String model, double price, int releaseYear, String color) {
        this.model = model;
        this.price = price;
        this.releaseYear = releaseYear;
        this.color = color;
    }


//accessor methods - controlled access to the objects fields


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Smartphone: " + model + " Release Year: " + releaseYear + " Price: " + price + "\n";
    }

}
