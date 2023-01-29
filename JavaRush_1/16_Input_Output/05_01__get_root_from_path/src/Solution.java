import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        Path path = Path.of(str);
        Path root = path.getRoot();
        System.out.println(root.toString());
    }
}