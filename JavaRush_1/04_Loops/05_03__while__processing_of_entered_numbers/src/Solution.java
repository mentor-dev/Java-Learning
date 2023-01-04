import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int min_2 = Integer.MAX_VALUE;
        while (scan.hasNextInt()) {
            int num = scan.nextInt();
            if (num < min) {
                min_2 = min;
                min = num;
            } else if (num < min_2 && num != min) {
                min_2 = num;
            }
        }
        scan.close();
        System.out.print(min_2);
    }
}
