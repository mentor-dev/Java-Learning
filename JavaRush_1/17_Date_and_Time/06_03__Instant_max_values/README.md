### **The task to solve:**  

У класі `Solution` реалізуй три методи:  
- у методі `getMaxFromMilliseconds` поверни максимальний `Instant`, який можна отримати за допомогою метод`у ofEpochMilli(long milliseconds)`;
- у методі `getMaxFromSeconds` поверни максимальний `Instant`, який можна отримати за допомогою методу `ofEpochSecond(long seconds)`; 
- у методі `getMaxFromSecondsAndNanos` поверни максимальний `Instant`, який можна отримати за допомогою методу `ofEpochSecond(long seconds, long nanos)`.

---

### **Requirements:**  

• Метод getMaxFromMilliseconds потрібно реалізувати згідно з умовою.  
• Метод getMaxFromSeconds потрібно реалізувати згідно з умовою.  
• Метод getMaxFromSecondsAndNanos потрібно реалізувати згідно з умовою.

---

### **Start code:**  

```java
import java.time.Instant;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        //напишіть тут ваш код

        return null;
    }

    static Instant getMaxFromSeconds() {
        //напишіть тут ваш код

        return null;
    }                      

    static Instant getMaxFromSecondsAndNanos() {
        //напишіть тут ваш код

        return null;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.time.Instant;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        return Instant.ofEpochMilli(Long.MAX_VALUE);
    }

    static Instant getMaxFromSeconds() {
        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond());
    }                      

    static Instant getMaxFromSecondsAndNanos() {
        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond(), 999_999_999);
    }
}
```
