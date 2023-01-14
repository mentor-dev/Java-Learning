### **The task to solve:**  

Програма порівнює два числа. Якщо перше число менше за друге, то в консоль виводиться повідомлення: `Перше число менше за друге`.  
Якщо перше число більше за друге або дорівнює йому, то в консоль виводиться повідомлення: `Перше число більше за друге або дорівнює йому`.  
Однак наразі програма завершується з помилкою. З'ясуй, що саме працює неправильно, і виправ помилку.  
Метод `main` у перевірці не використовується.

---

### **Requirements:**  

• Якщо перше число більше за друге, то метод isLess(int, int) має повертати false.  
• Якщо перше число менше за друге, то метод isLess(int, int) має повертати true.

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        int first = 2;
        int second = 1;

        Boolean isLess = isLess(first, second);

        if (isLess) {
            System.out.println("Перше число менше за друге");
        } else {
            System.out.println("Перше число більше за друге або дорівнює йому");
        }
    }

    public static Boolean isLess(int first, int second) {
        return first < second ? true : null;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static void main(String[] args) {
        int first = 2;
        int second = 1;

        Boolean isLess = isLess(first, second);

        if (isLess) {
            System.out.println("Перше число менше за друге");
        } else {
            System.out.println("Перше число більше за друге або дорівнює йому");
        }
    }

    public static Boolean isLess(int first, int second) {
        return first < second ? true : false;
    }
}
```
