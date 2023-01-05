### **The task to solve:**  

Реалізуй статичний метод `main(String[])`, який заповнює масив `array` значеннями `valueStart` і `valueEnd`.  
Якщо значення довжини масиву парне, то першу половину масиву слід заповнити значеннями `valueStart`, а другу — `valueEnd`.  
Якщо значення довжини масиву непарне, то більшу частину заповнити значеннями `valueStart`, меншу - `valueEnd`. Для заповнення масиву використовуй метод `Arrays.fill(int[], int, int, int)`.  
Значення полів класу `Solution` під час тестування будуть різними, зваж на це.

---

### **Requirements:**  

• Реалізуй метод main(String[]) згідно з умовою.

---

### **Start code:**  

```java
import java.util.Arrays;

public class Solution {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;
                         
    public static void main(String[] args) {
        //напишіть тут ваш код
        System.out.println(Arrays.toString(array));
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.Arrays;

public class Solution {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;
                         
    public static void main(String[] args) {
        int sepIndex;

        if (array.length % 2 == 0) {
            sepIndex = array.length / 2;
        } else {
            sepIndex = array.length / 2 + 1;
        }

        Arrays.fill(array, 0, sepIndex, valueStart);
        Arrays.fill(array, sepIndex, array.length, valueEnd);

        System.out.println(Arrays.toString(array));
    }
}
```
