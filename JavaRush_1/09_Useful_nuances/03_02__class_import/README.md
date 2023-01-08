### **The task to solve:**  

У класі `Solution` заміни в коді всі повні імена класів на короткі.

---

### **Requirements:**  

• У методі main мають бути тільки короткі імена класів: решту змінювати не можна.  
• Клас Solution має містити 3 імпорти.

---

### **Start code:**  

```java
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

public class Solution {
    public static void main(String[] args) {
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList<>();
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(java.lang.System.in);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

public class Solution {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
    }
}
```
