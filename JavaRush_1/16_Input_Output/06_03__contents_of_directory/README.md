### **The task to solve:**  

Напиши програму, яка зчитує з клавіатури шлях до директорії, отримує список файлів і директорій у вказаній директорії та виводить в консоль інформацію про них у такому вигляді:  
"`<шлях до файлу> - це файл`", якщо це файл,  
"`<шлях до директорії> - це директорія`", якщо це директорія.  
Кутові дужки та лапки виводити не потрібно.  

Використай відповідні методи класу `Files`: `newDirectoryStream(Path)`, `isRegularFile(Path)` і `isDirectory(Path)`.

**Уведено:**

```
C:\javarush\
```

**Виведено:**

```
C:\javarush\test.txt - це файл
C:\javarush\tasks - це директорія
...
```

---

### **Requirements:**  

• Програма має зчитувати з консолі шлях до директорії.  
• У програмі слід використати відповідні методи класу Files: newDirectoryStream(Path), isRegularFile(Path) та isDirectory(Path).  
• Програма має отримувати список файлів і директорій у вказаній директорії та виводити в консоль інформацію згідно з умовою.  
• Fie використовуй такі класи пакету java.іо: File, FilelnputStream, FileOutputStream, FileReader, FileWriter.

---

### **Start code:**  

```java
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {

    private static final String THIS_IS_FILE = " - це файл";
    private static final String THIS_IS_DIR = " - це директорія";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path directory = Path.of(scanner.nextLine());
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
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {

    private static final String THIS_IS_FILE = " - це файл";
    private static final String THIS_IS_DIR = " - це директорія";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path directory = Path.of(scanner.nextLine());
        try (DirectoryStream<Path> dir = Files.newDirectoryStream(directory)) {
            for (Path path : dir) {
                if (Files.isRegularFile(path)) {
                    System.out.println(path.toString() + THIS_IS_FILE);
                } else if (Files.isDirectory(path)) {
                    System.out.println(path.toString() + THIS_IS_DIR);
                }
            }
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }
    }
}
```
