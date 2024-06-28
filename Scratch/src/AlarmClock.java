class AlarmClock {
    //properties or attributes these are called "instance variables" or "fields" in Java
    private int snoozeInterval = 5;

    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    public void setSnoozeInterval(int snoozeInterval) {
        this.snoozeInterval = snoozeInterval;
    }

    //functions or operations
    public void snooze() {
        System.out.println("Snoozing for " + snoozeInterval + " minutes");
    }

    /*
     * Purpose: return a string (sentence) describing the object
     */

    public String toString() {
        return "AlarmClock: snoozeInterval = " + snoozeInterval;
    }
}