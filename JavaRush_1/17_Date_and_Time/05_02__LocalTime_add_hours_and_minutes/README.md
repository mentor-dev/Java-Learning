### **The task to solve:**  

Цикл `while` у методі `main` має відпрацювати точно чотири рази, щоб на екран було виведено `4` рядки. Зміни можна вносити тільки в метод `amazingMethod`.

---

### **Requirements:**  

• Метод amazingMethod слід змінити так, щоб після запуску програма вивела 4 рядки.

---

### **Start code:**  

```java
import java.time.LocalTime;

public class Solution {

    public static void main(String[] args) throws InterruptedException {
        LocalTime localTime = LocalTime.MIDNIGHT;
        LocalTime next = amazingMethod(localTime);
        while (next.isAfter(localTime)) {
            System.out.println(next);
            next = amazingMethod(next);
            Thread.sleep(500);
        }                 
    }

    static LocalTime amazingMethod(LocalTime base) {
        return base.plusHours(3);
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.time.LocalTime;

public class Solution {

    public static void main(String[] args) throws InterruptedException {
        LocalTime localTime = LocalTime.MIDNIGHT;
        LocalTime next = amazingMethod(localTime);
        while (next.isAfter(localTime)) {
            System.out.println(next);
            next = amazingMethod(next);
            Thread.sleep(500);
        }                 
    }

    static LocalTime amazingMethod(LocalTime base) {
        return base.plusHours(4).plusMinutes(48);
    }
}
```
