public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десяткове число " + decimalNumber +
                " дорівнює шістнадцятковому числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шістнадцяткове число " + hexNumber +
                " дорівнює десятковому числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        String hexNumber = "";
        while (decimalNumber > 0) {
            hexNumber = HEX.charAt(decimalNumber % 16) + hexNumber;
            decimalNumber /= 16;
        }
        return hexNumber;
    }

    public static int toDecimal(String hexNumber) {
        if (hexNumber == null || hexNumber.equals(""))
            return 0;
        int decimalNumber = 0;
        for (int i = 0; i < hexNumber.length(); i++) {
            int charValue = hexNumber.charAt(hexNumber.length() - i - 1);
            if (HEX.indexOf(charValue) < 0)
                return 0;
            decimalNumber += Math.pow(16, i) * HEX.indexOf(charValue);
        }
        return decimalNumber;
    }
}