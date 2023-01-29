import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {

    private static final String THIS_IS_FILE = " - це файл";
    private static final String THIS_IS_DIR = " - це директорія";
                         
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Path path;
            do {
                path = Path.of(scan.nextLine());
                if (Files.exists(path) && Files.isRegularFile(path)) {
                    System.out.println(path.toString() + THIS_IS_FILE);
                } else if (Files.exists(path) && Files.isDirectory(path)) {
                    System.out.println(path.toString() + THIS_IS_DIR);
                }
            } while (Files.exists(path));
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }
    }
}