### **The task to solve:**  

У класі `Solution` реалізуй шість методів: 
- у методі `plusMinutes` потрібно збільшити параметр `instant` на `minutes` хвилин і повернути результат; 
- у методі `plusHours` потрібно збільшити параметр `instant` на `hours` годин і повернути результат; 
- у методі `plusDays` потрібно збільшити параметр `instant` на `days` днів і повернути результат; 
- у методі `minusMinutes` потрібно зменшити параметр `instant` на `minutes` хвилин і повернути результат; 
- у методі `minusHours` потрібно зменшити параметр `instant` на `hours` годин і повернути результат; 
- у методі `minusDays` потрібно зменшити параметр `instant` на `days` днів і повернути результат.

---

### **Requirements:**  

• Метод plusMinutes потрібно реалізувати згідно з умовою.  
• Метод plusHours потрібно реалізувати згідно з умовою.  
• Метод plusDays потрібно реалізувати згідно з умовою.  
• Метод minusMinutes потрібно реалізувати згідно умовою.  
• Метод minusHours потрібно реалізувати згідно з умовою.  
• Метод minusDays потрібно реалізувати згідно з умовою.

---

### **Start code:**  

```java
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Solution {

    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(10);
        System.out.println(instant);
        System.out.println(plusMinutes(instant, 2));
        System.out.println(plusHours(instant, 2));
        System.out.println(plusDays(instant, 2));
        System.out.println(minusMinutes(instant, 2));
        System.out.println(minusHours(instant, 2));
        System.out.println(minusDays(instant, 2));
    }
                              
    static public Instant plusMinutes(Instant instant, long minutes) {
        //напишіть тут ваш код
        return null;
    }

    static public Instant plusHours(Instant instant, long hours) {
        //напишіть тут ваш код
        return null;
    }

    static public Instant plusDays(Instant instant, long days) {
        //напишіть тут ваш код
        return null;
    }

    static public Instant minusMinutes(Instant instant, long minutes) {
        //напишіть тут ваш код
        return null;
    }

    static public Instant minusHours(Instant instant, long hours) {
        //напишіть тут ваш код
        return null;
    }

    static public Instant minusDays(Instant instant, long days) {
        //напишіть тут ваш код
        return null;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Solution {

    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(10);
        System.out.println(instant);
        System.out.println(plusMinutes(instant, 2));
        System.out.println(plusHours(instant, 2));
        System.out.println(plusDays(instant, 2));
        System.out.println(minusMinutes(instant, 2));
        System.out.println(minusHours(instant, 2));
        System.out.println(minusDays(instant, 2));
    }

    static public Instant plusMinutes(Instant instant, long minutes) {
        return instant.plus(minutes, ChronoUnit.MINUTES);
    }

    static public Instant plusHours(Instant instant, long hours) {
        return instant.plus(hours, ChronoUnit.HOURS);
    }

    static public Instant plusDays(Instant instant, long days) {
        return instant.plus(days, ChronoUnit.DAYS);
    }

    static public Instant minusMinutes(Instant instant, long minutes) {
        return instant.minus(minutes, ChronoUnit.MINUTES);
    }

    static public Instant minusHours(Instant instant, long hours) {
        return instant.minus(hours, ChronoUnit.HOURS);
    }

    static public Instant minusDays(Instant instant, long days) {
        return instant.minus(days, ChronoUnit.DAYS);
    }
}
```
