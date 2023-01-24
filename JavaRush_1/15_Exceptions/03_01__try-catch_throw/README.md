### **The task to solve:**  

Розберися, що робить програма.  
У блоці `catch` виведи на екран змінну `answer` і кинь далі впійманий виняток.

---

### **Requirements:**  

• Після введення з клавіатури "ок" програма має завершуватися винятком SecurityException.  
• У блоці catch у консоль має бути виведено змінну answer, щоб після введення з клавіатури "ок" усі введені раніше рядки виводилися в консоль у зворотному порядку.  
• У блоці catch має викидатися впійманий виняток, а не створюватися новий.

---

### **Start code:**  

```java
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        buyElephant(null, scanner);
    }

    static void buyElephant(String answer, Scanner scanner) {
        if (answer == null) {
            System.out.println("Купи слона");
        } else if (answer.toLowerCase().equals("ок")) {
            System.out.println("Так-то краще :) Список твоїх відмовок:");
            throw new SecurityException();
        } else {
            System.out.println("Усі кажуть \"" + answer + "\", а ти купи слона");
        }

        answer = scanner.nextLine();

        try {
            buyElephant(answer, scanner);
        } catch (Exception e) {
            //напишіть тут ваш код
        }
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        buyElephant(null, scanner);
    }

    static void buyElephant(String answer, Scanner scanner) {
        if (answer == null) {
            System.out.println("Купи слона");
        } else if (answer.toLowerCase().equals("ок")) {
            System.out.println("Так-то краще :) Список твоїх відмовок:");
            throw new SecurityException();
        } else {
            System.out.println("Усі кажуть \"" + answer + "\", а ти купи слона");
        }

        answer = scanner.nextLine();

        try {
            buyElephant(answer, scanner);
        } catch (Exception e) {
            System.out.println(answer);
            throw e;
        }
    }
}
```
