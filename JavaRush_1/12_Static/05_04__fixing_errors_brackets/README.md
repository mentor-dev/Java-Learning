### **The task to solve:**  

Здається, маємо зайву дужку? Чи однієї бракує? Спробуй розібратися з цією проблемою.

---

### **Requirements:**  

• У методі main класу Solution потрібно вправити синтаксичні помилки.

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            System.out.println("Windows detected!");
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static void main(String[] args) {
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            System.out.println("Windows detected!");
        }
    }
}
```
