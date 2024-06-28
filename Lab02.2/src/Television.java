/*
 * Application or system class to model the workings of a television
 * it has properties/attributes, it has business methods, but NO main() method
 */

    class Television {
    //properties or attributes -"fields" or "instance variables"
    private String brand;
    private int volume;

    // functions or operations - methods
   public void turnOn() {
       boolean isConnected = verifyInternetConnection();
        System.out.println(verifyInternetConnection());
        System.out.println("Turning on your " + brand + " TV to volume " + volume);
    }

   public void turnOff() {
        System.out.println("Shutting down...goodbye");
    }
    //accessor methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean verifyInternetConnection() {
       return true;
    }

    public String toString() {
        return "Television: brand = " + brand + ", volume = " + volume;
    }
}