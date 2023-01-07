### **The task to solve:**  

Часто перед початком використання масиву його потрібно заповнити значеннями за замовчуванням.  
Реалізуй таке заповнення в методі `fillArray(Integer[] array, int value)`.  
Як аргументи метод отримує масив і значення, якими потрібно заповнити комірки масиву.  
Масив слід заповнити цілком, незалежно від його довжини.

---

### **Requirements:**  

• Метод filIArray(lnteger[] array, int value) має заповнювати переданий у нього масив значенням value.

---

### **Start code:**  

```java
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value){
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
        fillArray(array, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value) {
        Arrays.fill(array, value);
    }
}
```
