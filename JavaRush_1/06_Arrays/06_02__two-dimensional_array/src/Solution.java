import java.util.Scanner;

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        multiArray = new int[num][];
        for (int i = 0; i < num; i++) {
            int num1 = scan.nextInt();
            multiArray[i] = new int[num1];
        }
        scan.close();
    }
}