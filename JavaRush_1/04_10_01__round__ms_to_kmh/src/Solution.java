import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int speed_ms = scan.nextInt();
        scan.close();
        int speed_kmh = (int) Math.round(speed_ms * 3.6);
        System.out.print(speed_kmh);
    }
}
