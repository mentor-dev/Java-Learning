import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String line = console.nextLine();
        console.close();
        String newLine = line.toLowerCase();
        System.out.println(newLine);
    }
}