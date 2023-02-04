import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1984, 8, 11);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        final String[] DAYS = {"Неділя", "Понеділок", "Вівторок",
                "Середа", "Четвер", "П'ятниця", "Субота"};
        return DAYS[calendar.get(Calendar.DAY_OF_WEEK) - 1];
    }
}