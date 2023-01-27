### **The task to solve:**  

Програма зчитує з консолі рядок і виводить його на екран, чергуючи регістр символів: перший символ - у нижньому регістрі, другий - у верхньому, третій - у нижньому і т. д.  
Не змінюючи функцій програми, перепиши код із використанням `BufferedReader` для читання з консолі.

---

### **Requirements:**  

• Програма має зчитати з консолі рядок і ввести його на екран, чергуючи регістр символів.  
• Для читання з консолі в програмі слід використати BufferedReader замість Scanner.

---

### **Start code:**  

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (InputStream stream = System.in;
             Scanner console = new Scanner(stream)) {
            String line = console.nextLine();
            char[] chars = line.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (i % 2 == 1) {
                    System.out.print(String.valueOf(chars[i]).toUpperCase());
                } else {
                    System.out.print(String.valueOf(chars[i]).toLowerCase());
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try (InputStream stream = System.in;
            InputStreamReader reader = new InputStreamReader(stream);
            BufferedReader buffer = new BufferedReader(reader)) {
            String line = buffer.readLine();
            char[] chars = line.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (i % 2 == 1) {
                    System.out.print(String.valueOf(chars[i]).toUpperCase());
                } else {
                    System.out.print(String.valueOf(chars[i]).toLowerCase());
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
```
