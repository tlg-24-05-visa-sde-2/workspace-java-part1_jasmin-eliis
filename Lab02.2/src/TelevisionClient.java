/*
 *Application main class
 * In the main() method, we will create a few Television objects and give them a basic test drive.
 */

class TelevisionClient {
    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances.");
        //create an instance of television and set its properties
        Television tv1 = new Television();
        tv1.setBrand("Samsung");


        Television tv2 = new Television("LG");
        tv2.setVolume(tv2.MAX_VOLUME);


        Television tv3 = new Television("Toshiba", 32);



        //turn th tv's on/off
        tv1.turnOn();
        tv1.turnOff();

        tv2.turnOn();
        tv2.turnOff();

        tv3.turnOn();
        tv3.turnOff();


        // show toString() methods
        System.out.println(tv1.toString());
        System.out.println(tv2.toString());
        System.out.println(tv3.toString());

        System.out.println(Television.getInstanceCount() + " instances.")
        ;
    }
}