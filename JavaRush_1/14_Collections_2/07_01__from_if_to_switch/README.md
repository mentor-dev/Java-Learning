### **The task to solve:**  

У класі `Solution` є метод `getMonthByIndex(int)`, який повертає назву місяця за його номером починаючи з `1`. Твоє завдання - переписати метод, використовуючи тільки оператор `switch` і ключові слова `case`, `break` і `default`.

---

### **Requirements:**  

• Метод getMonthBylndex(int) має повертати назву місяця за його номером.  
• У методі getMonthBylndex(int) має використовуватися тільки оператор множинного вибору switch.

---

### **Start code:**  

```java
public class Solution {

    public static void main(String[] args) {
        System.out.println(getMonthByIndex(4));
        System.out.println(getMonthByIndex(8));
        System.out.println(getMonthByIndex(12));
    }

    public static String getMonthByIndex(int monthIndex) {
        String monthString;
        if (monthIndex == 1) {
            monthString = "Січень";
        } else if (monthIndex == 2) {
            monthString = "Лютий";
        } else if (monthIndex == 3) {
            monthString = "Березень";
        } else if (monthIndex == 4) {
            monthString = "Квітень";
        } else if (monthIndex == 5) {
            monthString = "Травень";
        } else if (monthIndex == 6) {
            monthString = "Червень";
        } else if (monthIndex == 7) {
            monthString = "Липень";
        } else if (monthIndex == 8) {
            monthString = "Серпень";
        } else if (monthIndex == 9) {
            monthString = "Вересень";
        } else if (monthIndex == 10) {
            monthString = "Жовтень";
        } else if (monthIndex == 11) {
            monthString = "Листопад";
        } else if (monthIndex == 12) {
            monthString = "Грудень";
        } else {
            monthString = "Неприпустимий місяць";
        }
        return monthString;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {

    public static void main(String[] args) {
        System.out.println(getMonthByIndex(4));
        System.out.println(getMonthByIndex(8));
        System.out.println(getMonthByIndex(12));
    }

    public static String getMonthByIndex(int monthIndex) {
        String monthString;
        switch (monthIndex) {
            case 1:
                monthString = "Січень";
                break;
            case 2:
                monthString = "Лютий";
                break;
            case 3:
                monthString = "Березень";
                break;
            case 4:
                monthString = "Квітень";
                break;
            case 5:
                monthString = "Травень";
                break;
            case 6:
                monthString = "Червень";
                break;
            case 7:
                monthString = "Липень";
                break;
            case 8:
                monthString = "Серпень";
                break;
            case 9:
                monthString = "Вересень";
                break;
            case 10:
                monthString = "Жовтень";
                break;
            case 11:
                monthString = "Листопад";
                break;
            case 12:
                monthString = "Грудень";
                break;
            default:
                monthString = "Неприпустимий місяць";
                break;
        }
        return monthString;
    }
}
```
