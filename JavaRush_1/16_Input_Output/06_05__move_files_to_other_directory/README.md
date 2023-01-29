### **The task to solve:**  

Напиши програму, яка зчитує з клавіатури шляхи до двох директорій і переміщує файли з однієї директорії в іншу (тільки файли, директорії ігноруй). Використай відповідні методи класу `Files`: `newDirectoryStream()`, `isRegularFile()` або `isDirectory()`, `move()`.

---

### **Requirements:**  

• Програма має зчитувати з консолі шляхи до директорій.  
• У програмі слід використати відповідні методи класу Files згідно з умовою.  
• Програма має переміщати файли з однієї директорії в іншу згідно з умовою.  
• Не використовуй такі класи пакету java.іо: File, FilelnputStream, FileOutputStream, FileReader, FileWriter.

---

### **Start code:**  

```java
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        scanner.close();
        try (DirectoryStream<Path> dir = Files.newDirectoryStream(sourceDirectory)) {
            for (Path path : dir) {
                if (Files.isRegularFile(path)) {
                    Path fileName = path.getFileName();
                    Path destFileName = targetDirectory.resolve(fileName);
                    Files.move(path, destFileName);
                }
            }
        } catch (NoSuchFileException e) {
            System.out.println("Directory is not exists: " + e);
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }
    }
}
```
