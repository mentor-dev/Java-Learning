public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює двійковому числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двійкове число " + binaryNumber + " дорівнює десятковому числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        String binaryNumber = "";
        while (decimalNumber > 0) {
            binaryNumber = decimalNumber % 2 + binaryNumber;
            decimalNumber /= 2;
        }
        return binaryNumber;
    }

    public static int toDecimal(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.equals(""))
            return 0;
        int decimalNumber = 0;
        for (int i = 0; i < binaryNumber.length(); i++) {
            int charValue = binaryNumber.charAt(binaryNumber.length() - i - 1);
            if (charValue == 49)                        // '1'
                decimalNumber += Math.pow(2, i);
            if (charValue != 49 && charValue != 48)     // '1' AND '0'
                return 0;
        }
        return decimalNumber;
    }
}