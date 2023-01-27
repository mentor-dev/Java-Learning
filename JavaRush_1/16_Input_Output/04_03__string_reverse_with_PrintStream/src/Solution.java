import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Solution {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        printSomething(scanner.nextLine());
        StringBuilder builder = new StringBuilder(outputStream.toString());
        outputStream.reset();
        builder.reverse();
        printSomething(builder.toString());
        String result = outputStream.toString();
        System.out.println(result);
    }

    public static void printSomething(String str) {
        stream.print(str);
    }
}