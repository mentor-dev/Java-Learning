### **The task to solve:**  

Реалізуй метод `main(String[])`, який виводить масиви `strings` і `ints` у консоль за допомогою методу `Arrays.toString()`.

---

### **Requirements:**  

• У класі Solution має бути публічна статична змінна strings типу String[].  
• У класі Solution має бути публічна статична змінна ints типу int[].  
• У методі main(String[]) виведи в консоль масив strings за допомогою методу Arrays.toString(Object[]).  
• У методі main(String[]) виведи в консоль масив ints за допомогою методу Arrays.toString(int[]).  

---

### **Start code:**  

```java
import java.util.Arrays;

public class Solution {

    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

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

    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(ints));
    }
}
```
