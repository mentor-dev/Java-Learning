### **The task to solve:**  

Напиши програму, яка зчитує з клавіатури два шляхи й виводить у консоль відносний шлях між цими шляхами, якщо він існує. В іншому випадку нічого виводити не потрібно.

**Підказка:** якщо не вдалося знайти відносний шлях між `шлях1` і `шлях2`, спробуй знайти відносний шлях між `шлях2` і `шлях1`.

---

### **Requirements:**  

• Програма має зчитувати з консолі два шляхи.  
• Програма має виводити в консоль відносний шлях між уведеними шляхами, якщо він існує.  
• Для обчислення відносного шляху слід використати метод relativize() класу Path.  
• Не використовуй такі класи пакету java.іо: File, FilelnputStream, FileOutputStream, FileReader, FileWriter.

---

### **Start code:**  

```java
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
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
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        scanner.close();
        Path path1 = Path.of(str1);
        Path path2 = Path.of(str2);
        if (path1.equals(path2)) return;
        try {
            System.out.println((path1.relativize(path2)).toString());
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }
    }
}
```
