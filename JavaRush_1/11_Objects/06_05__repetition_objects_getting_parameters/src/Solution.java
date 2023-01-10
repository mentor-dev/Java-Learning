public class Solution {

    public static void showWeather(City city) {
        String resultString = String.format("У місті %s сьогодні температура повітря %d", city.getName(), city.getTemperature());
        System.out.println(resultString);
    }

    public static void main(String[] args) {
        City kyivCity = new City("Kyiv", 20);
        showWeather(kyivCity);
    }
}