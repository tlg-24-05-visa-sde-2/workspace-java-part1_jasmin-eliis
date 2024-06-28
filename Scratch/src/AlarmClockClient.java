class AlarmClockClient {

    public static void main(String[] args) {
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(7);

        AlarmClock clock2 = new AlarmClock();
        clock2.setSnoozeInterval(10);

        AlarmClock clock3 = new AlarmClock();



        clock1.snooze();
        clock2.snooze();
        clock3.snooze();
        System.out.println();

        System.out.println(clock1.toString());
        System.out.println(clock2);
        System.out.println(clock3);
    }
}