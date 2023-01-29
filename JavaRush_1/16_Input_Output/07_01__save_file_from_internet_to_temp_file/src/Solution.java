import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();
        URL url = new URL(line);
        Path filePath = Files.createTempFile(null, null);
        try (InputStream input = url.openStream()) {
            byte[] buffer = input.readAllBytes();
            Files.write(filePath, buffer);
        } 
    }
}