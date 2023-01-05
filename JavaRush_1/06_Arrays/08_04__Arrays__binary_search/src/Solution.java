import java.util.Arrays;

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;
                          
    public static void main(String[] args) {
        int[] tmp = Arrays.copyOf(array, array.length);
        Arrays.sort(tmp);
        System.out.println(Arrays.binarySearch(tmp, element) >= 0);
        // negative value if doesn't find
    }
}