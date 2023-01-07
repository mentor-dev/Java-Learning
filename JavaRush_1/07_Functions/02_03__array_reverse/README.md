### **The task to solve:**  

Напишімо утиліту для роботи з масивами. Основна частина функціоналу готова: метод `printArray()` виводить у консоль усі елементи масиву.  
Залишилася дрібниця: реалізувати метод `reverseArray()`. Він має змінювати порядок елементів масиву на зворотний.  
Метод має працювати лише з масивами цілочислових значень (`int[]`).

**Приклад:**  
Якщо масив містив елементи:  
`1, 2, 3, 4, 5, 6, 7, 8, 9, 0`  
то після виклику методу `reverseArray()` повинен містити:  
`0, 9, 8, 7, 6, 5, 4, 3, 2, 1`

---

### **Requirements:**  

• Метод геуегsеАггау() має змінювати порядок елементів масиву на зворотний.

---

### **Start code:**  

```java
public class Solution {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        //напишіть тут ваш код
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
```
