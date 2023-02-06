### **The task to solve:**  

Реалізуй метод `getDayOfWeek(LocalDate date)` так, щоб він повертав українську назву дня тижня з аргументу `date`.  
Скористайся методами `getDayOfWeek` і `getDisplayName`.  

Приклад параметрів методу `getDisplayName` для отримання української назви дня тижня:  
`getDisplayName(TextStyle.FULL, Locale.forLanguageTag("uk"))`

---

### **Requirements:**  

• Метод getDayOfWeek(LocalDate date) має повертати день тижня українською.  
• Щоб отримати назву дня тижня, потрібно використовувати методи getDayOfWeek і getDisplayName.

---

### **Start code:**  

```java
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Solution {

    static LocalDate birthDate = LocalDate.of(2020, 3, 12);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(LocalDate date) {
        //напишіть тут ваш код

        return null;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Solution {

    static LocalDate birthDate = LocalDate.of(2020, 3, 12);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(LocalDate date) {
        DayOfWeek day = date.getDayOfWeek();
        return day.getDisplayName(TextStyle.FULL, Locale.forLanguageTag("uk"));
    }
}
```
