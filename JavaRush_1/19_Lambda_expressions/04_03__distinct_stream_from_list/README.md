### **The task to solve:**  

Метод `getDistinct(ArrayList<String>)` отримує список слів, який містить повтори. Твоє завдання - реалізувати цей метод так, щоб він повертав потік слів без повторів (кожне слово - лише по одному разу).  
У цьому тобі допоможе метод `distinct()` об'єкта типу `Stream<String>`.

Метод `main()` під час тестування не перевіряється.

---

### **Requirements:**  

• У публічному статичному методі getDistinct(ArrayList\<String>) потрібно викликати метод distinct() об'єкта типу Stream\<String>.  
• Потрібно, щоб метод getDistinct(ArrayList\<String>) повертав потік слів без повторів.

---

### **Start code:**  

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        var words = new ArrayList<String>();
        Collections.addAll(words, "щоб", "стати", "програмістом", "потрібно", "програмувати",
                "а", "щоб", "програмувати", "потрібно", "вчитися");
                           
        Stream<String> distinctWords = getDistinctWords(words);
        distinctWords.forEach(System.out::println);
    }

    public static Stream<String> getDistinctWords(ArrayList<String> words) {
        //напишіть тут ваш код
        return Stream.empty();
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        var words = new ArrayList<String>();
        Collections.addAll(words, "щоб", "стати", "програмістом", "потрібно", 
            "програмувати", "а", "щоб", "програмувати", "потрібно", "вчитися");
                           
        Stream<String> distinctWords = getDistinctWords(words);
        distinctWords.forEach(System.out::println);
    }

    public static Stream<String> getDistinctWords(ArrayList<String> words) {
        return words.stream().distinct();
    }
}
```
