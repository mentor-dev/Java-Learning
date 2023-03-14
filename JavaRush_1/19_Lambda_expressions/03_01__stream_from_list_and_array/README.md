### **The task to solve:**  

У цій задачі тобі потрібно реалізувати два методи так, щоб:
1. Публічний статичний метод `getStreamFromArrayList(ArrayList<String>)` повертав потік рядків зі списку рядків, отриманого як аргумент.
2. Публічний статичний метод `getStreamFromArray(Integer[] array)` повертав потік чисел із масиву чисел, отриманого як аргумент.

**Підказка:**  
Для отримання потоку даних із колекції потрібно викликати для неї метод `stream()`.  
Для отримання потоку даних із масиву потрібно викликати для класу `java.util.Arrays` статичний метод `stream()`, в який передати масив.

Метод `main()` під час тестування не перевіряється.

---

### **Requirements:**  

• Метод getStreamFromArrayList(ArrayList\<String>) потрібно реалізувати згідно з умовою.  
• Метод getStreamFromArray(lnteger[] array) потрібно реалізувати згідно з умовою.

---

### **Start code:**  

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Зима", "Весна", "Літо", "Осінь");

        Stream<String> stringStream = getStreamFromArrayList(strings);
        stringStream.forEach(System.out::println);

        var integers = new Integer[]{12, 34, 56, 78, 90};

        Stream<Integer> integerStream = getStreamFromArray(integers);
        integerStream.forEach(System.out::println);
    }
                             
    public static Stream<String> getStreamFromArrayList(ArrayList<String> list) {
        //напишіть тут ваш код
        return Stream.empty();
    }

    public static Stream<Integer> getStreamFromArray(Integer[] array) {
        //напишіть тут ваш код
        return Stream.empty();
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Зима", "Весна", "Літо", "Осінь");

        Stream<String> stringStream = getStreamFromArrayList(strings);
        stringStream.forEach(System.out::println);

        var integers = new Integer[]{12, 34, 56, 78, 90};

        Stream<Integer> integerStream = getStreamFromArray(integers);
        integerStream.forEach(System.out::println);
    }
                             
    public static Stream<String> getStreamFromArrayList(ArrayList<String> list) {
        return list.stream();
    }

    public static Stream<Integer> getStreamFromArray(Integer[] array) {
        return Arrays.stream(array);
    }
}
```
