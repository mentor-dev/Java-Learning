### **The task to solve:**  

Метод `getIndexFromFirstWord(String, String)` і метод `getIndexFromLastWord(String, String)` отримують рядок і слово.  
Метод `getIndexFromFirstWord(String, String)` має повертати індекс першого символу першого шуканого **слова** (другий параметр методу) в **рядку** (перший параметр методу).  
А метод `getIndexFromLastWord(String, String)` має повертати індекс першого символу останнього шуканого **слова** (другий параметр методу) в **рядку** (перший параметр методу).

**Приклад:**  
рядок - "Щоб стати програмістом, потрібно писати код. Щоб писати код, потрібно вчитися. Для навчання потрібне бажання."  
слово - "код"

Метод `getIndexFromFirstWord`(рядок, слово) має повернути `40`  
Метод `getIndexFromLastWord`(строка, слово) має повернути `56`  
Метод `main()` у тестуванні не використовується.

---

### **Requirements:**  

• Потрібно вивести на екран індекс першого символу першого шуканого слова (другий параметр методу) в рядку (перший параметр методу).  
• Потрібно вивести на екран індекс першого символу останнього шуканого слова (другий параметр методу) в рядку (перший параметр методу).

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        String string = "Щоб стати програмістом, потрібно писати код. Щоб писати код, потрібно вчитися. Для навчання потрібне бажання.";
        String word = "код";
        int indexFromFirstWord = getIndexFromFirstWord(string, word);
        int indexFromLastWord = getIndexFromLastWord(string, word);
        System.out.println("Індекс першого символу першого слова \"" + word + "\" дорівнює " + indexFromFirstWord);
        System.out.println("Індекс першого символу останнього слова \"" + word + "\" дорівнює " + indexFromLastWord);
    }

    public static int getIndexFromFirstWord(String string, String word) {
        //напишіть тут ваш код
        return 0;
    }

    public static int getIndexFromLastWord(String string, String word) {
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
        String string = "Щоб стати програмістом, потрібно писати код. Щоб писати код, потрібно вчитися. Для навчання потрібне бажання.";
        String word = "код";
        int indexFromFirstWord = getIndexFromFirstWord(string, word);
        int indexFromLastWord = getIndexFromLastWord(string, word);
        System.out.println("Індекс першого символу першого слова \"" + word + "\" дорівнює " + indexFromFirstWord);
        System.out.println("Індекс першого символу останнього слова \"" + word + "\" дорівнює " + indexFromLastWord);
    }

    public static int getIndexFromFirstWord(String string, String word) {
        return string.indexOf(word);
    }

    public static int getIndexFromLastWord(String string, String word) {
        return string.lastIndexOf(word);
    }
}
```
