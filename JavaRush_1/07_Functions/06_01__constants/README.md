### **The task to solve:**  

Поглянь, що робить програма. Розстав модифікатор `final` біля загальноприйнятих констант (змінних з незмінними значеннями).

---

### **Requirements:**  

• Модифікатор final має бути встановлено для всіх констант.

---

### **Start code:**  

```java
public class Solution {
    public static double pi = 3.14;
    public static double radius = 2.5;
    public static double diameter = 5;

    public static void main(String[] args) {
        System.out.println("Площа круга дорівнює : " + pi * radius * radius);
        System.out.println("Периметр круга дорівнює : " + pi * diameter);
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    final public static double pi = 3.14;
    public static double radius = 2.5;
    public static double diameter = 5;

    public static void main(String[] args) {
        System.out.println("Площа круга дорівнює : " + pi * radius * radius);
        System.out.println("Периметр круга дорівнює : " + pi * diameter);
    }
}
```
