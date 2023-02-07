### **The task to solve:**  

У методі `convert` потрібно перетворити `Map` на `Set`. Принцип перетворення: якщо в `sourceMap` було два таких елементи:  
`2018-05-31=[12:43:00.615424667, 08:35:29.212766273]`  
`1998-01-31=[07:56:59.931458499]`,  
то в результаті множина має містити три елементи:  
`2018-05-31T12:43:00.615424667`  
`2018-05-31T08:35:29.212766273`  
`1998-01-31T07:56:59.931458499`

---

### **Requirements:**  

• Метод convert має перетворити Мар на Set згідно з умовою.

---

### **Start code:**  

```java
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());

        Set<LocalDateTime> dateSet = convert(dateMap);
        printCollection(dateSet);
    }                       

    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
        //напишіть тут ваш код

        return null;
    }

    static void printCollection(Collection<?> collection) {
        System.out.println("-----------------------------------------------------");
        collection.forEach(System.out::println);
    }
}
```

```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class DateTimeGenerator {

    private static final long MIN_DAY = LocalDate.of(1990, 1, 1).toEpochDay();
    private static final long MAX_DAY = LocalDate.of(2020, 12, 31).toEpochDay();

    private static long maxNano = 86399999999999L;

    public static LocalDate generateDate() {
        long randomDay = ThreadLocalRandom.current().nextLong(MIN_DAY, MAX_DAY);
        return LocalDate.ofEpochDay(randomDay);
    }

    public static LocalTime generateTime() {
        long randomTime = ThreadLocalRandom.current().nextLong(0, maxNano);
        return LocalTime.ofNanoOfDay(randomTime);
    }

    public static List<LocalTime> generateTimeList() {
        List<LocalTime> timeList = new ArrayList<>();
        int size = ThreadLocalRandom.current().nextInt(1, 5);
        for (int i = 0; i < size; i++) {
            timeList.add(generateTime());
        }
        return timeList;
    }

    public static Map<LocalDate, List<LocalTime>> generateDateMap() {
        Map<LocalDate, List<LocalTime>> dateMap = new HashMap<>();
        int size = ThreadLocalRandom.current().nextInt(3, 7);
        for (int i = 0; i < size; i++) {
            dateMap.put(generateDate(), generateTimeList());
        }
        return dateMap;
    }
}
```

---

### **My solution: [Link](./src/)**  

```java
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());

        Set<LocalDateTime> dateSet = convert(dateMap);
        printCollection(dateSet);
    }                       

    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
        Set<LocalDateTime> resultSet = new HashSet<>();
        for (var pair : sourceMap.entrySet()) {
            LocalDate date = pair.getKey();
            List<LocalTime> list = pair.getValue();
            for (LocalTime listlTime : list) {
                LocalTime time = listlTime;
                LocalDateTime dateTime = LocalDateTime.of(date, time);
                resultSet.add(dateTime);
            }
        }
        return resultSet;
    }

    static void printCollection(Collection<?> collection) {
        System.out.println("-----------------------------------------------------");
        collection.forEach(System.out::println);
    }
}
```

```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class DateTimeGenerator {

    private static final long MIN_DAY = LocalDate.of(1990, 1, 1).toEpochDay();
    private static final long MAX_DAY = LocalDate.of(2020, 12, 31).toEpochDay();

    private static long maxNano = 86399999999999L;

    public static LocalDate generateDate() {
        long randomDay = ThreadLocalRandom.current().nextLong(MIN_DAY, MAX_DAY);
        return LocalDate.ofEpochDay(randomDay);
    }

    public static LocalTime generateTime() {
        long randomTime = ThreadLocalRandom.current().nextLong(0, maxNano);
        return LocalTime.ofNanoOfDay(randomTime);
    }

    public static List<LocalTime> generateTimeList() {
        List<LocalTime> timeList = new ArrayList<>();
        int size = ThreadLocalRandom.current().nextInt(1, 5);
        for (int i = 0; i < size; i++) {
            timeList.add(generateTime());
        }
        return timeList;
    }

    public static Map<LocalDate, List<LocalTime>> generateDateMap() {
        Map<LocalDate, List<LocalTime>> dateMap = new HashMap<>();
        int size = ThreadLocalRandom.current().nextInt(3, 7);
        for (int i = 0; i < size; i++) {
            dateMap.put(generateDate(), generateTimeList());
        }
        return dateMap;
    }
}
```
