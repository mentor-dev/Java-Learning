### **The task to solve:**  

Твоє завдання - звернутися до публічного API в інтернеті: надіслати й отримати дані.  
Напиши програму, яка звертається за посиланням до публічного API в інтернеті, надсилає туди дані, отримує дані у відповідь і виводить їх на екран.

**Підказки:**  
- Використай метод `openConnection()` класу `URL`.
- Використай методи `setDoOutput(true)` і `getOutputStream()` класу `URLConnection`.
- Якщо ти не знаєш, який API можна використати, скористайся цим: http://httpbin.org/post

---

### **Requirements:**  

• Програма має виводити отриману інформацію на екран.  
• Програма має містити виклик методу openConnection() класу URL.  
• Програма має містити виклики методів setDoOutput(true), getOutputStream() і getUnputStream() класу URLConnection.

---

### **Start code:**  

```java
import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
        try (OutputStream output = connection.getOutputStream();
             InputStream input = connection.getInputStream()) {
            // output.write(0);
            output.flush();
            BufferedReader buffer = new BufferedReader(new InputStreamReader(input));
            while (buffer.ready()) {
                System.out.println(buffer.readLine());
            }
        }
    }
}
```
