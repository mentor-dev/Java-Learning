### **The task to solve:**  

У класі `Solution` публічний метод `print(ArrayList<Integer>)` виводить у консоль усі елементи списку підряд.  
Наразі метод реалізовано з використанням оператора `for`. Потрібно переписати реалізацію методу `print(ArrayList<Integer>)`, використовуючи метод списку `forEach()`, який отримує лямбда-вираз. Логіку роботи методу `print(ArrayList<Integer>)` змінювати не потрібно.

Метод `main()` під час тестування не перевіряється.

---

### **Requirements:**  

• У методі print(ArrayList\<lnteger>) потрібно використати метод списку forEach(), який отримує лямбда-вираз.  
• У методі print(ArrayList\<lnteger>) не слід використовувати оператор for.  
• У методі print(ArrayList\<lnteger>) потрібно виводити в консоль усі елементи отриманого списку підряд.

---

### **Start code:**  

```java
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        print(numbers);
    }

    public static void print(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
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
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        print(numbers);
    }

    public static void print(ArrayList<Integer> numbers) {
        numbers.forEach((i) -> System.out.println(i));
    }
}
```
