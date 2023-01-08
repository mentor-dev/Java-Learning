import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int minNum = Integer.MAX_VALUE;
        for (int i : ints) {
            minNum = Math.min(i, minNum);
        }
        return minNum;
    }

    public static int[] getArrayOfTenElements() {
        int[] array = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();
        return array;
    }
}