### **The task to solve:**  

Напиши програму, яка зчитує з консолі шлях до `файлу1` і шлях до `файлу2`. Далі все байти з `файлу1` записує у `файл2`, але водночас міняє їх місцями за таким принципом: перший із другим, третій із четвертим і т. д.  
Якщо останній байт у `файлі1` непарний, то пишемо його у `файл2` як є.  
Для читання й запису файлів використовуй методи `newInputStream` і `newOutputStream` класу `Files`.

---

### **Requirements:**  

• Програма має зчитувати з консолі шляхи до файлів.  
• Програма має переписувати байти з одного файлу в інший згідно з умовою.  
• Для читання з файлів і запису у файли слід використати методи newinputStream і newOutputStream класу Files.  
• Потоки для читання й запису мають бути закриті.  
• Не використовуй такі класи пакету java.іо: File, FilelnputStream, FileOutputStream, FileReader, FileWriter.

---

### **Start code:**  

```java
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (Scanner scan = new Scanner(System.in);
            InputStream input = Files.newInputStream(Paths.get(scan.nextLine()));
            OutputStream out = Files.newOutputStream(Paths.get(scan.nextLine()))) {
            while (input.available() > 0) {
                if (input.available() > 1) {
                    int firstByte = input.read();
                    int secondByte = input.read();
                    out.write(secondByte);
                    out.write(firstByte);
                } else {
                    int firstByte = input.read();
                    out.write(firstByte);
                }
            }
        }
    }
}
```
