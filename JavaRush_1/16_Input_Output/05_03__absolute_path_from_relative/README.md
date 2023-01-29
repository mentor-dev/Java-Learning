### **The task to solve:**  

Напиши код, який буде зчитувати з клавіатури шлях і виводити його в консоль. Якщо шлях не є абсолютним, то перед виведенням його потрібно перетворити на абсолютний.

---

### **Requirements:**  

• Програма має зчитувати з консолі шлях до файлу / папки.  
• Програма має виводити в консоль цей шлях і за потреби перетворювати його на абсолютний.  
• Для перевірки й перетворення шляху на абсолютний слід використати методи isAbsolute() і toAbsolutePath() класу Path.  
• Не використовуй такі класи пакету java.іо: File, FilelnputStream, FileOutputStream, FileReader, FileWriter.

---

### **Start code:**  

```java
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        Path path = Path.of(str);
        if (path.isAbsolute()) {
            System.out.println(path.toString());
        } else {
            System.out.println(path.toAbsolutePath().toString());
        }
    }
}
```
