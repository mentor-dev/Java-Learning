### **The task to solve:**  

У методі `main` знайди й видали мову програмування `Pascal` зі списку `programmingLanguages`.

---

### **Requirements:**  

• У методі main має видалятися Pascal зі списку programmingLanguages.

---

### **Start code:**  

```java
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static ArrayList<String> programmingLanguages = 
            new ArrayList<>(Arrays.asList("C", "C++", "Python", 
            "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        programmingLanguages.remove("Pascal");
    }
}
```
