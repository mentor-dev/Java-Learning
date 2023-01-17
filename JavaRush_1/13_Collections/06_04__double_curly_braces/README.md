### **The task to solve:**  

У методі main створюється список `ArrayList<String>`, присвоюється змінній `var strings` і заповнюється п'ятьма елементами.  
Потрібно переписати код, не змінюючи логіки, з використанням подвійних фігурних дужок.

---

### **Requirements:**  

• Список strings має заповнюватися п'ятьма елементами в подвійних фігурних дужках.

---

### **Start code:**  

```java
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        strings.add("Так");
        strings.add("теж");
        strings.add("можна");
        strings.add("робити");
        strings.add("!");
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>()
        {{
            add("Так");
            add("теж");
            add("можна");
            add("робити");
            add("!");
        }};
    }
}
```
