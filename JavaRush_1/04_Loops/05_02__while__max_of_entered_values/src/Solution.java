import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int num;

        while (scan.hasNextInt()) {
            num = scan.nextInt();
            if ((num > max) && (num % 2 == 0)) {
                max = num;
            }
        }
        
        scan.close();
        
        if (max != Integer.MIN_VALUE) {
            System.out.print(max);
        }
    }
}
