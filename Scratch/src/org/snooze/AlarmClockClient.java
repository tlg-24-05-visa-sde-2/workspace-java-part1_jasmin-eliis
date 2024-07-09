package org.snooze;

class AlarmClockClient {

    //starting point or "entry" point for every standalone Java application
    public static void main(String[] args) {
        System.out.println(AlarmClock.MIN_INTERVAL);

        //create an AlarmClock object and set its snoozeInterval
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(7);

        // Creates second AlarmClock  object/instance using constructor (in one shot)
        AlarmClock clock2 = new AlarmClock(10);

        // create a third AlarmClock object, with largest snooze interval available
        AlarmClock clock3 = new AlarmClock(AlarmClock.MAX_INTERVAL);



        clock1.snooze();
        clock2.snooze();
        clock3.snooze();
        System.out.println();

        System.out.println(clock1);
        System.out.println(clock2);
        System.out.println(clock3);
    }
}