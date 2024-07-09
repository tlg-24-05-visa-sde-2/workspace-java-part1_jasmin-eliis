package com.celluflix.test;

import com.celluflix.Smartphone;

import java.util.Arrays;



public class SmartphoneValidationTest {
     public static void main(String[] args) {
         Smartphone phone = new Smartphone("Apple iPhone 12", 649.99, 2020, "Black");

         //test to make sure year is at least 2007
         phone.setReleaseYear(1999);    //Should not be accepted, and year should remain at 2020
         System.out.println(phone);

         phone.setReleaseYear(2024);     //should be accepted and year is updated
         System.out.println(phone);

         phone.sendText();      //should send a text with model name
         phone.answerCall();    //should answer the phone and tell you model
         phone.takePhoto();     //takes a photo for you to upload on Socials

         phone.setModel("Nokia");
         System.out.println(phone);

         phone.setModel("Samsung");
         ;
     }
}