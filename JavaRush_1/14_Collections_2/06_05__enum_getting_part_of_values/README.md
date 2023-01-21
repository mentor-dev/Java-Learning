### **The task to solve:**  

Додай в `enum Month` 4 методи: `getWinterMonths()`, `getSpringMonths()`, `getSummerMonths()` і `getAutumnMonths()`, які повертатимуть масив із трьома місяцями.

---

### **Requirements:**  

• Публічний статичний метод getWinterMonths() має повертати масив із зимовими місяцями.  
• Публічний статичний метод getSpringMonths() має повертати масив із весняними місяцями.  
• Публічний статичний метод getSummerMonths() повинен повертати масив із літніми місяцями.  
• Публічний статичний метод getAutumnMonths() повинен повертати масив з осінніми місяцями.

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

    //напишіть тут ваш код
}
```

---

### **My solution: [Link](./src/Month.java)**  

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
    DECEMBER;

    public static Month[] getWinterMonths() {
        return getMonths(11);
    }

    public static Month[] getSpringMonths() {
        return getMonths(2);
    }
    
    public static Month[] getSummerMonths() {
        return getMonths(5);
    }

    public static Month[] getAutumnMonths() {
        return getMonths(8);
    }

    public static Month[] getMonths(int start) {
        Month[] arrayMonths = new Month[3];
        for (int i = 0, index; i < 3; i++) {
            index = start + i;
            index = index <= 11 ? index : index - 12;
            arrayMonths[i] = Month.values()[index];
        }
        return arrayMonths;
    }
}
```
