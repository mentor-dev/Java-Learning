### **The task to solve:**  

Виправ методи класу `Solution`, використовуючи клас `Math`:  
`sqrt(double)` - має повертати квадратний корінь з переданого аргументу.  
`cbrt(double)` - має повертати кубічний корінь з переданого аргументу.  
`pow(int, int)` - має повертати значення першого аргументу, піднесеного до степеня, що визначається другим аргументом.  

---

### **Requirements:**  

• Реалізуй метод sqrt(double) згідно з умовою.  
• Реалізуй метод cbrt(double) згідно з умовою.  
• Реалізуй метод pow(int, int) згідно з умовою.

---

### **Start code:**  

```java
public class Solution {

    public static double sqrt(double a) {
        return a * a;
    }

    public static double cbrt(double a) {
        return a * a * a;
    }

    public static double pow(int number, int power) {
        if (power == 0) {
            return 1;
        }

        int modulus = power < 0 ? power * -1 : power;
        int result = number;
        for (int i = 1; i < modulus; i++) {
            result *= number;
        }
        return power < 0 ? 1.0 / result : result;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {

    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    public static double cbrt(double a) {
        return Math.cbrt(a);
    }

    public static double pow(int number, int power) {
        return Math.pow(number, power);
    }
}
```
