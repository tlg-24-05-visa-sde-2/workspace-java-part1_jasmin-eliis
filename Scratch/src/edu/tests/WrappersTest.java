package edu.tests;

class WrappersTest {
    public static void main(String[] args) {
        String ageInput = "34";
        int age = Integer.parseInt(ageInput); //returns 34 from string "34"
        Integer ageInteger = Integer.valueOf(ageInput); // returns integer (57) from "57"

        String populationInput = "800_000_000_000";
        long population = Long.parseLong(populationInput);

        String priceInput = "$12.49";
        double price = Double.parseDouble(priceInput);
        Double priceDouble = Double.valueOf(priceInput);

        String isSunnyInput = "true";
        boolean isSunny = Boolean.parseBoolean(isSunnyInput);
        Boolean isSunnyDouble = Boolean.valueOf(isSunnyInput);
    }
}