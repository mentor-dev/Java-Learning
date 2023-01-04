public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                result[i][j] = i + j;
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(result[i][j]);
                if (j != i) {
                    System.out.print(" ");
                }
            }
            if (i < result.length - 1) {
                System.out.println();
            }
        }
    }
}