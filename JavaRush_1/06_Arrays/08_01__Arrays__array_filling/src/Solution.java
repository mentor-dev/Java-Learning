import java.util.Arrays;

/* 
Заповнюємо масив
*/

public class Solution {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;
                         
    public static void main(String[] args) {
        int sepIndex;

        if (array.length % 2 == 0) {
            sepIndex = array.length / 2;
        } else {
            sepIndex = array.length / 2 + 1;
        }

        Arrays.fill(array, 0, sepIndex, valueStart);
        Arrays.fill(array, sepIndex, array.length, valueEnd);

        System.out.println(Arrays.toString(array));
    }
}