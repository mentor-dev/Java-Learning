### **The task to solve:**  

У методі `copyFile` перехопи винятки, що їх кидають методи `readFile` і `writeFile`.  
Перехоплені винятки обгорни винятком `RuntimeException` і прокинь далі.

---

### **Requirements:**  

• У методі copyFile мають перехоплюватися винятки FileNotFoundException і FileSystemException.  
• Усі перехоплені винятки потрібно обгортати винятком RuntimeException і прокидати далі.  
• Метод copyFile не повинен містити винятків у секції throws.

---

### **Start code:**  

```java
import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

public class Solution {

    public static void main(String[] args) {
        copyFile("book.txt", "book_final_copy.txt");
        copyFile("book_final_copy.txt", "book_last_copy.txt");
    }
                      
    static void copyFile(String sourceFile, String destinationFile) {
        FileUtils.readFile(sourceFile);
        FileUtils.writeFile(destinationFile);
        //напишіть тут ваш код
    }
}
```

```java
import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

public class FileUtils {

    public static void readFile(String filePath) throws FileNotFoundException {
        System.out.println("Читаємо вміст файлу " + filePath);
    }

    public static void writeFile(String filePath) throws FileSystemException {
        System.out.println("Записуємо дані в файл " + filePath);
    }
}
```

---

### **My solution: [Link](./src/)**  

```java
import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

public class Solution {

    public static void main(String[] args) {
        copyFile("book.txt", "book_final_copy.txt");
        copyFile("book_final_copy.txt", "book_last_copy.txt");
    }
                      
    static void copyFile(String sourceFile, String destinationFile) {
        try {
            FileUtils.readFile(sourceFile);
            FileUtils.writeFile(destinationFile);
        } catch (FileNotFoundException eFNFE) {
            throw new RuntimeException(eFNFE);
        } catch (FileSystemException eFSE) {
            throw new RuntimeException(eFSE);
        } 
    }
}
```

```java
import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

public class FileUtils {

    public static void readFile(String filePath) throws FileNotFoundException {
        System.out.println("Читаємо вміст файлу " + filePath);
    }

    public static void writeFile(String filePath) throws FileSystemException {
        System.out.println("Записуємо дані в файл " + filePath);
    }
}
```
