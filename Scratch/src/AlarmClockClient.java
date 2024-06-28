class AlarmClockClient {

    public static void main(String[] args) {
        AlarmClock clock1 = new AlarmClock();
        clock1.snoozeInterval = 7;

        AlarmClock clock2 = new AlarmClock();
        clock2.snoozeInterval = 10;

        AlarmClock clock3 = new AlarmClock();



        clock1.snooze();
        clock2.snooze();
        clock3.snooze();
    }
}