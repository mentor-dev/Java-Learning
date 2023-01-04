import java.util.Scanner;

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        strings = new String[6];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            strings[i] = scan.nextLine();
        }
        scan.close();
        for (int i = 0; i < strings.length - 1; i++) {
            if (strings[i] == null) continue;
            String tmp = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[j] == null) continue;
                if (tmp.equals(strings[j])) {
                    strings[j] = null;
                    if (strings[i] != null) {
                        strings[i] = null;
                    }
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}