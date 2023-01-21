### **The task to solve:**  

У класі `Solution` є метод `getTranslationForDayOfWeek(String)`, який повертає переклад назви дня тижня з української на англійську. Твоє завдання - переписати метод, використовуючи тільки оператор `if-else`.

---

### **Requirements:**  

• Метод getTranslationForDayOfWeek(String) має повертати переклад назви дня тижня з української на англійську.  
• У методі getTranslationForDayOfWeek(String) має використовуватися тільки оператор if-else.

---

### **Start code:**  

```java
public class Solution {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Вівторок"));
        System.out.println(getTranslationForDayOfWeek("П'ятниця"));
        System.out.println(getTranslationForDayOfWeek("Нічогонеділя"));
    }

    public static String getTranslationForDayOfWeek(String ua) {
        String en;
        switch (ua.toLowerCase()) {
            case "понеділок":
                en = "Monday";
                break;
            case "вівторок":
                en = "Tuesday";
                break;
            case "середа":
                en = "Wednesday";
                break;
            case "четвер":
                en = "Thursday";
                break;
            case "п'ятниця":
                en = "Friday";
                break;
            case "субота":
                en = "Saturday";
                break;
            case "неділя":
                en = "Sunday";
                break;
            default:
                en = "Неприпустимий день тижня";
        }
        return en;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Вівторок"));
        System.out.println(getTranslationForDayOfWeek("П'ятниця"));
        System.out.println(getTranslationForDayOfWeek("Нічогонеділя"));
    }

    public static String getTranslationForDayOfWeek(String ua) {
        String en;
        if (ua.equalsIgnoreCase("понеділок")) {
            en = "Monday";
        } else if (ua.equalsIgnoreCase("вівторок")) {
            en = "Tuesday";
        } else if (ua.equalsIgnoreCase("середа")) {
            en = "Wednesday";
        } else if (ua.equalsIgnoreCase("четвер")) {
            en = "Thursday";
        } else if (ua.equalsIgnoreCase("п'ятниця")) {
            en = "Friday";
        } else if (ua.equalsIgnoreCase("субота")) {
            en = "Saturday";
        } else if (ua.equalsIgnoreCase("неділя")) {
            en = "Sunday";
        } else {
            en = "Неприпустимий день тижня";
        }
        return en;
    }
}
```
