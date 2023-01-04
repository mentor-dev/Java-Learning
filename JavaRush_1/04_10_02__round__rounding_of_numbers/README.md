### **The task to solve:**  

У методі `main()` є змінна `double glass = 0.5`, яка означає наполовину повну склянку. Для песиміста вона наполовину порожня, а для оптиміста — наполовину повна.  
Потрібно зчитати з клавіатури дані типу `boolean`, використовуючи метод `nextBoolean()` об'єкта типу Scanner. Залежно від отриманих даних округлити змінну `glass`: до меншого цілого числа (`0`), якщо песиміст (`false`) і до більшого цілого числа (`1`), якщо оптиміст (`true`).  
Результат вивести на екран.

**Приклад уведення:**
```
true
```

**Приклад виведення:**
```
1
```

**Підказка:**  
Для округлення дійсного числа до меншого цілого використай метод `Math.floor()`, а до більшого - метод `Math.ceil()`.

---

### **Requirements:**  

• Програма повинна зчитувати з клавіатури дані типу boolean.  
• Програма повинна виводити ціле число на екран згідно з умовою.  
• У програмі потрібно використати метод Math.floor().  
• У програмі потрібно використати метод Math.ceil().

---

### **Start code:**  

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
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
        double glass = 0.5;
        Scanner scan = new Scanner(System.in);
        boolean isOptimist = scan.nextBoolean();
        scan.close();
        int res = (int) (isOptimist ? Math.ceil(glass) : Math.floor(glass));
        System.out.println(res);
    }
}
```
