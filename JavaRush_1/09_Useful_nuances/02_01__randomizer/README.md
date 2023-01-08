### **The task to solve:**  

У цій задачі тобі потрібно реалізувати метод `generateNumber()`, який повертатиме випадкове число від `0` до `99`.  
У методі `generateNumber()` використай метод `Math.random()`.

---

### **Requirements:**  

• Клас Solution має містити публічний статичний метод generateNumber(), який повертає значення типу int.  
• Реалізуй метод generateNumber() згідно з умовою.

---

### **Start code:**  

```java
public class Solution {

    public static void main(String[] args) {
        System.out.println(generateNumber());
    }

    public static int generateNumber() {
        //напишіть тут ваш код
        return  -1;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {

    public static void main(String[] args) {
        System.out.println(generateNumber());
    }

    public static int generateNumber() {
        return (int) (Math.random() * 100);
    }
}
```
