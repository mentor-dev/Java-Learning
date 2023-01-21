### **The task to solve:**  

У класі `Solution` реалізуй метод `getNextMonth`, який повинен повертати наступний місяць, а якщо передано останній місяць - повертати перший. Скористайся методами `values` і `ordinal`.  
Метод `main` у перевірці не використовується.

---

### **Requirements:**  

• Реалізуй метод public static Month getNextMonth(Month): він має працювати згідно з умовою.  
• У методі getNextMonth слід використовувати методи ordinal() и values().

---

### **Start code:**  

```java
public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }                      

    public static Month getNextMonth(Month month) {
        //напишіть тут ваш код
    }
}
```

```java
public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}
```

---

### **My solution: [Link](./src/)**  

```java
public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }                      

    public static Month getNextMonth(Month month) {
        if (month.ordinal() == Month.values().length - 1) {
            return Month.values()[0];
        } else {
            return Month.values()[month.ordinal() + 1];
        }
    }
}
```

```java
public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}
```
