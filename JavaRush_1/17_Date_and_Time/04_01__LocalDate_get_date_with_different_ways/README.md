### **The task to solve:**  

У класі `Solution` реалізуй `4` методи: - метод `nowExample` має повернути поточну дату; решта методів мають повернути дату `12 вересня 2020 року`, але різними способами.

---

### **Requirements:**  

• Метод nowExample має повернути поточну дату.  
• Метод ofExample має повернути дату 12 вересня 2020 року за допомогою методу LocalDate.of.  
• Метод ofYearDayExample має повернути дату 12 вересня 2020 року за допомогою методу LocalDate.ofYearDay.  
• Метод ofEpochDayExample має повернути дату 12 вересня 2020 року за допомогою методу LocalDate.ofEpochDay.

---

### **Start code:**  

```java
import java.time.LocalDate;

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        //напишіть тут ваш код

        return null;
    }

    static LocalDate ofExample() {
        //напишіть тут ваш код

        return null;
    }

    static LocalDate ofYearDayExample() {
        //напишіть тут ваш код

        return null;
    }

    static LocalDate ofEpochDayExample() {
        //напишіть тут ваш код

        return null;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.time.LocalDate;
import java.time.Month;

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        return LocalDate.now();
    }

    static LocalDate ofExample() {
        return LocalDate.of(2020, Month.SEPTEMBER, 12);
    }

    static LocalDate ofYearDayExample() {
        return LocalDate.ofYearDay(2020, 256);
    }

    static LocalDate ofEpochDayExample() {
        // System.out.println(LocalDate.of(2020, 9, 12).toEpochDay());
        return LocalDate.ofEpochDay(18517);
    }
}
```
