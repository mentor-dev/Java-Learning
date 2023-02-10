### **The task to solve:**  

У методі `main` виведи на екран змінну `zonedDateTime` у такому вигляді:  
`4 9.3.19 06:03:07.319180500 Europe/Kiev`  
де:  
`4` - номер дня тижня, тобто четвер;  
`9` - день місяця;  
`3` - місяць;  
`19` - рік;  
`06` - години;  
`03` - хвилини;  
`07` - секунди;  
`319180500` - наносекунди;  
`Europe/Kiev` - часовий пояс.

---

### **Requirements:**  

• Метод main має вивести в консоль значення змінної zonedDateTime згідно із шаблоном.

---

### **Start code:**  

```java
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {

    static ZonedDateTime zonedDateTime = ZonedDateTime.now();
                         
    public static void main(String[] args) {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {

    static ZonedDateTime zonedDateTime = ZonedDateTime.now();
                         
    public static void main(String[] args) {
        final String PATTERN = "e d.M.yy HH:mm:ss.n VV";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(PATTERN);
        System.out.println(dtf.format(zonedDateTime));
    }
}
```
