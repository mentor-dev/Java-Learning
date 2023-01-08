public class Solution {
    public static void main(String[] args) {
        String string = "Їхав мопед задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder result = new StringBuilder(string);
        result.reverse();
        
        return result.toString();
    }
}