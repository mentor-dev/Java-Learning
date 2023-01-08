### **The task to solve:**  

Щоб розв'язати цю задачу, тобі належить у класі `MagicBall` реалізувати метод `getPrediction()`, який працюватиме як куля передбачень.  
«Куля» випадковим чином повертає фразу-відповідь на поставлене запитання. У методі `getPrediction()` потрібно використовувати метод `nextInt(int)` класу `Random`. Він має повертати значення від `0` до `7` включно.  
Залежно від результату роботи методу `nextInt(int)` повертається один з варіантів відповіді:  
`0` -> `Безперечно`  
`1` -> `Безумовно, так`  
`2` -> `Найймовірніше`  
`3` -> `Хороші перспективи`  
`4` -> `Запитай пізніше`  
`5` -> `Спробуй ще`  
`6` -> `Моя відповідь - ні`  
`7` -> `Вельми сумнівно`  
Інакше повернути `null`.  

---

### **Requirements:**  

• Реалізуй метод getPrediction() згідно з умовою.

---

### **Start code:**  

```java
public class Solution {

    public static void main(String[] args) {
        System.out.println("Чи зароблю я собі на BMW?");
        System.out.println(MagicBall.getPrediction());
    }
}
```

```java
import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Безперечно";
    private static final String DEFINITELY = "Безумовно, так";
    private static final String MOST_LIKELY = "Найймовірніше";
    private static final String OUTLOOK_GOOD = "Хороші перспективи";
    private static final String ASK_AGAIN_LATER = "Запитай пізніше";
    private static final String TRY_AGAIN = "Спробуй ще";
    private static final String NO = "Моя відповідь — ні";
    private static final String VERY_DOUBTFUL = "Вельми сумнівно";

    public static String getPrediction() {
        //напишіть тут ваш код
        return null;
    }
}
```

---

### **My solution: [Link](./src/)**  

```java
public class Solution {

    public static void main(String[] args) {
        System.out.println("Чи зароблю я собі на BMW?");
        System.out.println(MagicBall.getPrediction());
    }
}
```

```java
import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Безперечно";
    private static final String DEFINITELY = "Безумовно, так";
    private static final String MOST_LIKELY = "Найймовірніше";
    private static final String OUTLOOK_GOOD = "Хороші перспективи";
    private static final String ASK_AGAIN_LATER = "Запитай пізніше";
    private static final String TRY_AGAIN = "Спробуй ще";
    private static final String NO = "Моя відповідь — ні";
    private static final String VERY_DOUBTFUL = "Вельми сумнівно";

    public static String getPrediction() {
        Random rand = new Random();
                
        switch (rand.nextInt(8)) {
            case 0:
                return CERTAIN;
            case 1:
                return DEFINITELY;
            case 2:
                return MOST_LIKELY;
            case 3:
                return OUTLOOK_GOOD;
            case 4:
                return ASK_AGAIN_LATER;
            case 5:
                return TRY_AGAIN;
            case 6:
                return NO;
            case 7:
                return VERY_DOUBTFUL;
            default:
                return null;
        }
    }
}
```
