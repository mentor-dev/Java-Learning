### **The task to solve:**  

Напиши програму, яка зчитує з консолі ім'я текстового файлу, далі читає символи з цього файлу (використай метод `readAllLines(Path)` класу `Files`) і виводить на екран усе, крім крапок, ком і пробілів.

---

### **Requirements:**  

• Програма має зчитувати з консолі шлях до файлу.  
• Програма має вивести в консоль вміст файлу згідно з умовою.  
• Для читання рядків із файлу слід використати метод readAIILines(Path) класу Files.  
• Не використовуй такі класи пакету java.іо: File, FilelnputStream, FileOutputStream, FileReader, FileWriter.

---

### **Start code:**  

```java
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
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
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            List<String> list = Files.readAllLines(Paths.get(scan.nextLine()));
            for (String string : list) {
                String clearString = string.replaceAll("[., ]", "");
                System.out.println(clearString);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }
    }
}
```
