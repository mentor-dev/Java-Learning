### **The task to solve:**  

Що спільного у всіх часових зон і Пекіна? Правильно! Вони дадуть нам змогу потренуватися у використанні класів `ZoneId` і `ZonedDateTime` :)  

Реалізуй два методи: 
- у методі `getSortedZones` поверни множину `TreeSet` усіх часових зон; 
- у методі `getBeijingTime` поверни поточний час у Пекіні (часова зона для нього - `"Asia/Shanghai"`).

---

### **Requirements:**  

• Метод getSortedZones має повернути множину всіх часових зон.  
• Метод getBeijingTime має повернути поточну дату і час у Пекіні.

---

### **Start code:**  

```java
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

public class Solution {

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());
        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        //напишіть тут ваш код
        return null;
    }

    static ZonedDateTime getBeijingDateTime() {
        //напишіть тут ваш код
        return null;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
import java.util.TreeSet;

public class Solution {

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());
        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        Set<String> zones = ZoneId.getAvailableZoneIds();
        return new TreeSet<>(zones);
    }

    static ZonedDateTime getBeijingDateTime() {
        ZoneId zone = ZoneId.of("Asia/Shanghai");
        return ZonedDateTime.now(zone);
    }
}
```
