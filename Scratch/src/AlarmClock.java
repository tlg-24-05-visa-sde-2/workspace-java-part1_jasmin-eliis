class AlarmClock {
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
        System.out.println("Snoozing for " + snoozeInterval + " minutes");
    }

    // accessor methods - provides "controlled access" to the objects fields
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    //if incoming value is "valid", we take it i.e assign to the private fields
    //otherwise reject it with an error message
    public void setSnoozeInterval(int snoozeInterval) {
        this.snoozeInterval = snoozeInterval;
    }

    /*
     * Purpose: return a string (sentence) describing the object
     */

    public String toString() {
        return "AlarmClock: snoozeInterval = " + snoozeInterval;
    }
}