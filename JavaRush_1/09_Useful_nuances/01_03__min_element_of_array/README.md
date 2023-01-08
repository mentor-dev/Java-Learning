### **The task to solve:**  

У цій задачі тобі потрібно:  
Зчитати `10` чисел з консолі й заповнити ними масив за допомогою методу `getArrayOfTenElements()`.  
Знайти мінімальний елемент масиву та повернути цей елемент за допомогою методу `min(int[])`.  
У методі `min(int[])` обов'язково використай метод `Math.min(int, int)`.

---

### **Requirements:**  

• Програма має зчитувати числа з клавіатури.  
• Клас Solution має містити тільки три методи.  
• Метод getArrayOfTenElements() має зчитати з клавіатури 10 чисел і повернути масив розміром 10 елементів, заповнений отриманими числами.  
• Метод min(int[]) має повернути мінімальний елемент масиву за допомогою методу min(int, int) класу Math.  
• Метод main() має викликати метод getArrayOfTenElements().  
• Метод main() має викликати метод min(int[]).

---

### **Start code:**  

```java
public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        //напишіть тут ваш код
        return 0;
    }

    public static int[] getArrayOfTenElements() {
        //напишіть тут ваш код
        return new int[10];
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int minNum = Integer.MAX_VALUE;
        for (int i : ints) {
            minNum = Math.min(i, minNum);
        }
        return minNum;
    }

    public static int[] getArrayOfTenElements() {
        int[] array = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();
        return array;
    }
}
```
