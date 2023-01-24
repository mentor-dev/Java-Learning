### **The task to solve:**  

Зроби так, щоб програма компілювалася, не використовуючи `try-catch`.

---

### **Requirements:**  

• Метод main не повинен містити блок try-catch.  
• Метод main має кидати виняток.  
• Метод main має викликати метод generateLuckyNumber().  
• Метод generateLuckyNumber змінювати не можна.

---

### **Start code:**  

```java
public class Solution {

    public static void main(String[] args) {
        generateLuckyNumber();
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception("не пощастило");
        }
        System.out.println("твоє щасливе число: " + luckyNumber);
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {

    public static void main(String[] args) throws Exception {
        generateLuckyNumber();
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception("не пощастило");
        }
        System.out.println("твоє щасливе число: " + luckyNumber);
    }
}
```
