public class Solution {
    public static void main(String[] args) throws Exception {
        String sign = "Q";
        int rows = 5;
        int columns = 10;
        int rows_ind = 0;
        while (rows_ind < rows) {
            int Columns_ind = 0;
            while (Columns_ind < columns) {
                System.out.print(sign);
                Columns_ind++;
            }
            if (rows_ind != (rows - 1))
                System.out.println();
            rows_ind++;
        }
    }
}