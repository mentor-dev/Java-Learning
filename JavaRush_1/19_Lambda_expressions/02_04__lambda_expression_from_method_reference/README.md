### **The task to solve:**  

У класі `Solution` публічний метод `print(ArrayList<Integer>)` виводить у консоль усі елементи списку підряд.  
Наразі метод реалізовано з використанням методу списку `forEach()`, який отримує посилання на метод. Потрібно переписати реалізацію методу `print(ArrayList<Integer>)` так, щоб метод списку `forEach()` замість посилання на метод отримував лямбда-вирази.

Метод `main()` під час тестування не перевіряється.

---

### **Requirements:**  

• У методі print(ArrayList\<Integer>) потрібно використати метод списку forEach(), який отримує лямбда-вирази.  
• У методі print(ArrayList\<Integer>) потрібно виводити в консоль усі елементи отриманого списку підряд.

---

### **Start code:**  

```java
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 12, 34, 54, 32, 1, 453, 1111);

        print(numbers);
    }

    public static void print(ArrayList<Integer> numbers) {
        numbers.forEach(System.out::println);
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
        var numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 12, 34, 54, 32, 1, 453, 1111);

        print(numbers);
    }

    public static void print(ArrayList<Integer> numbers) {
        numbers.forEach(item -> System.out.println(item));
    }
}
```
