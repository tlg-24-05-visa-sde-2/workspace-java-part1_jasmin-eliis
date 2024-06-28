/*
 *Application main class
 * In the main() method, we will create a few Television objects and give them a basic test drive.
 */

class TelevisionClient {
    public static void main(String[] args) {
        //create an instance of television and set its properties
        Television tv1 = new Television();
        tv1.brand = "Samsung";
        tv1.volume = 32;

        Television tv2 = new Television();
        tv1.brand = "LG";
        tv2.volume = 20;

        Television tv3 = new Television();
        tv3.brand = "Toshiba";
        tv3.volume = 3;


        //turn th tv's on/off
        tv1.turnOn();
        tv1.turnOff();

        tv2.turnOn();
        tv2.turnOff();

        tv3.turnOn();
        tv3.turnOff();
    }
}