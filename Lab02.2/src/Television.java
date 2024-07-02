/*
 * Application or system class to model the workings of a television
 * it has properties/attributes, it has business methods, but NO main() method
 */

    class Television {
     //class ("static") shared among all instances
     public static final int MIN_VOLUME = 0;
     public static final int MAX_VOLUME = 100;

     private static int instanceCount = 0;

    //properties or attributes -"fields" or "instance variables"
    private String brand;
    private int volume;

        public static int getInstanceCount() {
            return instanceCount;
        }

        //constructors -these get called when the client says "new"
    public Television() {
        instanceCount++;
    }
    public Television(String brand){
            if(brand.equalsIgnoreCase("Samsung") ||
                    brand.equalsIgnoreCase("Sony") ||
                    brand.equalsIgnoreCase("LG") ||
                    brand.equalsIgnoreCase("Toshiba")){
                this.brand = brand; // delegate setter for any validation/conversion it might be doing
            } else{

            }

    }
    public Television(String brand, int volume) {
        this(brand); //delegate to neighboring ctor above me for "brand"
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
        if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
            System.out.println("Invalid volume selected: " + volume + ". Volume must be between " + MIN_VOLUME + " and " + MAX_VOLUME);
        } else {
            this.volume = volume;
        }
    }
    private boolean verifyInternetConnection() {
       return true;
    }

    public String toString() {
        return "Television: brand = " + brand + ", volume = " + volume;
    }
}