### **The task to solve:**  

Розстав оператори приведення типів у виразах так, щоб код компілювався.  
Змінювати типи змінних `a`, `b`, `c` і `d` не можна.

---

### **Requirements:**  

• Типи змінних а, Ь, с і d не повинні змінитися.  
• Під час присвоєння значення виразу має виконуватися приведення типу.

---

### **Start code:**  

```java
public class Solution {
    long a = 109 + 15;
    int b = a * 2;
    short c = a / b;
    byte d = a + b - c;
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    long a = 109 + 15;
    int b = (int) (a * 2);
    short c = (short) (a / b);
    byte d = (byte) (a + b - c);
}
```
