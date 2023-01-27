### **The task to solve:**  

У цій задачі необхідно перевернути рядок і вивести його на екран у зворотному порядку за допомогою `PrintStream`. Метод `printSomething(String)` виводить у поле `stream` переданий рядок. Необхідно перевернути рядок і вивести його у зворотному порядку за допомогою `PrintStream`.  

Метод `main(String[] args)` зчитує рядок з клавіатури й передає його в метод `printSomething(String)`, який записує отриманий рядок у потік `stream`.  

Твоє завдання: у методі `main(String[])` перевернути переданий рядок за допомогою поля `outputStream` (тобто поле `outputStream` має зберігати рядок у зворотному порядку) і вивести його в консоль.

**Приклад:**  
Вхідні дані:  

```
it's a text for testing
```

Виведено на екран:  

```
gnitset rof txet a s'ti
```

Метод `printSomething(String)` не змінюй.

---

### **Requirements:**  

• Програма має використовувати метод printSomething().  
• Програма має виводити в консоль у зворотному порядку рядок, переданий у метод main(String[]).  
• Щоб перевернути рядок, потрібно використати поле outputStream згідно з умовою.  
• Метод printSomething(String) змінювати не можна.

---

### **Start code:**  

```java
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Solution {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        printSomething(scanner.nextLine());
        String result = outputStream.toString();
        //напишіть тут ваш код
    }

    public static void printSomething(String str) {
        stream.print(str);
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Solution {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        printSomething(scanner.nextLine());
        StringBuilder builder = new StringBuilder(outputStream.toString());
        outputStream.reset();
        builder.reverse();
        printSomething(builder.toString());
        String result = outputStream.toString();
        System.out.println(result);
    }

    public static void printSomething(String str) {
        stream.print(str);
    }
}
```
