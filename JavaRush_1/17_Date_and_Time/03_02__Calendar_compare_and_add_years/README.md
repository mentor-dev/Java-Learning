### **The task to solve:**  

У класі `Solution` константа `INVENTION_DAY` містить дату винаходу нового популярного гаджета - кишенькового телепорту.  
Реалізуй метод `isTeleportInvented`, який отримує як параметр дату й порівнює її з `INVENTION_DAY`.  
Якщо передана дата пізніша за дату винаходу, потрібно вивести напис: "`Будь ласка, можете забрати ваш кишеньковий телепорт. Дякуємо за очікування!`" - і повернути `true`.  
Якщо передана дата передує даті винаходи, вивести: "`Вибачте, телепорт іще не винайшли, приходьте через 10 років.`" - і повернути `false`.  
У методі `main` у циклі виклич `isTeleportInvented` і передай `currentDay` як параметр. Якщо метод повертає `false`, додай до `currentDay` `10` років, інакше - вийди з циклу.

---

### **Requirements:**  

• Метод isTeleportlnvented має вивести відповідний напис і повернути true, якщо передана дата більша за INVENTION.DAY.  
• Метод isTeleportlnvented має вивести відповідний напис і повернути false, якщо передана дата менша за INVENTION.DAY.  
• Щоразу, коли isTeleportlnvented повертає false, потрібно збільшувати currentDay на 10 років.  
• Метод isTeleportlnvented має викликатися доти, доки він не поверне true.

---

### **Start code:**  

```java
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution {

    public static final String INVENTED = "Будь ласка, можете забрати ваш кишеньковий телепорт. Дякуємо за очікування!";
    public static final String NOT_INVENTED = "Вибачте, телепорт іще не винайшли, приходьте через 10 років.";

    public static final Calendar INVENTION_DAY = new GregorianCalendar(2192, Calendar.JUNE, 12);

    public static void main(String[] args) {
        Calendar currentDay = Calendar.getInstance();
        //напишіть тут ваш код
    }

    static boolean isTeleportInvented(Calendar currentDay) {
        //напишіть тут ваш код

        return false;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution {

    public static final String INVENTED = "Будь ласка, можете забрати ваш кишеньковий телепорт. Дякуємо за очікування!";
    public static final String NOT_INVENTED = "Вибачте, телепорт іще не винайшли, приходьте через 10 років.";

    public static final Calendar INVENTION_DAY = new GregorianCalendar(2192, Calendar.JUNE, 12);

    public static void main(String[] args) {
        Calendar currentDay = Calendar.getInstance();
        while (isTeleportInvented(currentDay) == false) {
            currentDay.add(Calendar.YEAR, 10);
        }
    }

    static boolean isTeleportInvented(Calendar currentDay) {
        if (currentDay.before(INVENTION_DAY)) {
            System.out.println(NOT_INVENTED);
            return false;
        } else {
            System.out.println(INVENTED);
            return true;
        }
    }
}
```
