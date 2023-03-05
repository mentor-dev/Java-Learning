### **The task to solve:**  

Перед тобою програма, що сортує список рядків за їх довжиною в порядку зростання.  
Це робить метод `sortStringsByLength(ArrayList<String>)`. Для сортування рядків використовується метод `Collections.sort(ArrayList<String>, Comparator<String>)`, який отримує список рядків і компаратор у вигляді лямбда-виразу.

Твоє завдання - переписати реалізацію методу `sortStringsByLength(ArrayList<String>)` так, щоб замість лямбда-виразу використовувався клас `StringComparator`, який реалізує інтерфейс `Comparator<String>`, не змінюючи логіку роботи методу `sortStringsByLength(ArrayList<String>)`.

Тобто потрібно, щоб у класі `StringComparator` метод `int compare(String s1, String s2)` повертав числове значення згідно з цими умовами:
- від'ємне число, якщо довжина рядка `s1` менша за довжину рядка `s2`;
- додатне число, якщо довжина рядка `s1` більша за довжину рядка `s2`;
- `0`, якщо довжина рядків `s1` і `s2` однакова.

Метод `main()` під час тестування не перевіряється.

---

### **Requirements:**  

• В окремому файлі потрібно створити публічний клас StringComparator, який реалізує інтерфейс Comparator\<String>.  
• У класі StringComparator потрібно створити публічний метод int compare(String si, String s2).  
• Метод compare(String si, String s2) потрібно реалізувати згідно з умовою.  
• У методі sortStringsByLength(Arrayüst\<String>) потрібно сортувати список рядків за зростанням їх довжини.  
• У методі sortStringsByLength(ArrayList\<String>) для сортування списку рядків за зростанням їх довжини потрібно використовувати власний компаратор (об'єкт типу StringComparator).

---

### **Start code:**  

```java
import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();

        Collections.addAll(strings, "JavaRush", "Amigo", "Java Developer", "CodeGym");

        sortStringsByLength(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void sortStringsByLength(ArrayList<String> strings) {
        Collections.sort(strings, (s1, s2) -> s1.length() - s2.length());
    }
}
```

---

### **My solution: [Link](./src/)**  

```java
import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();

        Collections.addAll(strings, "JavaRush", "Amigo", "Java Developer", "CodeGym");

        sortStringsByLength(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void sortStringsByLength(ArrayList<String> strings) {
        Collections.sort(strings, new StringComparator());
    }
}
```

```java
import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}
```
