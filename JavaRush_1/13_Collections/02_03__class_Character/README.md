### **The task to solve:**  

Реалізуй методи `countDigits(String)`, `countLetters(String)`, `countSpaces(String)`, які мають повертати кількість цифр, літер і пробілів у рядку.  
Метод `main` у перевірці не використовується.

---

### **Requirements:**  

• Метод countDigits(String) має повертати кількість цифр у переданому рядку.  
• Метод countLetters(String) має повертати кількість літер у переданому рядку.  
• Метод countSpaces(String) має повертати кількість пробілів у переданому рядку.

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        String string = "Гадаю, це буде нова фіча." +
                "Тільки нікому не кажіть, що вона виникла випадково.";

        System.out.println("Кількість цифр у рядку : " + countDigits(string));
        System.out.println("Кількість літер у рядку : " + countLetters(string));
        System.out.println("Кількість пробілів у рядку : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        //напишіть тут ваш код
    }

    public static int countLetters(String string) {
        //напишіть тут ваш код
    }

    public static int countSpaces(String string) {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static void main(String[] args) {
        String string = "Гадаю, це буде нова фіча." +
                "Тільки нікому не кажіть, що вона виникла випадково.";

        System.out.println("Кількість цифр у рядку : " + countDigits(string));
        System.out.println("Кількість літер у рядку : " + countLetters(string));
        System.out.println("Кількість пробілів у рядку : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int result = 0;
        for (int i = 0; i < string.length(); i++) {
             if (Character.isDigit(string.charAt(i))) {
                result++;
            }
        }
        return result;
    }
    
    public static int countLetters(String string) {
        int result = 0;
        for (int i = 0; i < string.length(); i++) {
             if (Character.isLetter(string.charAt(i))) {
                result++;
            }
        }
        return result;
    }

    public static int countSpaces(String string) {
        int result = 0;
        for (int i = 0; i < string.length(); i++) {
             if (Character.isWhitespace(string.charAt(i))) {
                result++;
            }
        }
        return result;
    }
}
```
