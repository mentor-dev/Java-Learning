### **The task to solve:**  

У методі `main` перехопи `RuntimeException`. Визнач, який виняток в ньому збережено.  
Якщо це `FileNotFoundException`, виведи в консоль повідомлення "`Не вдалося прочитати файл.`", а якщо `FileSystemException` - "`Не вдалося записати у файл.`".

---

### **Requirements:**  

• У методі main має перехоплюватися RuntimeException.  
• Потрібно вивести "Не вдалося прочитати файл.", якщо в RuntimeException упаковано FileNotFoundException.  
• Потрібно вивести "Не вдалося записати у файл.", якщо в RuntimeException упаковано FileSystemException.  
• Клас FileManager не змінюй.  

---

### **Start code:**  

```java
import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

public class Solution {

    public static final String FAILED_TO_READ = "Не вдалося прочитати файл.";
    public static final String FAILED_TO_WRITE = "Не вдалося записати у файл.";

    public static FileManager fileManager = new FileManager();

    public static void main(String[] args) {
        fileManager.copyFile("book.txt", "book_final_copy.txt");
        fileManager.copyFile("book_final_copy.txt", "book_last_copy.txt");
        //напишіть тут ваш код
    }
}
```

```java
import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

public class FileManager {

    private void readFile(String filePath) throws FileNotFoundException {
        System.out.println("Читаємо вміст файлу " + filePath);
    }

    private void writeFile(String filePath) throws FileSystemException {
        System.out.println("Записуємо дані в файл " + filePath);
    }

    public void copyFile(String sourceFile, String destinationFile) {
        try {
            readFile(sourceFile);
            writeFile(destinationFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (FileSystemException e) {
            throw new RuntimeException(e);
        }
    }
}
```

---

### **My solution: [Link](./src/)**  

```java
import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

public class Solution {

    public static final String FAILED_TO_READ = "Не вдалося прочитати файл.";
    public static final String FAILED_TO_WRITE = "Не вдалося записати у файл.";

    public static FileManager fileManager = new FileManager();

    public static void main(String[] args) {
        try {
            fileManager.copyFile("book.txt", "book_final_copy.txt");
            fileManager.copyFile("book_final_copy.txt", "book_last_copy.txt");
        } catch (RuntimeException e) {
            Throwable cause = e.getCause();
            if (cause instanceof FileNotFoundException) {
                System.out.println(FAILED_TO_READ);
            } else if (cause instanceof FileSystemException) {
                System.out.println(FAILED_TO_WRITE);
            }
        }
    }
}
```

```java
import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

public class FileManager {

    private void readFile(String filePath) throws FileNotFoundException {
        System.out.println("Читаємо вміст файлу " + filePath);
    }

    private void writeFile(String filePath) throws FileSystemException {
        System.out.println("Записуємо дані в файл " + filePath);
    }

    public void copyFile(String sourceFile, String destinationFile) {
        try {
            readFile(sourceFile);
            writeFile(destinationFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (FileSystemException e) {
            throw new RuntimeException(e);
        }
    }
}
```
