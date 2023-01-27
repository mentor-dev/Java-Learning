### **The task to solve:**  

Напиши програму, яка зчитує з консолі ім'я текстового файлу, далі читає рядки з цього файлу (використай метод `readAllLines(Path)` класу `Files`) і виводить їх на екран через один, починаючи з першого.

---

### **Requirements:**  

• Програма має зчитувати з консолі шлях до файлу.  
• Програма має вивести в консоль вміст файлу згідно з умовою.  
• Для читання рядків із файлу слід використати метод readAIILines(Path) класу Files.  
• Не використовуй такі класи пакету java.іо: File, FilelnputStream, FileOutputStream, FileReader, FileWriter.

---

### **Start code:**  

```java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (Scanner scan = new Scanner(System.in)) {
            List<String> list = Files.readAllLines(Path.of(scan.nextLine()));
            for (int i = 0; i < list.size(); i++) {
                if (i % 2 == 0) {
                    System.out.println(list.get(i));
                }
            }
        }
    }
}
```
