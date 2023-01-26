### **The task to solve:**  

Програма читає з консолі рядок і виводить його на екран у верхньому регістрі. Однак, виявляється, вона не працюватиме на старих версіях Java (нижче 7-ї версії).  
Не змінюючи функцій програми, заміни блок `try-with-resources` на звичайний `try-catch`.  
Не забудь про виклик методу `close()` для об'єктів із зовнішніми ресурсами.

---

### **Requirements:**  

• Програма має зчитати з консолі рядок і вивести його на екран у верхньому регістрі.  
• У програмі має використовуватися блок try-catch без ресурсів.  
• У об'єктів із зовнішніми ресурсами потрібно викликати метод close() у блоці finally.  

---

### **Start code:**  

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String line = scanner.nextLine();
            System.out.println(line.toUpperCase());
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            System.out.println(line.toUpperCase());
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        } finally {
            scanner.close();
        }
    }
}
```
