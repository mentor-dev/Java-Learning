### **The task to solve:**  

Проініціалізуй змінну `birthDate` об'єктом `Date` із датою свого народження. Реалізуй метод `getDayOfWeek(Date date)` так, щоб він повертав українську назву дня тижня з аргументу `date`.

---

### **Requirements:**  

• Змінну birthDate слід проініціалізувати під час оголошення.  
• Метод getDayOfWeek(Date date) має повертати українську назву дня тижня.

---

### **Start code:**  

```java
import java.util.Calendar;
import java.util.Date;

public class Solution {

    static Date birthDate;

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        //напишіть тут ваш код

        return null;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.Date;

public class Solution {

    static Date birthDate = new Date(84, 8, 11);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        final String[] DAYS = {"Неділя", "Понеділок", "Вівторок",
                "Середа", "Четвер", "П'ятниця", "Субота"};
        return DAYS[date.getDay()];
    }
}
```
