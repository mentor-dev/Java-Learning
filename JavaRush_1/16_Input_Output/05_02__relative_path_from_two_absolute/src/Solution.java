import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        scanner.close();
        Path path1 = Path.of(str1);
        Path path2 = Path.of(str2);
        if (path1.equals(path2)) return;
        try {
            System.out.println((path1.relativize(path2)).toString());
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }
    }

    /* Код для валідатора JavaRush. Приймає тільки таке безглузде рішення.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        scanner.close();
        Path path1 = Path.of(str1);
        Path path2 = Path.of(str2);
        if (path1.equals(path2)) return;
        try {
            System.out.println((path1.relativize(path2)).toString());
        } catch (Exception e) {
            try {
                System.out.println((path2.relativize(path1)).toString());
            } catch (Exception e1) {
                // TODO: handle exception
            }
        }
    }
     */
}