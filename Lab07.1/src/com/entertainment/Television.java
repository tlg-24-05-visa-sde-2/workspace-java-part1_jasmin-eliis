package com.entertainment;



import java.util.Arrays;

/*
 * Application or system class to model the workings of a television
 * it has properties/attributes, it has business methods, but NO main() method
 */

import java.util.Arrays;

public class Television {
    //class ("static") shared among all instances
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"};

    private static int instanceCount = 0;

    public static boolean hasValidBrand(String brand) {
        boolean valid = false;
        for (String currentBrand : VALID_BRANDS) {
            if (currentBrand.equals(brand)) {
                valid = true;
                break;
            }
        }
        return valid;
    }



    //properties or attributes -"fields" or "instance variables"
    private String brand;
    private int volume;
    private DisplayType display = DisplayType.LED;
    private boolean isMuted;
    private int oldVolume;

    public static int getInstanceCount() {
        return instanceCount;
    }

    //constructors -these get called when the client says "new"
    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        if (brand.equalsIgnoreCase("Samsung") ||
                brand.equalsIgnoreCase("Sony") ||
                brand.equalsIgnoreCase("LG") ||
                brand.equalsIgnoreCase("Toshiba")) {
            this.brand = brand; // delegate setter for any validation/conversion it might be doing
        } else {

        }

    }

    public Television(String brand, int volume) {
        this(brand); //delegate to neighboring ctor above me for "brand"
        setVolume(volume); //handle "volume" myself, by delegating its setter
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }


    // functions or operations - methods
    // business or "action methods"
    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + brand + " TV to volume " + volume);
    }

    public void turnOff() {
        System.out.println("Shutting down...goodbye");
    }

    //accessor methods - provides "controlled access" to the object's fields
    public String getBrand() {
        boolean valid = false;
        for (String currentBrand : VALID_BRANDS) {
            if (currentBrand.equals(brand)) {
                valid = true;
                this.brand = brand;
                break;
            }
        }
        if (!valid) {
            System.out.printf("Invalid brand: %s. Valid brands are %s\n", brand, Arrays.toString(VALID_BRANDS));
        }
        return brand;
    }


    public void setBrand(String brand) {
        if (hasValidBrand(brand)) {
            this.brand = brand;
        } else {
            System.out.printf("Invalid brand: %s. Valid brands are %s\n", brand, Arrays.toString(VALID_BRANDS));
        }
    }

        public int getVolume() {
            return volume;
        }

        public DisplayType getDisplay() {
            return display;
        }

        public void setDisplay(DisplayType display) {
            this.display = display;
        }

        public void setVolume(int volume) {
            if (volume <= MIN_VOLUME || volume <= MAX_VOLUME) {
                System.out.println("Invalid volume selected: " + volume + ". Volume must be between " + MIN_VOLUME + " and " + MAX_VOLUME);
            } else {
                this.volume = volume;
            }
        }
        private boolean verifyInternetConnection() {
            return true;
        }

        public String toString() {
            return "Television: brand = " + brand + ", volume = " + volume + ", display = " + display;
        }
    }