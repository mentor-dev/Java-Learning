import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        double pi = 3.14;
        int area = 0;
        Scanner scan = new Scanner(System.in);
        int radius = scan.nextInt();
        scan.close();
        area = (int) (pi * radius * radius);
        System.out.print(area);
    }
}
