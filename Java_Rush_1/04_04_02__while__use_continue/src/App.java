public class App {
    public static void main(String[] args) throws Exception {
        int start_number = 1;
        int end_number = 100;
        int i = start_number - 1;
        int sum = 0;
        while (i < end_number) {
            i++;
            if (i % 3 != 0) {
                sum += i;
            } else {
                continue;
            }
        }
        System.out.println(sum);
    }
}
