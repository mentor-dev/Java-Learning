### **The task to solve:**  

У класі `Solution` є поле `balance`, яке описує баланс коштів на банківському рахунку. Під час оголошення проініціалізуй його значенням `Integer.MAX_VALUE`.  
Реалізуй метод `processPayment(String)`, який приймає чек і здійснює списання коштів з рахунку згідно з чеком.  
Метод `main` у перевірці не використовується.

---

### **Requirements:**  

• Поле balance має ініціалізуватися значенням lnteger.MAX_VALUE під час оголошення.  
• Метод processPayment(String) має зменшувати поле balance на значення переданого аргументу.

---

### **Start code:**  

```java
public class Solution {
    public static Integer balance;

    public static void main(String[] args) {
        String bill = "1234567890";

        System.out.println("Поточний баланс : " + balance);
        processPayment(bill);
        System.out.println("Поточний баланс : " + balance);
    }
                          
    public static void processPayment(String bill) {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static Integer balance = Integer.MAX_VALUE;

    public static void main(String[] args) {
        String bill = "1234567890";

        System.out.println("Поточний баланс : " + balance);
        processPayment(bill);
        System.out.println("Поточний баланс : " + balance);
    }
                          
    public static void processPayment(String bill) {
        balance -= Integer.parseInt(bill);
    }
}
```
