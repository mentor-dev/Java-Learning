import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scan = new Scanner(System.in);
        boolean isOptimist = scan.nextBoolean();
        scan.close();
        int res = (int) (isOptimist ? Math.ceil(glass) : Math.floor(glass));
        System.out.println(res);
    }
}
