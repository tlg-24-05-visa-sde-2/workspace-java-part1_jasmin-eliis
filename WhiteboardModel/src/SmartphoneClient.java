/*
 * Client-side "main-class" the class definition with main().
 * the ONLY thing that belongs here
 */
class SmartphoneClient {
    //entry point for the application
    public static void main(String[] args) {
        //create an instance of smartphone
        Smartphone phone1 = new Smartphone();
        phone1.brand = "Apple";
        phone1.model = "iPhone 12";
        phone1.price = 649.99;
        phone1.releaseYear = 2020;
        phone1.memory = 128; // in GB
        phone1.isDamaged = false;

        Smartphone phone2 = new Smartphone();
        phone2.brand = "Samsung";
        phone2.model = "Galaxy Z Fold5";
        phone2.price = 1919.99;
        phone2.releaseYear = 2023;
        phone2.memory = 512;
        phone2.isDamaged = false;

        Smartphone phone3 = new Smartphone();
        phone3.brand = "Google";
        phone3.model = "Pixel 8 Pro";
        phone3.price = 1399.00;
        phone3.releaseYear = 2023;
        phone3.memory = 1000;
        phone3.isDamaged = false;

        phone1.sendText();
    }

}