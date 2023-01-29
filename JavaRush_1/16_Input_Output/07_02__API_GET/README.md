### **The task to solve:**  

Твоє завдання - звернутися до публічного `API` в інтернеті й отримати дані. Напиши програму, яка звертається за посиланням до публічного `API` в інтернеті, отримує дані та виводить їх на екран.

**Підказки:**  
- Використай метод `openStream()` класу URL.  
- Якщо ти не знаєш, який `API` можна використати, запитай на нашому сервері список проєктів-ігор: https://javarush.com/api/1.0/rest/projects

---

### **Requirements:**  

• Програма має виводити отриману інформацію на екран.  
• Програма має містити виклик методу openStream() класу URL.

---

### **Start code:**  

```java
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.com.ua/api/1.0/rest/projects");
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.com.ua/api/1.0/rest/projects");
        try (InputStream input = url.openStream()) {
            byte[] buffer = input.readAllBytes();
            String result = new String(buffer);
            System.out.println(result);
        }
    }
}
```
