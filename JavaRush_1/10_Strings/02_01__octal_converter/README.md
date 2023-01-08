### **The task to solve:**  

Публічний статичний метод `toOctal(int)` має перетворювати ціле число, отримане як вхідний параметр, з десяткової системи числення у вісімкову. А публічний статичний метод `toDecimal(int)` навпаки - з вісімкової системи в десяткову.  
Методи діють лише для додатних чисел. Якщо вхідний параметр дорівнює або менший за `0`, методи повертають `0`.  
Твоє завдання - реалізувати ці методи.

Один із алгоритмів перетворення десяткового числа на вісімкове такий:  
```
i дорівнює 0
while (десяткове число не дорівнює 0) {
вісімкове число = вісімкове число + (остача від ділення десяткового числа на 8) * на 10 у степені i
десяткове число = десяткове число / 8
i збільшуємо на 1
}
```

Один із алгоритмів перетворення вісімкового числа на десяткове такий:
```
i дорівнює 0
while (вісімкове число не дорівнює 0) {
десяткове число = десяткове число + (остача від ділення вісімкового числа на 10) * на 8 у степені i
вісімкове число = вісімкове число / 10
i збільшуємо на 1
}
```

Метод `main()` у тестуванні не використовується.

**Підказка:** для піднесення числа до степеня можна скористатися методом `Math.pow(число, степінь)`.

---

### **Requirements:**  

• Потрібно реалізувати метод toOctal(int) згідно з умовою.  
• Потрібно реалізувати метод toDecimal(int) згідно з умовою.  
• Методи Integer.toOctalString(int) і Long.toOctalString(int) використовувати не можна.  
• Методи lnteger.parselnt(String, int) і Long.parseLong(String, int) використовувати не можна.  
• Методи lnteger.toString(int, int) і Long.toString(long, int) використовувати не можна.  
• Об'єкт типу Biglnteger використовувати не можна.  
• Об'єкт типу BigDecimal використовувати не можна.

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює вісімковому числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Вісімкове число " + octalNumber + " дорівнює десятковому числу " + toDecimal(octalNumber));
    }                     

    public static int toOctal(int decimalNumber) {
        //напишіть тут ваш код
        return 0;
    }

    public static int toDecimal(int octalNumber) {
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
        int decimalNumber = 21;
        System.out.println("Десяткове число " + decimalNumber +
                " дорівнює вісімковому числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Вісімкове число " + octalNumber +
                " дорівнює десятковому числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        int i = 0;
        int octalNumber = 0;
        while (decimalNumber > 0) {
            octalNumber += (decimalNumber % 8) * Math.pow(10, i);
            decimalNumber /= 8;
            i++;
        }
        return octalNumber;
    }

    public static int toDecimal(int octalNumber) {
        int i = 0;
        int decimalNumber = 0;
        while (octalNumber > 0) {
            decimalNumber += (octalNumber % 10) * Math.pow(8, i);
            octalNumber /= 10;
            i++;
        }
        return decimalNumber;
    }
}
```
