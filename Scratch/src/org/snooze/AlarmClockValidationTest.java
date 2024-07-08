package org.snooze;

/*
 *Client-side main-class focused only on testing snooze interval
 * BVT (Boundary Value Testing
 * Any BUGSwill be sniffed out on the edges of the valid range.
 * We test 0,1 and 20,21
 * We test on each boundary and just outside of it
 */
class AlarmClockValidationTest {
    public static void main(String[] args) {
        AlarmClock alarmClock = new AlarmClock();

        alarmClock.setSnoozeInterval(1); // value should be accepted, no error message
        System.out.println(alarmClock);

        alarmClock.setSnoozeInterval(20); //value should be accepted no error message
        System.out.println(alarmClock);

        alarmClock.setSnoozeInterval(0); // error message, value rejected, (so it still 20)
        System.out.println(alarmClock);

        alarmClock.setSnoozeInterval(21); // error message, value rejected, (so it still 20)
        System.out.println(alarmClock);

    }
}