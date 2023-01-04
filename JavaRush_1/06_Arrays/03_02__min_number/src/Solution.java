import java.util.Scanner;

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        int min = Integer.MAX_VALUE;
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = scan.nextInt();
            if (array[i] < min) {
                min = array[i];
            }
        }
        scan.close();
        System.out.println(min);
    }
}