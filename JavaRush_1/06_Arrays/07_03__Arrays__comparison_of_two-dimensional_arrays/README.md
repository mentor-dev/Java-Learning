### **The task to solve:**  

Виправ роботу методу `main(String[])`, який виводить в консоль `true`, якщо `arrayFirst` дорівнює `arraySecond`, інакше - `false`.

---

### **Requirements:**  

• Якщо arrayFirst дорівнює arraySecond, то метод main(String[]) виводить у консоль true.  
• Якщо arrayFirst не дорівнює arraySecond, то метод main(String[]) виводить у консоль false.  

---

### **Start code:**  

```java
import java.util.Arrays;

public class Solution {

    public static int[][] arrayFirst = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    public static int[][] arraySecond = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    public static void main(String[] args) {
        System.out.println(arrayFirst == arraySecond);
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.Arrays;

public class Solution {

    public static int[][] arrayFirst = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    public static int[][] arraySecond = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    public static void main(String[] args) {
        System.out.println(Arrays.deepEquals(arrayFirst, arraySecond));
    }
}
```
