### **The task to solve:**  

Реалізуй метод `main(String[])`, який ділить масив `array` на два підмасиви та заповнює ними двовимірний масив `result`.  
Якщо довжина масиву непарна, то більшу частину потрібно скопіювати в перший підмасив.  
Якщо довжина масиву парна, його потрібно поділити навпіл.  
Для розділення масиву використовуй метод `Arrays.copyOfRange(int[], int, int)`. Порядок елементів не змінюй.  
Значення полів класу `Solution` під час тестування будуть різними, зваж на це.

---

### **Requirements:**  

• Реалізуй метод main(String[]) згідно з умовою.

---

### **Start code:**  

```java
import java.util.Arrays;

public class Solution {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        //напишіть тут ваш код
        System.out.println(Arrays.deepToString(result));
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.Arrays;

public class Solution {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        int sepIndex;
        if (array.length % 2 == 0) {
            sepIndex = array.length / 2;
        } else {
            sepIndex = array.length / 2 + 1;            
        }
        result[0] = Arrays.copyOfRange(array, 0, sepIndex);
        result[1] = Arrays.copyOfRange(array, sepIndex, array.length);

        System.out.println(Arrays.deepToString(result));
    }
}
```
