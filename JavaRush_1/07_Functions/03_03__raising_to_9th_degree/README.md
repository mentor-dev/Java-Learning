### **The task to solve:**  

Калькулятором, який вміє підносити число до третього степеня, нікого не здивуєш.  
Калькулятор, який може піднести число до дев'ятого степеня, - інша річ! Так реалізуймо його!  
Для цього створи метод `public static long ninthDegree(long)`.
Як аргумент він має отримувати цілочислове значення типу `long`.
Метод має підносити отримане значення до дев'ятого степеня й повертати його як результат роботи методу.  
Зі шкільного курсу арифметики відомо: щоб отримати дев'ятий степінь, потрібно піднести число до третього степеня, а відтак отриманий результат іще раз піднести до третього степеня.
Скористаймося цим правилом у нашій програмі.  
У методі `ninthDegree()` піднеси переданий аргумент до третього степеня за допомогою методу `cube()`; отриманий результат знову передай у метод `cube()`. Кінцевий результат поверни як результат роботи методу.

---

### **Requirements:**  

• Має бути створено метод public static long ninthDegree(long).  
• Метод ninthDegree() має повертати результат піднесення переданого йому числа до дев'ятого степеня.  
• Метод ninthDegree() має використовувати метод cubeQ для послідовного піднесення чисел до куба.

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
    }

    public static long cube(long a){
        return a*a*a;   
    }

    //напишіть тут ваш код
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println(ninthDegree(3));
    }

    public static long cube(long a){
        return a*a*a;   
    }

    public static long ninthDegree(long num) {
        return cube(cube(num));
    }
}
```
