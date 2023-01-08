### **The task to solve:**  

У класі `Solution` реалізуй метод `setTimer(int, int, int, int, int)`, який засинає на певний час. Для цього використовуй відповідні методи `java.util.concurrent.TimeUnit`.

---

### **Requirements:**  

• Метод setTimer(int, int, int, int, int) слід реалізувати згідно з умовою.

---

### **Start code:**  

```java
import java.util.concurrent.TimeUnit;

public class Solution {

    public static void setTimer(int days, int hours, int minutes, int seconds, int millis) throws InterruptedException {
        System.out.println("Таймер запущено!");
        //напишіть тут ваш код
        System.out.println("♬ ♪ ♬♬♬♬ ♪♪♪♪");
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.concurrent.TimeUnit;

public class Solution {

    public static void setTimer(int days, int hours, int minutes, int seconds, int millis) throws InterruptedException {
        System.out.println("Таймер запущено!");
        TimeUnit.DAYS.sleep(days);
        TimeUnit.HOURS.sleep(hours);
        TimeUnit.MINUTES.sleep(minutes);
        TimeUnit.SECONDS.sleep(seconds);
        TimeUnit.MILLISECONDS.sleep(millis);
        System.out.println("♬ ♪ ♬♬♬♬ ♪♪♪♪");
    }
}
```
