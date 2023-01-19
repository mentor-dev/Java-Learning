### **The task to solve:**  

У класі Solution оголошено методи: `copy(ArrayList<String>, ArrayList<String>)`, `addAll(ArrayList<String>, String...)`, `replaceAll(ArrayList<String>, String, String)`.  
Ти маєш переписати їхній код, використовуючи тільки відповідні методи класу `Collections`.  
Параметр `String...` означає те саме, що й `String[]`, тільки аргументи `String` можна передавати через кому.

---

### **Requirements:**  

• Клас Solution має містити публічний статичний метод copy(ArrayList\<String\>, ArrayList\<String\>), який не повертає жодного значення (тип void).  
• Клас Solution має містити публічний статичний метод addAll(ArrayList\<String>, String...), який не повертає жодного значення (тип void).  
• Клас Solution має містити публічний статичний метод replaceAll(ArrayList\<String>, String, String), який не повертає жодного значення (тип void).  
• Метод copy(ArrayList\<String>, ArrayList\<String>) потрібно переписати, використовуючи метод copy класу Collections.  
• Метод addAll(ArrayList\<String>, String...) потрібно переписати, використовуючи метод addAII класу Collections.  
• Метод replaceAll(ArrayList\<String>, String, String) потрібно переписати, використовуючи метод replaceAll класу Collections.  

---

### **Start code:**  

```java
import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public static void copy(ArrayList<String> destination, ArrayList<String> source) {
        if(destination.size() < source.size()) {
            throw new IndexOutOfBoundsException("Source does not fit in dest");
        }
        for (int i = 0; i < source.size(); i++) {
            destination.set(i, source.get(i));
        }
    }

    public static void addAll(ArrayList<String> list, String... strings) {
        for (String string : strings) {
            list.add(string);
        }
    }

    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
        for (int i = 0; i < list.size(); i++) {
            String string = list.get(i);
            if(string.equals(oldValue)) {
                list.set(i, newValue);
            }
        }
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public static void copy(ArrayList<String> destination, ArrayList<String> source) {
        Collections.copy(destination, source);
    }

    public static void addAll(ArrayList<String> list, String... strings) {
        Collections.addAll(list, strings);
    }

    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
        Collections.replaceAll(list, oldValue, newValue);
    }
}
```
