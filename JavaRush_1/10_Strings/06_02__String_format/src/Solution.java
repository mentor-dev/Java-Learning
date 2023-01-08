public class Solution {
    public static void main(String[] args) {
        System.out.println(format("Аміго", 5000));
    }

    public static String format(String name, int salary) {
        String phrase = String.format("Мене звати %s. Я зароблятиму $%d на місяць.", name, salary);
        
        return phrase;
    }
}