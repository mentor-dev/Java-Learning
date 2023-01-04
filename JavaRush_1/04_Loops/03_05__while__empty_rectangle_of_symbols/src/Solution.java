public class Solution {
    public static void main(String[] args) {
        String symbol_border = "Б";
        String symbol_solid = " ";
        int rows = 10;
        int columns = 20;
        int rows_ind = 0;
        while (rows_ind < rows) {
            int columns_ind = 0;
            while (columns_ind < columns) {
                if (rows_ind == 0 || rows_ind == (rows - 1)) {
                    System.out.print(symbol_border);
                } else {
                    if (columns_ind == 0 || columns_ind == (columns - 1)) {
                        System.out.print(symbol_border);
                    } else {
                        System.out.print(symbol_solid);
                    }
                }
                columns_ind++;
            }
            if (rows_ind != (rows - 1))
                System.out.println();
            rows_ind++;
        }
    }
}