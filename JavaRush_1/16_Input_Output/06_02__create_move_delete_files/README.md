### **The task to solve:**  

Напиши програму, яка зчитуватиме з клавіатури два шляхи до файлу.  
1. Якщо за першим шляхом файлу немає, його потрібно створити.  
2. Якщо за першим шляхом файл є, його потрібно перемістити на другий шлях, але тільки за умови, що за другим шляхом файлу немає.  
3. Якщо такий файл є, потрібно просто видалити файл за першим шляхом.  

Використай відповідні методи класу `Files`: `createFile()`, `move()`, `delete()`, `exists()` / `notExists()`.

---

### **Requirements:**  

• Програма має зчитувати з консолі два шляхи.  
• У програмі потрібно використати відповідні методи класу Files: createFile(Path), move(Path, Path), delete(Path), exists(Path) / notExists(Path).  
• Програма має обробляти введені шляхи згідно з умовою.  
• Не використовуй такі класи пакету java.іо: File, FilelnputStream, FileOutputStream, FileReader, FileWriter.

---

### **Start code:**  

```java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine());
        Path fileNewPath = Path.of(scanner.nextLine());
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
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine());
        Path fileNewPath = Path.of(scanner.nextLine());
        scanner.close();
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        } else {
            if (Files.notExists(fileNewPath)) {
                Files.move(filePath, fileNewPath);
            } else {
                Files.delete(filePath);
            }
        }
    }
}
```
