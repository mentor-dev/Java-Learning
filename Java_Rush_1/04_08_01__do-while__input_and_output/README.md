### **The task to solve:**  

Увести з клавіатури рядок і число `number`, яке більше за `0` і менше за `5`.  
Вивести рядок на екран `number` разів, використовуючи цикл `do-while`.  
Кожне значення потрібно вивести з нового рядка.
Якщо число `number` менше за/дорівнює `0` або більше за/дорівнює `5`, введений рядок потрібно вивести на екран `один` раз.

**Приклад уведення:**  
```
абв
2
```

**Приклад виведення:**
```
абв
абв
```
---

### **Requirements:**  

• Програма повинна зчитувати дані з клавіатури.  
• Програма повинна виводити дані на екран.  
• Програма повинна виводити рядок на екран number разів.  
• Якщо число number менше за/дорівнює 0 або більше за/дорівнює 5, програма повинна виводити рядок на екран один раз.  
• У програмі потрібно використовувати цикл do-while.

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
        String line = scan.next();
        int num = scan.nextInt();
        do {
            System.out.println(line);
            num--;
        } while (num > 0 && (num + 1) < 5);
        scan.close();
    }
}
```