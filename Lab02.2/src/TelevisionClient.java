/*
 *Application main class
 * In the main() method, we will create a few Television objects and give them a basic test drive.
 */

class TelevisionClient {
    public static void main(String[] args) {
        //create an instance of television and set its properties
        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(32);

        Television tv2 = new Television();
        tv1.setBrand("LG");
        tv2.setVolume(20);

        Television tv3 = new Television();
        tv3.setBrand("Toshiba");
        tv3.setVolume(3);


        //turn th tv's on/off
        tv1.turnOn();
        tv1.turnOff();

        tv2.turnOn();
        tv2.turnOff();

        tv3.turnOn();
        tv3.turnOff();



        System.out.println(tv1.toString());
    }
}