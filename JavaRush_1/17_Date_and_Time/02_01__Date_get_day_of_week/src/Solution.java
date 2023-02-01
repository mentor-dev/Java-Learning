import java.util.Date;

public class Solution {

    static Date birthDate = new Date(84, 8, 11);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        final String[] DAYS = {"Неділя", "Понеділок", "Вівторок",
                "Середа", "Четвер", "П'ятниця", "Субота"};
        return DAYS[date.getDay()];
    }
}