### **The task to solve:**  

Спробуймо написати реалізацію калькулятора, який обчислюватиме степені чисел.  
Для цього створи метод `cube()`. Як аргумент він має отримувати цілочислове значення типу `long`.  
Метод має підносити отримане значення до третього степеня й повертати його як результат роботи методу.  
Числа, якими доведеться оперувати, можуть бути великими. Тому метод `cube()` має повертати тип `long`.

---

### **Requirements:**  

• Має бути створено метод public static long cube(long).  
• Метод cube() має повертати результат піднесення переданого йому числа до третього степеня.

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
    }

    //напишіть тут ваш код
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static void main(String[] args) {
        // System.out.println(cube(3));
    }

    public static long cube(long num) {
        return (num * num * num);
    }
}
```
