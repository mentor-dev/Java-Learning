### **The task to solve:**  

Ініціалізуй шість статичних змінних: 
- у `timeMax` запиши максимально можливий час; 
- у `timeMin` запиши мінімально можливий час; 
- у `time1` запиши час `14` година рівно; 
- у `time2` запиши час `7` година `8` секунд; 
- у `time3` запиши час `0` годин `45` хвилин `61` наносекунда; 
- у `time4` запиши час `14` година `45` секунд `1001` наносекунда. 

У методі `main()` створи об'єкт `LocalTime`, використовуючи години з `time1 (time1.getHour())`, хвилини з `time2`, секунди з `time3`, наносекунди з `time4`. Виведи його в консоль.

---

### **Requirements:**  

• У класі Solution шість змінних мають бути ініціалізовані під час оголошення.  
• timeMax має бути ініціалізована максимально можливим часом.  
• timeMin має бути ініціалізована мінімально можливим часом.  
• timel має бути ініціалізована часом 14 година рівно.  
• time2 має бути ініціалізована часом 7 година 8 секунд.  
• time3 має бути ініціалізована часом 0 годин 45 хвилин 61 наносекунда.  
• time4 має бути ініціалізована часом 14 година 45 секунд 1001 наносекунда.  
• Результат виведення в консоль має відповідати умові.

---

### **Start code:**  

```java
import java.time.LocalTime;

public class Solution {

    static LocalTime timeMax;
    static LocalTime timeMin;
    static LocalTime time1;
    static LocalTime time2;
    static LocalTime time3;
    static LocalTime time4;

    public static void main(String[] args) {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.time.LocalTime;

public class Solution {

    static LocalTime timeMax = LocalTime.MAX;
    static LocalTime timeMin = LocalTime.MIN;
    static LocalTime time1 = LocalTime.of(14, 0);
    static LocalTime time2 = LocalTime.of(7, 0, 8);
    static LocalTime time3 = LocalTime.of(0, 45, 0, 61);
    static LocalTime time4 = LocalTime.of(14, 0, 45, 1001);

    public static void main(String[] args) {
        int hours = time1.getHour();
        int ninutes = time2.getMinute();
        int seconds = time3.getSecond();
        int nanos = time4.getNano();
        LocalTime time = LocalTime.of(hours, ninutes, seconds, nanos);
        System.out.println(time);
    }
}
```
