### **The task to solve:**  

Реалізуй метод `isWeekend`. Він має визначати, чи належить параметр `dateTime` до вихідних. Вважаємо вихідними проміжок між `22:00 п'ятниці` (включно) і `23:00 неділі` (не включно).

---

### **Requirements:**  

• Метод isWeekend має повернути true, якщо параметр dateTime потрапляє в заданий часовий проміжок.  
• Метод isWeekend має повернути false, якщо параметр dateTime не потрапляє в заданий часовий проміжок.

---

### **Start code:**  

```java
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    private static final int FRIDAY = 5;
    private static final int SATURDAY = 6;
    private static final int SUNDAY = 7;
    private static final int WEEKEND_START_FRIDAY_CUT_OFF_HOUR = 22;
    private static final int WEEKEND_END_SUNDAY_CUT_OFF_HOUR = 23;

    public static void main(String[] args) {
        List<LocalDateTime> dateTimeList = new ArrayList<>();
        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 18, 39));
        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 21, 59));
        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 22, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 23, 5, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 8, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 22, 59));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 23, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 25, 11, 5));

        for (LocalDateTime dateTime : dateTimeList) {
            System.out.println(dateTime + ", is weekend - " + isWeekend(dateTime));
        }

    }

    public static boolean isWeekend(LocalDateTime dateTime) {
        //напишіть тут ваш код

        return false;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    private static final int FRIDAY = 5;
    private static final int SATURDAY = 6;
    private static final int SUNDAY = 7;
    private static final int WEEKEND_START_FRIDAY_CUT_OFF_HOUR = 22;
    private static final int WEEKEND_END_SUNDAY_CUT_OFF_HOUR = 23;

    public static void main(String[] args) {
        List<LocalDateTime> dateTimeList = new ArrayList<>();
        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 18, 39));
        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 21, 59));
        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 22, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 23, 5, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 8, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 22, 59));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 23, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 25, 11, 5));

        for (LocalDateTime dateTime : dateTimeList) {
            System.out.println(dateTime + ", is weekend - " + isWeekend(dateTime));
        }

    }

    public static boolean isWeekend(LocalDateTime dateTime) {
        int day = dateTime.getDayOfWeek().getValue();
        int hour = dateTime.getHour();
        return ((day == FRIDAY && hour >= WEEKEND_START_FRIDAY_CUT_OFF_HOUR) || 
                 day == SATURDAY || 
                (day == SUNDAY && hour < WEEKEND_END_SUNDAY_CUT_OFF_HOUR));
    }
}
```
