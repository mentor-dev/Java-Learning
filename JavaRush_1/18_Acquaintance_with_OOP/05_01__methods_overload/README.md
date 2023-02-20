### **The task to solve:**  

У цій задачі тобі потрібно створити універсальний інструмент для пошуку мінімальних і максимальних чисел.  
У класі `MinMaxUtil` створи публічні статичні методи `min()` і `max()`, які отримують як аргументи цілочислові значення (тип `int`) і повертають відповідно мінімальне й максимальне з отриманих чисел.

Кожен із методів потрібно перевантажити, щоб створити можливість викликати метод із двома, трьома, чотирма і п'ятьма параметрами.
Загалом необхідно створити `8` методів - `4` для `min()` і `4` для `max()`.  
Усі аргументи методів мають бути типу `int`.

---

### **Requirements:**  

• У класі MinMaxUtil має бути створено 4 перевантажених методи min() відповідно до умови задачі.  
• У класі MinMaxUtil має бути створено 4 перевантажених методи max() відповідно до умови задачі.  
• Методи min() мають повертати мінімальне з переданих чисел.  
• Методи max() мають повертати максимальне з переданих чисел.

---

### **Start code:**  

```java
public class MinMaxUtil {
    //напишіть тут ваш код
}
```

---

### **My solution: [Link](./src/MinMaxUtil.java)**  

```java
public class MinMaxUtil {

    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    public static int min(int a, int b, int c, int d) {
        return Math.min(Math.min(a, b), Math.min(c, d));
    }

    public static int min(int a, int b, int c, int d, int e) {
        return Math.min(Math.min(Math.min(a, b), Math.min(c, d)), e);
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public static int max(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }

    public static int max(int a, int b, int c, int d, int e) {
        return Math.max(Math.max(Math.max(a, b), Math.max(c, d)), e);
    }
}
```
