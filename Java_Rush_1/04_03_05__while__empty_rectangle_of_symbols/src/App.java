public class App {
    public static void main(String[] args) {
        String sign_border = "Б";
        String sign_solid = " ";
        int rows = 10;
        int columns = 20;
        int rows_ind = 0;
        while (rows_ind < rows) {
            int columns_ind = 0;
            while (columns_ind < columns) {
                if (rows_ind == 0 || rows_ind == (rows - 1)) {
                    System.out.print(sign_border);
                } else {
                    if (columns_ind == 0 || columns_ind == (columns - 1)) {
                        System.out.print(sign_border);
                    } else {
                        System.out.print(sign_solid);
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
