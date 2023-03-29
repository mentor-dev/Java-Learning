### **The task to solve:**  

Обліковий запис (клас `Account`) має ім'я (поле `name`) і електронну скриньку (поле `email`). Потрібно, щоб метод `getEmails(ArrayList<Account>)` у класі `Solution` повертав потік електронних скриньок усіх облікових записів зі списку, отриманого як вхідний аргумент.

**Підказка:**  
Для перетворення потоку даних одного типу на інший використовуй метод `map()` об'єкта типу `Stream<Account>`.

Метод `main()` під час тестування не перевіряється.

---

### **Requirements:**  

• У публічному статичному методі getEmails(ArrayList\<Account>) потрібно викликати метод map() об'єкта типу Stream\<Account>.  
• Метод getEmails(ArrayList\<Account>) потрібно реалізувати згідно з умовою.

---

### **Start code:**  

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        var accounts = new ArrayList<Account>();
        Collections.addAll(accounts,
                new Account("Elly", "elly@yandex.ru"),
                new Account("Jocker", "jocker@gmail.com"),
                new Account("Neo", "neo@yahoo.com"));

        Stream<String> emails = getEmails(accounts);
        emails.forEach(System.out::println);
    }

    public static Stream<String> getEmails(ArrayList<Account> accounts) {
        //напишіть тут ваш код
        return Stream.empty();
    }
}
```

```java
public class Account {
    private String name;
    private String email;

    public Account(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }
                        
    public String getEmail() {
        return email;
    }
}
```

---

### **My solution: [Link](./src/)**  

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        var accounts = new ArrayList<Account>();
        Collections.addAll(accounts,
                new Account("Elly", "elly@yandex.ru"),
                new Account("Jocker", "jocker@gmail.com"),
                new Account("Neo", "neo@yahoo.com"));

        Stream<String> emails = getEmails(accounts);
        emails.forEach(System.out::println);
    }

    public static Stream<String> getEmails(ArrayList<Account> accounts) {
        return accounts.stream().map(x -> x.getEmail());
    }
}
```

```java
public class Account {
    private String name;
    private String email;

    public Account(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }
                        
    public String getEmail() {
        return email;
    }
}
```