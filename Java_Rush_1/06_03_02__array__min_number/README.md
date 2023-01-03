### **The task to solve:**  

Щоб виконати цю задачу, тобі потрібно:  

Ввести з клавіатури число `N`.   
Зчитати `N` цілих чисел і заповнити ними масив.   
Знайти й вивести в консоль мінімальне число серед елементів масиву.

---

### **Requirements:**  

• У методі main(String[]) зчитай з клавіатури число N, потім проініціалізуй масив array розміром N елементів і заповни його числами, уведеними з клавіатури.  
• У методі main(String[]) виведи в консоль мінімальне число серед елементів масиву.

---

### **Start code:**  

```java
import java.util.Scanner;

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
    }
}

```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.Scanner;

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        int min = Integer.MAX_VALUE;
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = scan.nextInt();
            if (array[i] < min) {
                min = array[i];
            }
        }
        scan.close();
        System.out.println(min);
    }
}
```
