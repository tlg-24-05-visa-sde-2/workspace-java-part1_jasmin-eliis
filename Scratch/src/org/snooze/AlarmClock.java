package org.snooze;

class AlarmClock {
    //class (static) fields - ONE copy, shared among all instances class (final) fixed
    public static final int MIN_INTERVAL = 1; //class constant (ALL CAPS)
    public static final int MAX_INTERVAL = 20;


    //everything below here is present in each object

    //properties or attributes these are called "instance variables" or "fields" in Java
    private int snoozeInterval = 5;




    //constructors
    public AlarmClock() {
        //no operations
    }
    public AlarmClock(int snoozeInterval) {
      setSnoozeInterval(snoozeInterval); // delegate to setter if any for validation/conversion if any
    }



    //functions or operations
    public void snooze() {
        System.out.println("Snoozing for " + getSnoozeInterval() + " minutes");
    }

    // accessor methods - provides "controlled access" to the objects fields
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    //if incoming value is "valid", we take it i.e assign to the private fields
    //otherwise reject it with an error message
    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= 1 && snoozeInterval <= 20) { //valid input
       this.snoozeInterval=snoozeInterval;
        }
        else {
            System.out.println(snoozeInterval +" Is invalid. Snooze interval must be between " + MIN_INTERVAL + " and " + MAX_INTERVAL);
        }
    }
    /*
     * Purpose: return a string (sentence) describing the object
     */

    public String toString() {
        return "AlarmClock: snoozeInterval = " + getSnoozeInterval();
    }
}