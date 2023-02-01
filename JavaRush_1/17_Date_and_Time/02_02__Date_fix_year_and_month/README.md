### **The task to solve:**  

Метод `fixDate` отримує як параметр список дат. Деякі з них містять дві типові помилки: неправильно зберігаються (і, отже, виводяться в консоль) рік і місяць. Тобто неправильна дата містить завжди дві помилки (рік і місяць), які тобі потрібно виправити в методі `fixDate`, враховуючи ці умови:
1. Якщо дата більша за поточну, в ній потрібно виправити ці дві помилки (рік і місяць) за допомогою методів `setYear`, `setMonth`. Рік задається з 1900, а місяці нумеруються з нуля.
2. Якщо дата менша за поточну, в ній нічого виправляти не потрібно.

Приклад дати з помилками:  
Має бути 25 грудня 2015 року, але насправді це інша дата.  
Можна подивитися виведення в консоль для цієї дати -  
`new Date(2015, 12, 25, 20, 40)`.

---

### **Requirements:**  

• Якщо дата більша за поточну, метод fixDate має виправити в ній рік і місяць.  
• Якщо дата менша за поточну, метод fixDate не повинен її змінювати.  
• Метод fixDate має перевіряти й виправляти всі дати зі списку brokenDates.

---

### **Start code:**  

```java
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<Date> dateList = new ArrayList<>();
        dateList.add(new Date(2015, 12, 25, 20, 40));
        dateList.add(new Date("July 20, 1969"));
        dateList.add(new Date(1989, 11, 9));
        dateList.add(new Date("January 1, 2000"));

        System.out.println("before fixes:");
        dateList.forEach(System.out::println);

        fixDate(dateList);

        System.out.println("after fixes:");
        dateList.forEach(System.out::println);
    }

    static void fixDate(List<Date> brokenDates) {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<Date> dateList = new ArrayList<>();
        dateList.add(new Date(2015, 12, 25, 20, 40));
        dateList.add(new Date("July 20, 1969"));
        dateList.add(new Date(1989, 11, 9));
        dateList.add(new Date("January 1, 2000"));

        System.out.println("before fixes:");
        dateList.forEach(System.out::println);

        fixDate(dateList);

        System.out.println("after fixes:");
        dateList.forEach(System.out::println);
    }

    static void fixDate(List<Date> brokenDates) {
        Date current = new Date();
        for (Date date : brokenDates) {
            if (date.after(current)) {
                date.setYear(date.getYear() - 1900);
                date.setMonth(date.getMonth() - 1);
            }
        }
    }
}
```
