import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String stop_word = "enough";
        Scanner scan = new Scanner(System.in);
        while (true) {
            String line = scan.nextLine();
            if (line.equals(stop_word)) {
                scan.close();
                break;
            }
            System.out.println(line);
        }
    }
}
