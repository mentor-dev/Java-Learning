
### **The task to solve:**  

Спробуймо поділити ящик кока-коли на кабінет програмістів. Для цього напишемо програму з такими умовами:

Потрібно ввести з клавіатури два цілих числа. Перше число - кількість банок кока-коли в ящику. Друге - кількість людей в кабінеті.  
Вивести на екран результат ділення першого числа на друге.  
Результатом має бути дійсне число.

**Приклад уведення:**
```
3
2
```

**Приклад виведення:**
```
1.5
```

---

### **Requirements:**  

• Програма повинна зчитувати цілі числа з клавіатури.  
• Програма повинна виводити число на екран.  
• Програма повинна виводити на екран дійсне число - результат ділення першого введеного цілого числа на друге.

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
        double res;
        Scanner scan = new Scanner(System.in);
        int cups = scan.nextInt();
        int people = scan.nextInt();
        scan.close();
        res = 1.0 * cups / people;
        System.out.print(res);
    }
}
```
