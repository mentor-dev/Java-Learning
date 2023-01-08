import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    private static final String HEX = "0123456789abcdef";
    private static final String REGEX_BIN = "[^01]";
    private static final String REGEX_HEX = "[^0-9a-f]";

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двійкове число " + binaryNumber +
                " дорівнює шістнадцятковому числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шістнадцяткове число " + hexNumber +
                " дорівнює двійковому числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.equals(""))
            return "";
        Pattern binPattern = Pattern.compile(REGEX_BIN);
        Matcher binMatcher = binPattern.matcher(binaryNumber);
        if (binMatcher.find())
            return "";
        String hexNumberString = "";

        // Add '0' to the begin if needed (to get sections of 4 bits each)
        while (binaryNumber.length() % 4 != 0) {
            binaryNumber = "0" + binaryNumber;
        }

        // Separate binaryNumber to sections of 4 bits
        for (int i = 0; i < binaryNumber.length(); i = i + 4) {
            String temp = binaryNumber.substring(i, i + 4);
            int decimalNumber = 0;
            for (int j = 0; j < 4; j++) {
                char charValue = temp.charAt(4 - 1 - j);
                if (charValue == 49)    // '1'
                    decimalNumber += Math.pow(2, j);
            }
            hexNumberString += HEX.charAt(decimalNumber);
        }

        return hexNumberString;
    }

    public static String toBinary(String hexNumber) {
        if (hexNumber == null || hexNumber.equals(""))
            return "";
        Pattern hexPattern = Pattern.compile(REGEX_HEX);
        Matcher hexMatcher = hexPattern.matcher(hexNumber);
        if (hexMatcher.find())
            return "";
        String binaryNumberString = "";

        for (int i = 0; i < hexNumber.length(); i++) {
            String fourBits = "";
            int decimalNumber = HEX.indexOf(hexNumber.charAt(i));
            if (decimalNumber != 0) {
                while (decimalNumber > 0) {
                    fourBits = decimalNumber % 2 + fourBits;
                    decimalNumber /= 2;
                }
                // Add '0' if necessary for 4 bits
                while (fourBits.length() != 4) {
                    fourBits = "0" + fourBits;
                }
            } else {
                fourBits = "0000";
            }
            binaryNumberString += fourBits;
        }
        
        return binaryNumberString;
    }
}