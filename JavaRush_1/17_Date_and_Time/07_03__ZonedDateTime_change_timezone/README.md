### **The task to solve:**  

Чи можна, знаючи час в одному часовому поясі, визначити час в іншому? Розв'яжи цю задачу в методі `changeZone`.  
Його параметри:  
`fromDateTime` - відомий час;  
`fromZone` - часовий пояс, для якого відомо час;  
`toZone` - часовий пояс, для якого потрібно визначити час.

---

### **Requirements:**  

• Метод changeZone має повернути LocalDateTime у часовому поясі toZone.

---

### **Start code:**  

```java
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Solution {

    public static void main(String[] args) {
        ZoneId zone1 = ZoneId.of("Zulu");
        ZoneId zone2 = ZoneId.of("Etc/GMT+8");
        System.out.println(ZonedDateTime.now(zone1));
        System.out.println(ZonedDateTime.now(zone2));

        LocalDateTime time = changeZone(LocalDateTime.of(2020, 3, 19, 1, 40), zone1, zone2);
        System.out.println(time);
    }

    static LocalDateTime changeZone(LocalDateTime fromDateTime, ZoneId fromZone, ZoneId toZone) {
        //напишіть тут ваш код

        return null;
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

    public static void main(String[] args) {
        ZoneId zone1 = ZoneId.of("Zulu");
        ZoneId zone2 = ZoneId.of("Etc/GMT+8");
        System.out.println(ZonedDateTime.now(zone1));
        System.out.println(ZonedDateTime.now(zone2));

        LocalDateTime time = changeZone(LocalDateTime.of(2020, 3, 19, 1, 40), zone1, zone2);
        System.out.println(time);
    }

    static LocalDateTime changeZone(LocalDateTime fromDateTime, ZoneId fromZone, ZoneId toZone) {
        ZonedDateTime fromZonedTime = ZonedDateTime.of(fromDateTime, fromZone);
        ZonedDateTime toZonedTime = fromZonedTime.withZoneSameInstant(toZone);
        return toZonedTime.toLocalDateTime();
    }
}
```
