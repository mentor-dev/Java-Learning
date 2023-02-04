### **The task to solve:**  

Цикл `while` мав завершитися за `31` ітерацію, але чомусь програма зациклилася. Знайди та виправ помилку.

---

### **Requirements:**  

• Виправ одну помилку, щоб програма успішно завершилася.

---

### **Start code:**  

```java
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution {

    public static void main(String[] args) {
        Calendar start = new GregorianCalendar(2014, Calendar.JANUARY, 2);
        Calendar end = new GregorianCalendar(2014, Calendar.FEBRUARY, 2);

        System.out.print("Старт");
        while (start.before(end)) {
            start.roll(Calendar.DATE, 1);
            System.out.print(".");
        }
        System.out.print("Фініш");
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution {

    public static void main(String[] args) {
        Calendar start = new GregorianCalendar(2014, Calendar.JANUARY, 2);
        Calendar end = new GregorianCalendar(2014, Calendar.FEBRUARY, 2);

        System.out.print("Старт");
        while (start.before(end)) {
            start.add(Calendar.DATE, 1);
            System.out.print(".");
        }
        System.out.print("Фініш");
    }
}
```
