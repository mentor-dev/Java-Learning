### **The task to solve:**  

У класі `Solution` публічний метод `print(ArrayList<String>)` виводить у консоль усі елементи списку підряд.  
Наразі метод реалізовано з використанням методу списку `forEach()`. Потрібно переписати реалізацію методу `print(ArrayList<String>)`, використовуючи оператор `for`. Логіку роботи методу змінювати не можна.

Метод `main()` під час тестування не перевіряється.

---

### **Requirements:**  

• У методі print(ArrayList\<String>) потрібно використати оператор for.  
• У методі print(ArrayList\<String>) не слід використовувати метод списку forEach().  
• У методі print(ArrayList\<String>) потрібно виводити в консоль усі елементи отриманого списку підряд.  

---

### **Start code:**  

```java
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Hello", "Amigo", "JavaRush", "CodeGym");

        print(strings);
    }

    public static void print(ArrayList<String> strings) {
        strings.forEach(string -> System.out.println(string));
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Hello", "Amigo", "JavaRush", "CodeGym");

        print(strings);
    }

    public static void print(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
```
