### **The task to solve:**  

Програма повинна зчитувати з клавіатури цілі числа доти, доки не буде введено щось інше: наприклад, рядок або символ.  
Виведи на екран максимальне парне число серед уведених чисел. Якщо введено кілька таких чисел, потрібно вивести будь-яке з них.

**Приклад уведення:**  
```
8
9
8
4
5
e
```
**Приклад виведення:**  
```
8
```

---

### **Requirements:**  

• Програма повинна зчитувати числа з клавіатури.  
• Програма повинна виводити число на екран.  
• Програма повинна виводити на екран максимальне парне число серед уведених цілих чисел.  
• Якщо введено кілька максимальних парних чисел, потрібно вивести будь-яке з них.  
• Якщо серед уведених символів немає парного числа або введено лише нечисловий символ, слід вивести на екран мінімальне значення числа типу int.  
• Зчитувати дані з клавіатури потрібно в циклі while.  

---

### **Start code:**  

```java
import java.util.Scanner;

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
        int max = Integer.MIN_VALUE;
        int num;
        while (scan.hasNextInt()) {
            num = scan.nextInt();
            if ((num > max) && (num % 2 == 0)) {
                max = num;
            }
        }
        scan.close();
        if (max != Integer.MIN_VALUE) {
            System.out.print(max);
        }
    }
}
```