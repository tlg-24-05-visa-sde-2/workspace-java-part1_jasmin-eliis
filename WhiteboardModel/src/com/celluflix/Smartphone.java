package com.celluflix;



import java.util.Arrays;

public class Smartphone {
    //Constraints for smartphone models
    private static final String[] VALID_BRANDS ={"SAMSUNG", "HTC", "APPLE", "GOOGLE"};


    //properties or attributes ("instance variables" or "fields")
    private String model = "";
    private double price = 749.99;
    private int releaseYear = 2008;
    private String color = "Black";     //default color is black




    //functions or operations ("methods")
    public void sendText() {
        System.out.println("Text message has been delivered from your " + model + ".");
    }

    public void answerCall() {
        System.out.println("Call answered by your " + model + ".");
    }

    public void takePhoto() {
        System.out.println("Say cheeeeeese!!! Photo successfully taken from your " + model + ".");
    }

    //constructors
    public Smartphone(String model, double price, int releaseYear, String color) {
        this.model = model;
        this.price = price;
        setReleaseYear(releaseYear);
        this.color = color;
    }


//accessor methods - controlled access to the objects fields


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(Arrays.asList(VALID_BRANDS).contains(model.toUpperCase())) {
        this.model = model.toUpperCase();
    } else {
            System.out.println("Invalid brand, valid brands are " + Arrays.toString(VALID_BRANDS));}
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

    // if/else statement to validate that year is at least 2007 & error message if it's before then.
    public void setReleaseYear(int releaseYear) {
        if (releaseYear < 2007) {
            System.out.println("Error: Release year must be between 2007 and current year. ");
        } else {
            this.releaseYear = releaseYear;
            System.out.println("Enjoy your " + getColor() + " " + getReleaseYear() + " " + getModel() + "!");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Smartphone: " + getModel() + ", Color: " + getColor() + ", Release Year: " + getReleaseYear() + ", Price: " + getPrice();
    }

}
