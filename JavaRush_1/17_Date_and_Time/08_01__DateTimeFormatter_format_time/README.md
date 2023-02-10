### **The task to solve:**  

У методі `main` виведи на екран змінну `localDateTime` у такому вигляді:  
`19.03.2020р. 5г.4хв` 

---

### **Requirements:**  

• Метод main має вивести в консоль значення змінної localDateTime згідно із шаблоном.

---

### **Start code:**  

```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {

    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {

    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        final String PATTERN = "dd.MM.yyyy'р'. H'г'.m'хв'";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(PATTERN);
        System.out.println(dtf.format(localDateTime));
    }
}
```
