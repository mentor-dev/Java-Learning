### **The task to solve:**  

Проініціалізуй змінну `birthDate` об'єктом `GregorianCalendar` з датою свого народження.  
Реалізуй метод `getDayOfWeek(Calendar calendar)` так, щоб він повертав українську назву дня тижня з аргументу `calendar`.  
Пам'ятай, що у григоріанському календарі тиждень починається з неділі.

---

### **Requirements:**  

• Змінну birthDate слід проініціалізувати під час оголошення.  
• Метод getDayOfWeek(Calendar calendar) має повертати день тижня з аргументу calendar.

---

### **Start code:**  

```java
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution {

    static Calendar birthDate;

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        //напишіть тут ваш код

        return null;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1984, 8, 11);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        final String[] DAYS = {"Неділя", "Понеділок", "Вівторок",
                "Середа", "Четвер", "П'ятниця", "Субота"};
        return DAYS[calendar.get(Calendar.DAY_OF_WEEK) - 1];
    }
}
```
