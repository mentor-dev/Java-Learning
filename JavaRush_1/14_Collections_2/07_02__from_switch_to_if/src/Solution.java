public class Solution {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Вівторок"));
        System.out.println(getTranslationForDayOfWeek("П'ятниця"));
        System.out.println(getTranslationForDayOfWeek("Нічогонеділя"));
    }

    public static String getTranslationForDayOfWeek(String ua) {
        String en;
        if (ua.equalsIgnoreCase("понеділок")) {
            en = "Monday";
        } else if (ua.equalsIgnoreCase("вівторок")) {
            en = "Tuesday";
        } else if (ua.equalsIgnoreCase("середа")) {
            en = "Wednesday";
        } else if (ua.equalsIgnoreCase("четвер")) {
            en = "Thursday";
        } else if (ua.equalsIgnoreCase("п'ятниця")) {
            en = "Friday";
        } else if (ua.equalsIgnoreCase("субота")) {
            en = "Saturday";
        } else if (ua.equalsIgnoreCase("неділя")) {
            en = "Sunday";
        } else {
            en = "Неприпустимий день тижня";
        }
        return en;
    }
}