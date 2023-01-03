import java.util.Scanner;

public class Solution {

    public static int[] array;

    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = scan.nextInt();
            if (array[i] > max) {
                max = array[i];
            }
        }
        scan.close();
        System.out.println(max);
    }
}