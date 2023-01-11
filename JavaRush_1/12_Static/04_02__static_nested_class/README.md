### **The task to solve:**  

Виконай рефакторинг коду: вилучи з нього утилітні методи й перенеси їх в окремий клас.  
Для цього створи внутрішній статичний (вкладений) клас `Calculator` й перенеси в нього методи `add`, `subtract`, `multiply` і `divide`.  
Не забудь підправити виклики цих методів.

---

### **Requirements:**  

• У класі Solution потрібно створити вкладений (static nested) клас Calculator.  
• Методи add, subtract, multiply і divide потрібно перенести до класу Calculator.  
• Метод main має містити виклики методів add, subtract, multiply і divide класу Calculator.

---

### **Start code:**  

```java
public class Solution {
    public static final String EQUAL = " = ";

    public static void main(String[] args) {
        int a = 45;
        int b = 15;
        add(a, b);
        subtract(a, b);
        multiply(a, b);
        divide(a, b);
    }

    public static void add(int a, int b) {
        System.out.println(a + " + " + b + EQUAL + (a + b));
    }

    public static void subtract(int a, int b) {
        System.out.println(a + " - " + b + EQUAL + (a - b));
    }

    public static void multiply(int a, int b) {
        System.out.println(a + " * " + b + EQUAL + (a * b));
    }

    public static void divide(int a, int b) {
        System.out.println(a + " / " + b + EQUAL + (a / b));
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static final String EQUAL = " = ";

    public static void main(String[] args) {
        int a = 45;
        int b = 15;
        Calculator.add(a, b);
        Calculator.subtract(a, b);
        Calculator.multiply(a, b);
        Calculator.divide(a, b);
    }

    static class Calculator {
    
        public static void add(int a, int b) {
            System.out.println(a + " + " + b + EQUAL + (a + b));
        }
    
        public static void subtract(int a, int b) {
            System.out.println(a + " - " + b + EQUAL + (a - b));
        }
    
        public static void multiply(int a, int b) {
            System.out.println(a + " * " + b + EQUAL + (a * b));
        }
    
        public static void divide(int a, int b) {
            System.out.println(a + " / " + b + EQUAL + (a / b));
        }
    }
}
```
