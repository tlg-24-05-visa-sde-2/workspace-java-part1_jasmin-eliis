package com.celluflix.client;
import com.celluflix.Smartphone;




/*
 * Client-side "main-class" the class definition with main().
 * the ONLY thing that belongs here
 */
public class SmartphoneClient {
    //entry point for the application
    public static void main(String[] args) {


        //create an instance of smartphone
        Smartphone phone1 = new Smartphone("Apple iPhone 12", 649.99, 2020, "Black");

//        phone1.price = 649.99;
//        phone1.releaseYear = 2020;
//        phone1.color = "Black";

        //create a 2nd instance of smartphone
        Smartphone phone2 = new Smartphone("Samsung Galaxy Z Fold5", 1919.99, 2023, "White");
//        phone2.model = "Samsung Galaxy Z Fold5";
//        phone2.price = 1919.99;
//        phone2.releaseYear = 2023;
//        phone2.color = "White";

        //create a 3rd instance of smartphone
        Smartphone phone3 = new Smartphone("Google Pixel 8 Pro", 1399.00, 2023, "Blue");
//        phone3.model = "Google Pixel 8 Pro";
//        phone3.price = 1399.00;
//        phone3.releaseYear = 2023;
//        phone3.color = "Blue";




        phone1.sendText();
        phone1.answerCall();
        phone1.takePhoto();
        System.out.println(phone1);
        System.out.println();



        phone2.sendText();
        phone2.answerCall();
        phone2.takePhoto();
        System.out.println(phone2);
        System.out.println();

        phone3.sendText();
        phone3.answerCall();
        phone3.takePhoto();
        System.out.println(phone3);
        System.out.println();


    }

}