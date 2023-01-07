### **The task to solve:**  

Часом потрібно заповнити частину масиву однаковими значеннями або ж видалити ті, що там є (присвоїти значення `null`).
Реалізуй для цього більш гнучкий метод `fillArray(Integer[] array, int value, int begin, int end)`, де:  
`array` — масив, який потрібно заповнити;  
`value` — значення, яке слід використати для заповнення;  
`begin` — індекс, з якого слід почати заповнення (включно);  
`end` — індекс, на якому слід зупинити заповнення (не включно).

---

### **Requirements:**  

• Метод fillArray(lnteger[] array, int value, int begin, int end) має заповнювати переданий у нього масив значенням value.  
• Метод fillArray(lnteger[] array, int value, int begin, int end) має заповнювати лише елементи від індексу begin (включно) до індексу end (не включно).

---

### **Start code:**  

```java
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3, 1, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value, int begin, int end) {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3, 1, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value, int begin, int end) {
        Arrays.fill(array, begin, end, value);
    }
}
```
