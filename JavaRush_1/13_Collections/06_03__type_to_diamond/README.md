### **The task to solve:**  

У методі `main` створюються об'єкти різних типів. У деяких випадках тип елементів об'єкта можна випустити і просто використовувати оператор diamond(`<>`).  
Заміни тип елементів об'єкта на оператор `diamond` там, де це можливо, не змінюючи ліву частину виразів.  
Порядок розташування змінних не повинен змінюватися.

---

### **Requirements:**  

• Заміни тип елементів об'єкта на оператор diamond там, де це можливо.  
• Ліву частину виразів змінювати не можна.

---

### **Start code:**  

```java
import java.io.File;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<String>();
        Stack<String> stack = new Stack<String>();
        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        var exceptionsList = new ArrayList<Exception>();
        var filesStack = new Stack<File>();
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.io.File;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        Map<String, ArrayList<String>> map = new HashMap<>();
        var exceptionsList = new ArrayList<Exception>();
        var filesStack = new Stack<File>();
    }
}
```
