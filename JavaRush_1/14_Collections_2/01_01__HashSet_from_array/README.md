### **The task to solve:**  

У класі `Solution` є метод `arrayToHashSet(String[])`, який має з переданого масиву повернути `HashSet<String>` з тими самими елементами.  
Метод `main` у перевірці не використовується.

---

### **Requirements:**  

• Клас Solution має містити метод public static HashSet\<String\> arrayToHashSet(String[]).  
• Метод arrayToHashSet(String[]) слід реалізувати згідно з умовою.

---

### **Start code:**  

```java
import java.util.Collections;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "роки", "я", "буду", "Senior", "Java", "Developer"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for(String s : hashSet) {
            System.out.println(s);
        }
    }
                            
    public static HashSet<String> arrayToHashSet(String[] strings) {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "роки", "я", "буду", "Senior", "Java", "Developer"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for(String s : hashSet) {
            System.out.println(s);
        }
    }
                            
    public static HashSet<String> arrayToHashSet(String[] strings) {
        HashSet<String> result = new HashSet<>();
        for (String item : strings) {
            result.add(item);
        }
        return result;
    }
}
```
