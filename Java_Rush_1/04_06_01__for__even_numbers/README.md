### **The task to solve:**  

Напиши програму, де за допомогою циклу `for` виводяться на екран парні числа від `1` до `15`.
Кожне значення потрібно вивести з нового рядка.

---

### **Requirements:**  

• Програма повинна виводити текст на екран.  
• Програма повинна виводити парні числа від 1 до 15. Кожне значення вивести з нового рядка.  
• У програмі потрібно використовувати цикл for.

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
```