import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (Scanner scan = new Scanner(System.in)) {
            List<String> list = Files.readAllLines(Path.of(scan.nextLine()));
            for (int i = 0; i < list.size(); i++) {
                if (i % 2 == 0) {
                    System.out.println(list.get(i));
                }
            }
        }
    }
}