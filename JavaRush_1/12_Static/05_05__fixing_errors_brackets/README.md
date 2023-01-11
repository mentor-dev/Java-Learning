### **The task to solve:**  

Здається, цього разу теж маємо проблему з дужками. Але тепер з іншими. Виправ помилки в коді, щоб програма компілювалася й працювала.

---

### **Requirements:**  

• У методі main класу Solution потрібно виправити помилки компіляції.

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        int number = 1;
        if number < 5 {
            System.out.println("number < 5");
        } else {
            System.out.println;
        }
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static void main(String[] args) {
        int number = 1;
        if (number < 5) {
            System.out.println("number < 5");
        } else {
            System.out.println();
        }
    }
}
```
