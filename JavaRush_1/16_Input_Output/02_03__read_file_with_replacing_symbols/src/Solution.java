import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            List<String> list = Files.readAllLines(Paths.get(scan.nextLine()));
            for (String string : list) {
                String clearString = string.replaceAll("[., ]", "");
                System.out.println(clearString);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }
    }
}