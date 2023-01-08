### **The task to solve:**  

Реалізуй методи `sin(double)`, `cos(double)`, `tan(double)`, які повертають відповідно синус, косинус і тангенс кута, отриманого як параметр. Кут задано в градусах.  
У цьому тобі допоможуть відповідні методи класу `Math`, які отримують як параметр кут, заданий в радіанах.

---

### **Requirements:**  

• Реалізуй метод sin(double) згідно з умовою.  
• Реалізуй метод cos(double) згідно з умовою.  
• Реалізуй метод tan(double) згідно з умовою.

---

### **Start code:**  

```java
public class Solution {

    public static double sin(double a) {
        //напишіть тут ваш код
        return 0;
    }

    public static double cos(double a) {
        //напишіть тут ваш код
        return 0;
    }

    public static double tan(double a) {
        //напишіть тут ваш код
        return 0;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {

    public static double sin(double a) {
        return Math.sin(Math.toRadians(a));
    }

    public static double cos(double a) {
        return Math.cos(Math.toRadians(a));
    }

    public static double tan(double a) {
        return Math.tan(Math.toRadians(a));
    }
}
```
