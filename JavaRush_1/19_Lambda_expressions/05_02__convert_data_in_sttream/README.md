### **The task to solve:**  

Реалізуй метод `toUpperCase(Stream<String>)` так, щоб він повертав потік таких самих рядків, що й у вхідному потоці, тільки у верхньому регістрі.  
Оскільки це буде потік уже інших рядків, для перетворення використовуй метод `map()` об'єкта типу `Stream<String>`.

Метод `main()` під час тестування не перевіряється.

---

### **Requirements:**  

• У публічному статичному методі toUpperCase(Stream\<String>) потрібно викликати метод map() об'єкта типу Stream\<String>.  
• Метод toUpperCase(Stream\<String>) потрібно реалізувати згідно з умовою.

---

### **Start code:**  

```java
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Не", "хвилюйтеся", "якщо", "щось", "не", "працює.", "Коли", "б", "усе", "працювало", "вас", "би", "звільнили.");

        toUpperCase(stream).forEach(System.out::println);
    }

    public static Stream<String> toUpperCase(Stream<String> strings) {
        //напишіть тут ваш код
        return Stream.empty();
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Не", "хвилюйтеся", "якщо", "щось", 
                "не", "працює.", "Коли", "б", "усе", "працювало", "вас", "би", 
                "звільнили.");

        toUpperCase(stream).forEach(System.out::println);
    }

    public static Stream<String> toUpperCase(Stream<String> strings) {
        return strings.map(x -> x.toUpperCase());
    }
}
```
