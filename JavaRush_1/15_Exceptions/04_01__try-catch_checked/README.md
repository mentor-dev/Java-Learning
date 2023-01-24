### **The task to solve:**  

Перехопи виняток у методі `main`, щоб програма компілювалася.  
У разі виникнення винятку потрібно вивести на екран рядок `errorMessage`.

---

### **Requirements:**  

• У метод main потрібно додати блок try-catch.  
• Метод main не повинен кидати винятки, що перевіряються.  
• Метод main має викликати метод generateLuckyNumber.  
• Метод generateLuckyNumber змінювати не можна.  
• У разі виникнення винятку в методі main потрібно вивести на екран рядок errorMessage.

---

### **Start code:**  

```java
public class Solution {

    public static String errorMessage = "не пощастило";

    public static void main(String[] args) {
        generateLuckyNumber();
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception();
        }
        System.out.println("твоє щасливе число: " + luckyNumber);
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {

    public static String errorMessage = "не пощастило";

    public static void main(String[] args) {
        try {
            generateLuckyNumber();
        } catch (Exception e) {
            System.out.println(errorMessage);
        }
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception();
        }
        System.out.println("твоє щасливе число: " + luckyNumber);
    }
}
```
