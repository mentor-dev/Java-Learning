### **The task to solve:**  

У класі `Solution` є метод `getProgrammingLanguages`, який повертає список мов програмування. Потрібно переписати цей метод, щоб він повертав `HashMap<Integer, String>`. Ключем у цій колекції буде індекс елемента в `ArrayList`.

---

### **Requirements:**  

• Клас Solution має містити публічний статичний метод getProgrammingLanguages, який повертає значення типу HashMap\<lnteger, String>.  
• Метод getProgrammingLanguages() має повертати значення HashMap, що заповнено відповідно до списку.

---

### **Start code:**  

```java
import java.util.ArrayList;
import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static ArrayList<String> getProgrammingLanguages() {
        //напишіть тут ваш код
        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Go");
        programmingLanguages.add("Javascript");
        programmingLanguages.add("Typescript");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("C++");
        return programmingLanguages;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.ArrayList;
import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<Integer, String> getProgrammingLanguages() {
        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Go");
        programmingLanguages.add("Javascript");
        programmingLanguages.add("Typescript");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("C++");
        
        HashMap<Integer, String> languages = new HashMap<>();
        for (int i = 0; i < programmingLanguages.size(); i++) {
            languages.put(i, programmingLanguages.get(i));
        }
        
        return languages;
    }
}
```
