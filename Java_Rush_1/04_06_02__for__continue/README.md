### **The task to solve:**  

У методі `main` з клавіатури зчитується 3 цілих числа: `start`, `end` (`start <= end`), `multiple`.  
Допиши програму, щоб на екран виводилася сума чисел від `start` (включно) до `end` (не включно), кратних `multiple`.  
Використай для цього цикл `for`.  
Підказка: щоб перейти до наступної ітерації циклу, використовуй оператор `continue`.

---

### **Requirements:**  

• Програма має вивести в консоль суму чисел від start (включно) до end (не включно), кратних multiple.  
• У програмі потрібно використовувати цикл for.  
• У циклі потрібно використовувати оператор continue.

---

### **Start code:**  

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();
        int sum = 0;
        //напишіть тут ваш код

        System.out.println(sum);
    }
}
```
---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();
        int sum = 0;
        scanner.close();
        for (int i = start; i < end; i++) {
            if (i % multiple != 0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
```