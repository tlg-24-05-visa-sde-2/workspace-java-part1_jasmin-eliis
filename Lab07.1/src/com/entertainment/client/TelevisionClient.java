/*
 *Application main class
 * In the main() method, we will create a few Television objects and give them a basic test drive.
 */
package com.entertainment.client;
import com.entertainment.DisplayType;
import com.entertainment.Television;


 class TelevisionClient {
    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances.");

        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(32);
        tv1.setDisplay(DisplayType.PLASMA);

        Television tv2 = new Television("Sony", 50, DisplayType.OLED);


        Television tv3 = new Television("LG",Television.MAX_VOLUME);

        // Turn the TVs on/off
        tv1.turnOn();
        tv1.turnOff();

        tv2.turnOn();
        tv2.turnOff();

        tv3.turnOn();
        tv3.turnOff();

        // Show toString() methods
        System.out.println(tv1.toString());
        System.out.println(tv2.toString());
        System.out.println(tv3.toString());

        System.out.println(Television.getInstanceCount() + " instances.");
    }
}