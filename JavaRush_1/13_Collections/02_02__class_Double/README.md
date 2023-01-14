### **The task to solve:**  

Реалізуй метод `divide(double a, double b)` так, щоб у консоль виводився результат ділення числа `a` на число `b`.  

Має бути виведено таке значення:  

1. `Double.POSITIVE_INFINITY`, якщо істинне будь-яке з таких тверджень:  
    - `a` додатне і `b` дорівнює `0`;  
    - `a` дорівнює `Double.POSITIVE_INFINITY` і `b` >= `0` і `b` не дорівнює `Double.POSITIVE_INFINITY`;  
    - `a` дорівнює `Double.NEGATIVE_INFINITY` і `b` < `0` і `b` не дорівнює `Double.NEGATIVE_INFINITY`;  

2. `Double.NEGATIVE_INFINITY`, якщо істинне будь-яке з таких тверджень:  
    - `a` від'ємне і `b` дорівнює `0`;
    - `a` дорівнює `Double.NEGATIVE_INFINITY` і `b` >= `0` і `b` не дорівнює `Double.POSITIVE_INFINITY`;
    - `a` дорівнює `Double.POSITIVE_INFINITY` і `b` < `0` і `b` не дорівнює `Double.NEGATIVE_INFINITY`;

3. `Double.NaN`, якщо істинне будь-яке з таких тверджень:  
    - `a` дорівнює `0` і `b` дорівнює `0`;
    - принаймні один із операндів дорівнює `Double.NaN`;
    - `a` дорівнює `Double.POSITIVE_INFINITY` і `b` дорівнює `Double.POSITIVE_INFINITY`;
    - `a` дорівнює `Double.POSITIVE_INFINITY` і `b` дорівнює `Double.NEGATIVE_INFINITY`;
    - `a` дорівнює `Double.NEGATIVE_INFINITY` і `b` дорівнює `Double.POSITIVE_INFINITY`;
    - `a` дорівнює `Double.NEGATIVE_INFINITY` і `b` дорівнює `Double.NEGATIVE_INFINITY`;

4. Інакше - виводити результат ділення `a` на `b`.

---

### **Requirements:**  

• Метод divide(double a, double b) має виводити в консоль результат ділення числа а на число Ь.  
• Метод divide(double a, double b) має виводити в консоль "Infinity" згідно з пунктом 1 умови.  
• Метод divide(double a, double b) має виводити в консоль "-Infinity" згідно з пунктом 2 умови.  
• Метод divide(double a, double b) має виводити в консоль "NaN" згідно з пунктом 3 умови.

---

### **Start code:**  

```java
public class Solution {

    public static void main(String[] args) {
        divide(1, 0);
        divide(-1, 0);
        divide(0, 0);
        divide(100, 20);
        divide(200, 20);
    }

    public static void divide(double a, double b) {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {

    public static void main(String[] args) {
        divide(1, 0);
        divide(-1, 0);
        divide(0, 0);
        divide(100, 20);
        divide(200, 20);
    }

    public static void divide(double a, double b) {
        System.out.println(a / b);
    }
}
```
