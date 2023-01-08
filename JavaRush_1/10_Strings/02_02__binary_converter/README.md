### **The task to solve:**  

Публічний статичний метод `toBinary(int)` має перетворювати ціле число, отримане як вхідний параметр, з десяткової системи числення у двійкову й повертати рядкове подання цього числа. А публічний статичний метод `toDecimal(String)` навпаки - має перетворювати рядкове подання двійкового числа на десяткове число.  
Методи діють лише для додатних чисел і непорожніх рядків. Якщо вхідний параметр дорівнює або менший за `0`, метод `toBinary(int)` повертає порожній рядок. Якщо вхідний параметр - порожній рядок або `null`, метод `toDecimal(String)` повертає `0`.
Твоє завдання - реалізувати ці методи.

Один із алгоритмів перетворення десяткового числа на рядкове подання двійкового числа такий:
```
while(десяткове число не дорівнює 0) {
двійкове подання = остача від ділення десяткового числа на 2 + двійкове подання
десяткове число = десяткове число / 2
}
```

Один із алгоритмів перетворення рядкового подання двійкового числа на десяткове число такий:
```
for (int i = 0; i < довжина двійкового подання; i++) {
десяткове число = десяткове число + число з двійкового подання * на 2 в степені i
}
```

Спочатку беремо крайнє праве число з двійкового подання. На кожній ітерації циклу беремо наступне число ближче до початку двійкового подання.

**Підказка:** для піднесення числа до степеня можна скористатися методом `Math.pow(число, степінь)`.  

Метод `main()` у тестуванні не використовується.

---

### **Requirements:**  

• Потрібно реалізувати метод toBinary(int) згідно з умовою.  
• Потрібно реалізувати метод toDecimal(String) згідно з умовою.  
• Методи Integer.toBinaryString(int) і Long.toBinaryString(int) використовувати не можна.  
• Методи lnteger.parselnt(String, int) і Long.parseLong(String, int) використовувати не можна.  
• Методи lnteger.toString(int, int) і Long.toString(long, int) використовувати не можна.  
• Об'єкт типу Biglnteger використовувати не можна.  
• Об'єкт типу BigDecimal використовувати не можна.

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює двійковому числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двійкове число " + binaryNumber + " дорівнює десятковому числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        //напишіть тут ваш код
        return null;
    }
                         
    public static int toDecimal(String binaryNumber) {
        //напишіть тут ваш код
        return 0;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десяткове число " + decimalNumber +
                " дорівнює двійковому числу " + toBinary(decimalNumber));
        String binaryNumber = "111111111111111111111111111111";
        System.out.println("Двійкове число " + binaryNumber +
                " дорівнює десятковому числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        String binaryNumber = "";
        while (decimalNumber > 0) {
            binaryNumber += decimalNumber % 2;
            decimalNumber /= 2;
        }
        return binaryNumber;
    }

    public static int toDecimal(String binaryNumber) {
        if (binaryNumber == "" || binaryNumber == null)
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
```
