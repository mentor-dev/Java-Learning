### **The task to solve:**  

Спробуй вивести на екран прямокутний трикутник із вісімок зі сторонами (катетами) `10` і `10`, використовуючи цикл `for`.  
Тобто в першому рядку має бути одна цифра `8` з лівого боку, у другому - дві і т. д.

Приклад виведення на екран:
```
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888
```

---

### **Requirements:**  

• Програма повинна виводити числа на екран.  
• Програма повинна виводити прямокутний трикутник із вісімок зі сторонами 10 і 10.  
• У програмі потрібно використовувати цикл for.  
• Виведення на екран повинно відбуватися в циклі for.  

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
    public static void main(String[] args) throws Exception {
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
```