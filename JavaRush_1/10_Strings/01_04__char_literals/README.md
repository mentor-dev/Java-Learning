### **The task to solve:**  

У класі `Solution` оголошено чотири публічних символьних поля. Їм присвоєно певні значення. Проте програма не компілюється. Це потрібно виправити, не змінюючи значень символів.  
Усі поля статичні (`static`) - це потрібно для того, щоб отримати до них доступ у методі `main()`.  
Побачити результат можна, якщо запустити метод `main()`. Він у тестуванні не використовується.

---

### **Requirements:**  

• Змінній first слід присвоїти значення '\u004A'.  
• Змінній second слід присвоїти значення 'а'.  
• Змінній third слід присвоїти значення '\u0076'.  
• Змінній fourth слід присвоїти значення 'а'.

---

### **Start code:**  

```java
public class Solution {
    public static char first = 'u004A';
    public static char second = a;
    public static char third = "\u0076";
    public static char fourth = {a};

    public static void main(String[] args) {
        System.out.print(first);
        System.out.print(second);
        System.out.print(third);
        System.out.print(fourth);
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static char first = '\u004A';
    public static char second = 'a';
    public static char third = '\u0076';
    public static char fourth = 'a';

    public static void main(String[] args) {
        System.out.print(first);
        System.out.print(second);
        System.out.print(third);
        System.out.print(fourth);
    }
}
```
