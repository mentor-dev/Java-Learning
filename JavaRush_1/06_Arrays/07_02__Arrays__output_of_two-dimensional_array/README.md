### **The task to solve:**  

Реалізуй метод `main(String[])`, який виводить масиви `strings` і `ints` у консоль за допомогою методу `Arrays.deepToString(Object[][])`.

---

### **Requirements:**  

• У класі Solution має бути публічна статична змінна strings типу String[][].  
• У класі Solution має бути публічна статична змінна ints типу int[][].  
• У методі main(String[]) виведи в консоль массив strings за допомогою методу Arrays.deepToString(Object[][]).  
• У методі main(String[]) виведи в консоль массив ints за допомогою методу Arrays.deepToString(Object[][]).

---

### **Start code:**  

```java
import java.util.Arrays;

public class Solution {

    public static String[][] strings = new String[][]{{"🙂", "🙂", "🙂", "🙂"}, {"🙃", "🙃", "🙃", "🙃"}, {"😋", "😋", "😋", "😋"}, {"😎", "😎", "😎", "😎"}};
    public static int[][] ints = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

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

    public static String[][] strings = new String[][]{{"🙂", "🙂", "🙂", "🙂"}, {"🙃", "🙃", "🙃", "🙃"}, {"😋", "😋", "😋", "😋"}, {"😎", "😎", "😎", "😎"}};
    public static int[][] ints = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(strings));
        System.out.println(Arrays.deepToString(ints));
    }
}
```
