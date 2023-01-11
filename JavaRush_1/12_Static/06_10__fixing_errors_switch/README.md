### **The task to solve:**  

Програма перетворює цифри на текст. Клас `Solution` містить статичний метод `digitToText(char)`, який повертає цифри у вигляді тексту. Метод `main` перетворює число на текст, але на екран виводиться тільки "дев'ять дев'ять ... ".  
Додай у метод `digitToText(char)` потрібну кількість операторів `break`, щоб він повертав правильне текстове подання цифри.  
Метод `main` у перевірці не використовується.

---

### **Requirements:**  

• Клас Solution має містити публічний статичний метод digitToText(char), який повертає значення типу String.  
• Метод digitToText(char) має повертати текстове подання відповідної цифри.

---

### **Start code:**  

```java
public class Solution {

    public static void main(String[] args) {
        String numberStr = "147852369";
        for (char symbol : numberStr.toCharArray()) {
            System.out.print(digitToText(symbol));
            System.out.print(" ");
        }
        System.out.println();
    }

    public static String digitToText(char digit) {
        String result = "";
        switch (digit) {
            case '0':
                result = "нуль";
            case '1':
                result = "один";
            case '2':
                result = "два";
            case '3':         
                result = "три";
            case '4':
                result = "чотири";
            case '5':
                result = "п'ять";
            case '6':
                result = "шість";
            case '7':
                result = "сім";
            case '8':
                result = "вісім";
            case '9':
                result = "дев'ять";
        }
        return result;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {

    public static void main(String[] args) {
        String numberStr = "147852369";
        for (char symbol : numberStr.toCharArray()) {
            System.out.print(digitToText(symbol));
            System.out.print(" ");
        }
        System.out.println();
    }

    public static String digitToText(char digit) {
        String result = "";
        switch (digit) {
            case '0':
                result = "нуль"; 
                break;
            case '1':
                result = "один";
                break;
            case '2':
                result = "два";
                break;
            case '3':         
                result = "три";
                break;
            case '4':
                result = "чотири";
                break;
            case '5':
                result = "п'ять";
                break;
            case '6':
                result = "шість";
                break;
            case '7':
                result = "сім";
                break;
            case '8':
                result = "вісім";
                break;
            case '9':
                result = "дев'ять";
        }
        return result;
    }
}
```
