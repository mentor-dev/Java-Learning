### **The task to solve:**  

Напиши програму, в якій користувач уводить з клавіатури шлях до файлу або папки, після чого в консоль виводиться шлях до диска (корінь для шляху в стилі Unix), на якому розташовано цей файл (або папку).  
Для розв'язання задачі використовуй Path і його методи.

---

### **Requirements:**  

• Програма має зчитувати з консолі шлях до файлу / папки.  
• Програма має виводити в консоль шлях до диска, на якому розташовано цей файл або папку.  
• Для отримання шляху до диска з переданого шляху потрібно використати метод getRoot() класу Path.  
• Не використовуй такі класи пакету java.іо: File, FilelnputStream, FileOutputStream, FileReader, FileWriter.

---

### **Start code:**  

```java
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        Path path = Path.of(str);
        Path root = path.getRoot();
        System.out.println(root.toString());
    }
}
```
