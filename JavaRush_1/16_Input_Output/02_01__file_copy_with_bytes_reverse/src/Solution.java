import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (Scanner scan = new Scanner(System.in);
            InputStream input = Files.newInputStream(Paths.get(scan.nextLine()));
            OutputStream out = Files.newOutputStream(Paths.get(scan.nextLine()))) {
            while (input.available() > 0) {
                if (input.available() > 1) {
                    int firstByte = input.read();
                    int secondByte = input.read();
                    out.write(secondByte);
                    out.write(firstByte);
                } else {
                    int firstByte = input.read();
                    out.write(firstByte);
                }
            }
        }
    }
}