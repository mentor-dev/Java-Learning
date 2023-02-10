### **The task to solve:**  

Ініціалізуй статичну змінну `dateTimeFormatter`.  
Подумай, який шаблон для неї задати, щоб можна було розпарсити рядок `timeString`.  
У методі `main` створи об'єкт `LocalDateTime`, використовуючи рядок `timeString` і твій шаблон `dateTimeFormatter`.

---

### **Requirements:**  

• Змінну dateTimeFormatter має бути ініціалізовано під час оголошення.  
• Метод main має створити об'єкт LocalDateTime, а для цього розпарсити рядок timeString за допомогою шаблону dateTimeFormatter.

---

### **Start code:**  

```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {

    static DateTimeFormatter dateTimeFormatter;
    static String timeString = "13:30:45 23/02/2019";

    public static void main(String[] args) {
        LocalDateTime dateTime;

        System.out.println(dateTime);
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {

    static final String PATTERN = "HH:mm:ss dd/MM/yyyy";
    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(PATTERN);
    static String timeString = "13:30:45 23/02/2019";

    public static void main(String[] args) {
        LocalDateTime dateTime;
        dateTime = LocalDateTime.parse(timeString, dateTimeFormatter);
        System.out.println(dateTime);
    }
}
```
