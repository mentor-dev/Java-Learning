### **The task to solve:**  

У класі `Solution` є метод `print(HashSet<String>)`, який має виводити в консоль усі елементи множини, використовуючи `iterator()`.  
Метод `main` у перевірці не використовується.

---

### **Requirements:**  

• Клас Solution має містити публічний статичний метод print(HashSet\<String\>), який не повертає жодного значення (тип void).  
• Метод print(HashSet\<String\>) має працювати згідно з умовою.

---

### **Start code:**  

```java
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Solution {

    public static void print(HashSet<String> words) {
        //напишіть тут ваш код
    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Програмування зазвичай навчають на прикладах.".split(" ")));
        print(words);
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Solution {

    public static void print(HashSet<String> words) {
        Iterator<String> ir = words.iterator();
        while (ir.hasNext()) {
            System.out.println(ir.next());
        }
    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Програмування зазвичай навчають на прикладах.".split(" ")));
        print(words);
    }
}
```
