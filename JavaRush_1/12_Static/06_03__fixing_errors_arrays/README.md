### **The task to solve:**  

У програмі масив заповнюється числами від `0` до `9`, і його вміст виводиться на екран. Однак через помилку програма не компілюється.  
Зроби так, щоб програма компілювалася й правильно працювала.

---

### **Requirements:**  

• Виправ помилку в коді, щоб програма працювала правильно.

---

### **Start code:**  

```java
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array;
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
    }
}
```
