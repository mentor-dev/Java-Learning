### **The task to solve:**  

Аміго отримав завдання: записати байти у файл. Він написав програму, яка зчитує з консолі шлях до файлу і записує в цей файл послідовність байтів, отриману з аргументу методу `main(String[])`. Але він припустився помилки в коді програми.  
Як тобі відомо, `BufferedWriter` «не працює» з байтами: для запису байтів у файл потрібно використовувати метод `write(Path, byte[])` класу `Files`.  
Щоб отримати `Path`, можна скористатися статичним методом `Path.of()`, в який потрібно передати шлях до файлу, зчитаний з консолі. Цей код має такий вигляд: `Path.of(scanner.nextLine())`. Допоможи Аміго виправити програму.  

---

### **Requirements:**  

• Програма має зчитувати з консолі шлях до файлу.  
• Програма має записувати байти у файл.  
• Для запису байтів у файл потрібно використати метод write(Path, byte[]) класу Files.  
• Не використовуй такі класи пакету java.io: File, FilelnputStream, FileOutputStream, FileReader, FileWriter.

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
    public static void main(String[] args) throws IOException {
        byte[] bytes = args[0].getBytes();
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream);
             BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(scanner.nextLine()))) {
            bufferedWriter.write(bytes);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        byte[] bytes = args[0].getBytes();
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream)) {
            Files.write(Path.of(scanner.nextLine()), bytes);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
```