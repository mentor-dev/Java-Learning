### **The task to solve:**  

Публічний статичний метод `toHex(String)` має перетворювати рядкове подання двійкового числа, отримане як вхідний параметр, з двійкової системи числення в шістнадцяткову й повертати його рядкове подання. А публічний статичний метод `toBinary(String)` навпаки - має перетворювати рядкове подання шістнадцяткового числа на рядкове подання двійкового числа.

Методи діють тільки для непорожніх рядків.  
Якщо вхідний параметр - порожній рядок або `null`, обидва методи повертають порожній рядок.  
Якщо вхідний параметр методу `toHex(String)` містить символи, відмінні від `0` і `1`, метод повертає порожній рядок.  
Якщо вхідний параметр методу `toBinary(String)` містить символи, крім цифр `0`–`9` і малих латинських літер `a`–`f`, метод повертає порожній рядок.

Твоє завдання - реалізувати ці методи.

Нижче наведено один із алгоритмів перетворення рядкового подання двійкового числа на рядкове подання шістнадцяткового числа.

> Перевіряємо довжину рядка, отриманого як вхідний параметр. Вона має бути кратною `4`.  
Якщо це не так, слід додати на початку рядка потрібну кількість цифр `0`.  
По черзі перевіряємо кожні чотири символи (біти) на відповідність певному символу шістнадцяткового кодування.  

**Приклад:**  
двійкове подання - "`100111010000`", де "`1001`" - "`9`", "`1101`" - "`d`", "`0000`" - "`0`",  
шістнадцяткове подання - "`9d0`".

Нижче наведено один із алгоритмів перетворення рядкового подання шістнадцяткового числа на рядкове подання двійкового числа.

> По черзі перевіряємо кожний символ на відповідність двійковому числу (4 біти).

**Приклад:**  
шістнадцяткове подання - "`9d0`", де "`9`" - "`1001`", "`d`" - "`1101`", "`0`" - "`0000`",  
двійкове подання — "`100111010000`".

Метод `main()` у тестуванні не використовується.

---

### **Requirements:**  

• Потрібно реалізувати метод toHex(String) згідно з умовою.  
• Потрібно реалізувати метод toBinary(String) згідно з умовою.  
• Методи Integer.toBinaryString(int) і Long.toBinaryString(int) використовувати не можна.  
• Методи Integer.toHexString(int) і Long.toHexString(int) використовувати не можна.  
• Методи lnteger.parselnt(String, int) і Long.parseLong(String, int) використовувати не можна.  
• Методи lnteger.toString(int, int) і Long.toString(long, int) використовувати не можна.  
• Об'єкт типу Biglnteger використовувати не можна.  
• Об'єкт типу BigDecimal використовувати не можна.

---

### **Start code:**  

```java
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двійкове число " + binaryNumber + " дорівнює шістнадцятковому числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шістнадцяткове число " + hexNumber + " дорівнює двійковому числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        //напишіть тут ваш код
        return null;
    }

    public static String toBinary(String hexNumber) {
        //напишіть тут ваш код
        return null;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
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
```
