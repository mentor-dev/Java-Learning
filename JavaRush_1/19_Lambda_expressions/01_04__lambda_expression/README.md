### **The task to solve:**  

Перед тобою програма, що сортує список чисел за зростанням.
Метод `sortNumbers(ArrayList<Integer>)` отримує список, елементи якого потрібно відсортувати. Для сортування використовується метод `Collections.sort(ArrayList<Integer>, Comparator<Integer>)`, де параметри - це список чисел і компаратор.

Твоє завдання - переписати реалізацію методу `sortNumbers(ArrayList<Integer>)` так, щоб замість внутрішнього анонімного класу `Comparator<Integer>` використовувався лямбда-вираз.

Метод `main()` під час тестування не перевіряється.

---

### **Requirements:**  

• Заміни внутрішній анонімний клас Comparator\<Integer> на лямбда-вираз.  
• У методі sortNumbers(ArrayList\<Integer>) потрібно сортувати список чисел за зростанням.

---

### **Start code:**  

```java
import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();

        Collections.addAll(numbers, 123, -6, 12, 0, 44, 5678, -350);

        sortNumbers(numbers);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    public static void sortNumbers(ArrayList<Integer> numbers) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i1 - i2;
            }
        };
        Collections.sort(numbers, comparator);
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

        Collections.addAll(numbers, 123, -6, 12, 0, 44, 5678, -350);

        sortNumbers(numbers);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    public static void sortNumbers(ArrayList<Integer> numbers) {
        Collections.sort(numbers, (i1, i2) -> i1 - i2);
    }
}
```
