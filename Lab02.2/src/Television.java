/*
 * Application or system class to model the workings of a television
 * it has properties/attributes, it has business methods, but NO main() method
 */

    class Television {
    //properties or attributes -"fields" or "instance variables"
    private String brand;
    private int volume;

    //constructors -these get called when the client says "new"
    public Television() {
        // no-op
    }
    public Television(String brand){
        setBrand(brand); // delegate setter for any validation/conversion it might be doing
    }
    public Television(String brand, int volume) {
        setBrand(brand); //delegate to neighboring ctor above me for "brand"
        setVolume(volume); //handle "volume" myself, by delegating its setter
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