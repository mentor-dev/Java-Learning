### **The task to solve:**  

У методі `main` присвой значення змінній `globalTime` із використанням змінних `localDateTime` і `zoneId`.

---

### **Requirements:**  

• Метод main має присвоїти значення змінній globalTime, використовуючи змінні localDateTime, zoneId.

---

### **Start code:**  

```java
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Solution {

    static LocalDateTime localDateTime = LocalDateTime.of(2020, 3, 19, 9, 17);
    static ZoneId zoneId = ZoneId.of("Zulu");
    static ZonedDateTime globalTime;
                        
    public static void main(String[] args) {
        //напишіть тут ваш код

        System.out.println(globalTime);
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Solution {

    static LocalDateTime localDateTime = LocalDateTime.of(2020, 3, 19, 9, 17);
    static ZoneId zoneId = ZoneId.of("Zulu");
    static ZonedDateTime globalTime;
                        
    public static void main(String[] args) {
        globalTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(globalTime);
    }
}
```
