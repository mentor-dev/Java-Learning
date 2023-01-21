### **The task to solve:**  

Настав час розкрити всі карти і зрозуміти, як насправді працює `enum`. Тобі потрібно з `enum Month` зробити `class`, а також додати й реалізувати методи `ordinal()` і `values()`.

---

### **Requirements:**  

• Клас Month має бути в окремому файлі.  
• Клас Month повинен мати тільки один приватний конструктор з одним параметром типу int.  
• Клас Month має містити 12 констант типу Month.  
• У класі Month метод values() має повертати масив з усіма константами.  
• У класі Month метод ordinal() має повертати порядковий номер елемента(константи).  

---

### **Start code:**  

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

### **My solution: [Link](./src/Month.java)**  

```java
public class Month {

    public static final Month JANUARY = new Month(0);
    public static final Month FEBRUARY = new Month(1);
    public static final Month MARCH = new Month(2);
    public static final Month APRIL = new Month(3);
    public static final Month MAY = new Month(4);
    public static final Month JUNE = new Month(5);
    public static final Month JULY = new Month(6);
    public static final Month AUGUST = new Month(7);
    public static final Month SEPTEMBER = new Month(8);
    public static final Month OCTOBER = new Month(9);
    public static final Month NOVEMBER = new Month(10);
    public static final Month DECEMBER = new Month(11);

    public static final Month[] array = {JANUARY, FEBRUARY, MARCH, APRIL,
            MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};

    private final int value;

    private Month(int value) {
        this.value = value;
    }

    public static Month[] values() {
        return array;
    }

    public int ordinal() {
        return this.value;
    }
}
```
