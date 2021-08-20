package design_patterns.strategy;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        RadioAlarm radioAlarm = new RadioAlarm();
        radioAlarm.a();
        radioAlarm.b();
        radioAlarm.c();
        radioAlarm.d();
        radioAlarm.e();
        radioAlarm.setAlarm(new AlarmImpl2());
        radioAlarm.c();
        radioAlarm.d();
        radioAlarm.e();
        RadioAlarm radioAlarm1 = new RadioAlarm(new AlarmImpl2(), new RadioImpl());

    }
}
