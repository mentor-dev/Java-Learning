### **The task to solve:**  

У класі `Solution` заміни в коді всі короткі імена класів на повні.

---

### **Requirements:**  

• У методі main мають бути тільки повні імена класів решту змінювати не можна.  
• Клас Solution не повинен містити імпортів.

---

### **Start code:**  

```java
import java.io.BufferedReader;
import java.io.StringReader;
import java.math.BigInteger;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<java.lang.String> arrayList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new StringReader(""));
        BigInteger bigInteger = new BigInteger("123");
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static void main(java.lang.String[] args) {
        java.util.ArrayList<String> arrayList = new java.util.ArrayList<>();
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.StringReader(""));
        java.math.BigInteger bigInteger = new java.math.BigInteger("123");
    }
}
```
