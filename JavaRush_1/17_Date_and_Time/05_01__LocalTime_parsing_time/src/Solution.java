import java.time.LocalTime;

public class Solution {

    static LocalTime timeMax = LocalTime.MAX;
    static LocalTime timeMin = LocalTime.MIN;
    static LocalTime time1 = LocalTime.of(14, 0);
    static LocalTime time2 = LocalTime.of(7, 0, 8);
    static LocalTime time3 = LocalTime.of(0, 45, 0, 61);
    static LocalTime time4 = LocalTime.of(14, 0, 45, 1001);

    public static void main(String[] args) {
        int hours = time1.getHour();
        int ninutes = time2.getMinute();
        int seconds = time3.getSecond();
        int nanos = time4.getNano();
        LocalTime time = LocalTime.of(hours, ninutes, seconds, nanos);
        System.out.println(time);
    }
}