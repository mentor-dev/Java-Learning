### **The task to solve:**  

Є програма, яка зчитує з консолі шлях до `файлу1` і шлях до `файлу2` та копіює вміст `файлу1` у `файл2`.  
Але вона працює некоректно. Знайди й виправ помилку в коді, щоб програма працювала як належить.

---

### **Requirements:**  

• Програма має зчитувати з консолі шляхи до файлів.  
• Програма має переписувати вміст одного файлу в інший.  
• Потоки для читання й запису мають бути закриті.  
• Не використовуй такі класи пакету java.іо: File, FilelnputStream, FileOutputStream, FileReader, FileWriter.

---

### **Start code:**  

```java
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
        ) {
            int size = 1024;
            byte[] buffer = new byte[size];
            while (inputStream.available() > 0) {
                int read = inputStream.read();
                outputStream.write(buffer, size, read);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
        ) {
            int size = 1024;
            byte[] buffer = new byte[size];
            while (inputStream.available() > 0) {
                int read = inputStream.read(buffer);
                outputStream.write(buffer, 0, read);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
```
