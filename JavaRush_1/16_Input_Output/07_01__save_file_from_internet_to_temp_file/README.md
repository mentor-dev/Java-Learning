### **The task to solve:**  

Напиши код, який зчитує з клавіатури посилання на файл в інтернеті, завантажує його та зберігає в тимчасовому файлі.  
Використай методи `createTempFile(null, null)` і `write(Path, byte[])` класу `Files`, а також метод `openStream()` класу `URL`.

---

### **Requirements:**  

• Програма має зчитувати з консолі посилання на файл в інтернеті (рядок).  
• Програма має завантажити файл за посиланням і зберегти його в тимчасовому файлі.  
• У програмі слід використати методи класів Files і URL згідно з умовою.  
• Не використовуй такі класи пакету java.іо: File, FilelnputStream, FileOutputStream, FileReader, FileWriter.

---

### **Start code:**  

```java
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();
        URL url = new URL(line);
        Path filePath = Files.createTempFile(null, null);
        try (InputStream input = url.openStream()) {
            byte[] buffer = input.readAllBytes();
            Files.write(filePath, buffer);
        } 
    }
}
```
