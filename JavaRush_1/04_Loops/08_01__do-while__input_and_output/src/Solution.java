import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.next();
        int num = scan.nextInt();
        do {
            System.out.println(line);
            num--;
        } while (num > 0 && (num + 1) < 5);
        scan.close();
    }
}
