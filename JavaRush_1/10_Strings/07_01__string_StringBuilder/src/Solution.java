public class Solution {
    public static void main(String[] args) {
        String string = "Навчатися, навчатися і ще раз навчатися! ";

        System.out.println(addTo(string, new String[]{"Під ", "лежачий ", "камінь ", "вода ", "не ", "тече"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        StringBuilder result = new StringBuilder(string);
        for (String elem : strings) {
            result.append(elem);
        }
        
        return result;
    }
    
    public static StringBuilder replace(String string, String str, int start, int end) {
        StringBuilder result = new StringBuilder(string);
        result.replace(start, end, str);

        return result;
    }
}