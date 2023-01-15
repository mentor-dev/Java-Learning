### **The task to solve:**  

Ти бачиш робочу програму, в якій масив `int[] numbers` заповнюється числами в методі `init()`. Потім у методі `reverse()` відбувається переставляння чисел у зворотному порядку.  
Твоє завдання - переписати код так, щоб замість масиву `int[] numbers` використовувався список `ArrayList<Integer> numbers`.  
Імена методів і змінних не слід змінювати.  
Методи `main()` і `print()` у перевірці не використовуються.

---

### **Requirements:**  

• Поле numbers повинно мати тип ArrayList\<lnteger\>.  
• Метод init() має заповнювати список numbers числами від 0 до 9.  
• Метод reverse() має переставити значення списку numbers у зворотному порядку.  

---

### **Start code:**  

```java
import java.util.ArrayList;

public class Solution {
    public static int[] numbers = new int[10];

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }
    }

    public static void reverse() {
        int n = numbers.length - 1;
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[n - i];
            numbers[n - i] = temp;
        }
    }

    private static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> numbers = new ArrayList<Integer>();
    

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }

    public static void reverse() {
        int n = numbers.size() - 1;
        for (int i = 0; i < numbers.size() / 2; i++) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(n - i));
            numbers.set(n - i, temp);
        }
    }

    private static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
```
