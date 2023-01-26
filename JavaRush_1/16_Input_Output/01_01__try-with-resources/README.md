### **The task to solve:**  

Програма читає з консолі рядок і виводить його на екран у нижньому регістрі. Не змінюючи функцій програми, перепиши код із використанням `try-with-resources`. Візьми в круглі дужки створення об'єктів із зовнішніми ресурсами. Не забудь видалити непотрібні виклики методу `close()`.

---

### **Requirements:**  

• Програма має зчитати з консолі рядок і вивести його на екран у нижньому регістрі.  
• У програмі має використовуватися оператор try-with-resources згідно з умовою.  
• У об'єктів із зовнішніми ресурсами не має бути явних викликів методу close().

---

### **Start code:**  

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            System.out.println(line.toLowerCase());
            reader.close();
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
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine();
            System.out.println(line.toLowerCase());
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
```
