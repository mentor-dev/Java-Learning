### **The task to solve:**  

Публічний статичний метод `toHex(int)` має перетворювати ціле число, отримане як вхідний параметр, з десяткової системи числення у шістнадцяткову й повертати рядкове подання цього числа. А публічний статичний метод `toDecimal(String)` навпаки - має перетворювати рядкове подання шістнадцяткового числа на десяткове число.  
Методи діють лише для додатних чисел і непорожніх рядків. Якщо вхідний параметр дорівнює або менший за `0`, метод `toHex(int)` повертає порожній рядок. Якщо вхідний параметр - порожній рядок або `null`, метод `toDecimal(String)` повертає `0`.  
Твоє завдання - реалізувати ці методи.

Крім того, у класі `Solution` є константа `HEX`, яка містить усі символи, використовувані в шістнадцятковій системі.

Один із алгоритмів перетворення десяткового числа на шістнадцяткове такий:
```
while(десяткове число не дорівнює 0) {
рядкове подання шістнадцяткового числа = символ з рядка HEX з індексом, що дорівнює остачі від ділення десяткового числа на 16
+ рядкове подання шістнадцяткового числа
десяткове число = десяткове число / 16
}
```

Один із алгоритмів перетворення шістнадцяткового числа на десяткове такий:
```
for (int i = 0; i < довжина вхідного рядка; i++) {
десяткове число = 16 * десяткове число + індекс символу з рядка HEX, який співпадає із символом у вхідному рядку з індексом i
}
```

Метод `main()` у тестуванні не використовується.

---

### **Requirements:**  

• Потрібно реалізувати метод toHex(int) згідно з умовою.  
• Потрібно реалізувати метод toDecimal(String) згідно з умовою.  
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
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює шістнадцятковому числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шістнадцяткове число " + hexNumber + " дорівнює десятковому числу " + toDecimal(hexNumber));
    }
                           
    public static String toHex(int decimalNumber) {
        //напишіть тут ваш код
        return null;
    }

    public static int toDecimal(String hexNumber) {
        //напишіть тут ваш код
        return 0;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
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
        if (hexNumber == "" || hexNumber == null)
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
```
