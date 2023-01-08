### **The task to solve:**  

За допомогою `StringTokenizer` розділи `query` на частини за роздільником `delimiter`.  

**Приклад:**  
`getTokens("com.javarush.task.pro.task09.task0915", "\\.")`  
повертає масив рядків  
`{"com", "javarush", "task", "pro", "task09", "task0915"}`

**Hint:** виришити задачу допоможе метод `countTokens()`.

---

### **Requirements:**  

• Метод getTokens(String, String) має використовувати клас StringTokenizer.  
• Метод getTokens(String, String) має повертати масив типу String, заповнений згідно з умовою задачі.

---

### **Start code:**  

```java
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        //напишіть тут ваш код
        return null;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        String[] result = new String[tokenizer.countTokens()];
        for (int i = 0; i < result.length; i++) {
            result[i] = tokenizer.nextToken();
        }

        return result;
    }
}
```
