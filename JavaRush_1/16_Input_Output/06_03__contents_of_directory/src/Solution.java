import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {

    private static final String THIS_IS_FILE = " - це файл";
    private static final String THIS_IS_DIR = " - це директорія";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path directory = Path.of(scanner.nextLine());
        try (DirectoryStream<Path> dir = Files.newDirectoryStream(directory)) {
            for (Path path : dir) {
                if (Files.isRegularFile(path)) {
                    System.out.println(path.toString() + THIS_IS_FILE);
                } else if (Files.isDirectory(path)) {
                    System.out.println(path.toString() + THIS_IS_DIR);
                }
            }
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }
    }
}