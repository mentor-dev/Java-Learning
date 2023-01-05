### **The task to solve:**  

Реалізуй метод `main(String[])`, який виводить у консоль `true`, якщо елемент міститься у переданому масиві, інакше - `false`.
Розташування елементів у масиві `array` не повинно змінюватися.

Щоб знайти елемент у масиві, потрібен бінарний пошук. Для цього використовуй статичний метод `Arrays.binarySearch(int[], int)` класу `Arrays`. Першим параметром слід передати відсортований масив, в якому виконати пошук, другим параметром - шуканий елемент. Метод `Arrays.binarySearch(int[], int)` повертає індекс шуканого елемента, якщо такий елемент є в масиві.

Для сортування можна скористатися методом `Arrays.sort(int[])`.
Значення полів класу `Solution` під час тестування будуть різними.

---

### **Requirements:**  

• У методі main(String[]) не змінюй розташування елементів масиву array.  
• Під час виклику методу main(String[]) вивести в консоль true, якщо значення змінної element міститься в масиві.  
• Під час виклику методу main(String[]) вивести в консоль false, якщо переданого елемента немає в масиві.  
• У методі main(String[]) використовуй виклик методу Arrays.binarySearch(int[], int).

---

### **Start code:**  

```java
import java.util.Arrays;

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;
                          
    public static void main(String[] args) {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.Arrays;

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;
                          
    public static void main(String[] args) {
        int[] tmp = Arrays.copyOf(array, array.length);
        Arrays.sort(tmp);
        System.out.println(Arrays.binarySearch(tmp, element) >= 0);
        // negative value if doesn't find
    }
}
```
