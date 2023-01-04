### **The task to solve:**  

Тобі потрібно написати програму, яка:  
Зчитує з консолі ціле число `N`.  
Якщо зчитане число `N` більше `0`, то далі програма зчитує цілі числа, кількість яких дорівнює `N`.  
Вивести в консоль зчитані числа: якщо `N` непарне - в порядку введення, якщо парне - в зворотному порядку.  
Кожне число виводити з нового рядка. Число `N` виводити не потрібно.

---

### **Requirements:**  

• Програма має зчитувати число N і після нього ще N чисел.  
• У класі має бути метод public static void main(String[]).  
• He можна додавати нові методи в клас Solution.  
• Програма має виводити введені N чисел у зворотному порядку, якщо N парне.  
• Програма має виводити введені N чисел у тому самому порядку, якщо N непарне.  

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[] arr;
        if (number > 0) {
            arr = new int[number];
            for (int i = 0; i < number; i++) {
                arr[i] = scan.nextInt();
            }
            scan.close();
        } else {
            scan.close();
            return;
        }
        if (number % 2 != 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        } else {
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
}
```
