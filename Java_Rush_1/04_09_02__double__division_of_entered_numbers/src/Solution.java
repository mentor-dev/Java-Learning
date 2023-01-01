import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        double res;
        Scanner scan = new Scanner(System.in);
        int cups = scan.nextInt();
        int people = scan.nextInt();
        scan.close();
        res = 1.0 * cups / people;
        System.out.print(res);
    }
}
