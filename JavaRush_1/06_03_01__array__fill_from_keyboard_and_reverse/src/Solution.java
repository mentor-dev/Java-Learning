import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[] arr;
        if (number > 0) {
            arr = new int[number];
            for (int i = 0; i < number; i++) {
                arr[i] = scan.nextInt();
            }
            scan.close();
        } else {
            scan.close();
            return;
        }
        if (number % 2 != 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        } else {
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
}
