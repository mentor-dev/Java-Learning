### **The task to solve:**  

Виправ помилку так, щоб програма вивела "`2010-01-06`".  
Ініціалізацію змінної date не змінюй.

---

### **Requirements:**  

• Програма має вивести: 2010-01-06  
• Потрібно виправити одну помилку.

---

### **Start code:**  

```java
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {

    public static void main(String[] args) {
        Date date = new Date("6 January 2010");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
        System.out.println(formatter.format(date));
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {

    public static void main(String[] args) {
        Date date = new Date("6 January 2010");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(formatter.format(date));
    }
}
```
