
### **The task to solve:**  

Увести с клавіатури ціле додатне число `radius`. Це число будемо використовувати як радіус кола.  
Вивести на екран площу круга, обчислену за формулою: `S = pi * radius * radius`.  
Результатом має бути ціле число (тип `int`). Для цього потрібно перетворити результат множення на число типу `int` (відкинути дробову частину, округливши результат до меншого цілого числа).
Для змінної `pi` використовуй значення `3.14`.

**Приклад уведення:**
```
5
```

**Приклад виведення:**
```
78
```

---

### **Requirements:**  

• Програма повинна зчитувати ціле число з клавіатури.  
• Програма повинна виводити число на екран.  
• Програма повинна виводити на екран площу круга радіусом radius як ціле число.

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
    public static void main(String[] args) throws Exception {
        double pi = 3.14;
        int area = 0;
        Scanner scan = new Scanner(System.in);
        int radius = scan.nextInt();
        scan.close();
        area = (int) (pi * radius * radius);
        System.out.print(area);
    }
}
```
