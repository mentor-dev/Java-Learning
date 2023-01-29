import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        scanner.close();
        try (DirectoryStream<Path> dir = Files.newDirectoryStream(sourceDirectory)) {
            for (Path path : dir) {
                if (Files.isRegularFile(path)) {
                    Path fileName = path.getFileName();
                    Path destFileName = targetDirectory.resolve(fileName);
                    Files.copy(path, destFileName);
                }
            }
        } catch (NoSuchFileException e) {
            System.out.println("Directory is not exists: " + e);
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        } 
    }
}