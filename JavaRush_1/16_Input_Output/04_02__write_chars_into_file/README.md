### **The task to solve:**  

Є програма, яка зчитує з консолі шлях до файлу і записує в цей файл послідовність символів, отриману з аргументу методу `main(String[])`.
Твоє завдання - виправити помилку, щоб масив символів можна було записати у файл.  
Для запису символів у файл потрібно використати об'єкт `BufferedWriter`, отриманий у результаті виклику методу `newBufferedWriter(Path)` класу `Files`.

---

### **Requirements:**  

• Програма має зчитувати з консолі шлях до файлу.  
• Програма має переписувати символи у файл.  
• Для запису символів у файл потрібно використати об'єкт BufferedWriter, отриманий в результаті виклику методу newBufferedWriter(Path) класу Files.  
• Потік для запису має бути закритий.  
• Не використовуй такі класи пакету java.іо: File, FilelnputStream, FileOutputStream, FileReader, FileWriter.

---

### **Start code:**  

```java
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        char[] chars = args[0].toCharArray();
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream)) {
            Files.write(Path.of(scanner.nextLine()), chars);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        char[] chars = args[0].toCharArray();
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream);
             BufferedWriter buffer = Files.newBufferedWriter(Path.of(scanner.nextLine()))) {
            buffer.write(chars);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
```
