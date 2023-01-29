### **The task to solve:**  

Напиши програму, яка зчитує рядки з клавіатури та виводить у консоль такі повідомлення: якщо введений рядок є шляхом до існуючого файлу "`<уведений рядок> - це файл`". Якщо введений рядок є шляхом до існуючої директорії "`<уведений рядок> - це директорія`".  
Якщо рядок не є шляхом до файлу чи директорії, програма завершується. Кутові дужки та лапки виводити не потрібно.  
Для перевірки наявності файлів і директорій використовуй методи `isRegularFile()` і `isDirectory()` класу `Files`.

**Приклад виведення:**

```
C:\javarush\text.txt - це файл
C:\javarush\ - це директорія
```

---

### **Requirements:**  

• Програма має зчитувати з клавіатури шляхи до файлів або директорій доти, доки не буде введено неправильний шлях.  
• Програма має виводити в консоль повідомлення про введений шлях згідно з умовою.  
• Для перевірки наявності файлів і директорій слід використовувати методи isRegularFiie() і isDirectory() класу Files.  
• Fie використовуй такі класи пакету java.іо: File, FilelnputStream, FileOutputStream, FileReader, FileWriter.

---

### **Start code:**  

```java
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {

    private static final String THIS_IS_FILE = " - це файл";
    private static final String THIS_IS_DIR = " - це директорія";
                         
    public static void main(String[] args) {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {

    private static final String THIS_IS_FILE = " - це файл";
    private static final String THIS_IS_DIR = " - це директорія";
                         
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Path path;
            do {
                path = Path.of(scan.nextLine());
                if (Files.exists(path) && Files.isRegularFile(path)) {
                    System.out.println(path.toString() + THIS_IS_FILE);
                } else if (Files.exists(path) && Files.isDirectory(path)) {
                    System.out.println(path.toString() + THIS_IS_DIR);
                }
            } while (Files.exists(path));
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }
    }
}
```
