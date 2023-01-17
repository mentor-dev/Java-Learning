### **The task to solve:**  

У класі `Solution` є поля `number`, `string` і метод `main` з оголошеними в ньому змінними. Тобі потрібно замінити оголошення змінних на `var` там, де це можливо. Порядок розташування змінних не повинен змінюватися.

**Приклад:**  
`Scanner console = new Scanner(System.in);`  
замінити на:  
`var console = new Scanner(System.in);`

---

### **Requirements:**  

• Заміни лише типи змінних на var, де це можливо.  
• Не змінюй праву частину виразів.

---

### **Start code:**  

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    private int number = 54;
    private String string = "string";

    public static void main(String[] args) {
        int integer = 22;
        String string = "string";
        int[] array = new int[5];
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer maxValue = Integer.valueOf(Integer.MAX_VALUE);
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    private int number = 54;
    private String string = "string";

    public static void main(String[] args) {
        var integer = 22;
        var string = "string";
        var array = new int[5];
        var strings = new ArrayList<String>();
        var bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        var maxValue = Integer.valueOf(Integer.MAX_VALUE);
    }
}
```
