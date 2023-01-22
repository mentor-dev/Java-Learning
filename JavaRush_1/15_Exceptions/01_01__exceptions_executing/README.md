### **The task to solve:**  

Спершу розберися, що робить програма, а потім виконай такі дії:

1. У методі `addUser` оброби значення, що його повертає метод `setName`:
    - якщо `setName` повернув `-1`, виведи повідомлення: "`Ім'я не може бути null.`"
     - якщо `-2`, виведи повідомлення: "`Ім'я не може бути порожнім.`"
    - якщо `-3`, виведи повідомлення: "`Ім'я не може містити цифри.`"
    - якщо інше значення, крім `0`, виведи повідомлення: "`Невідома помилка.`"
2. У методі `addUser` оброби значення, що його повертає метод `setAge`:
    - якщо `setAge` повернув `-1`, виведи повідомлення: "`Вік не може бути меншим за 0.`"
    - якщо `-2`, виведи повідомлення: "`Вік не може бути більшим за 150.`"
    - якщо інше значення, крім `0`, виведи повідомлення "`Невідома помилка.`"
3. У методі `findUserIndex` оброби значення, що його повертає метод `indexOf`:
    - якщо `indexOf` повернув `-1`, виведи повідомлення "`Користувача '<<>ім'я користувача<>>' не знайдено.`"
    - інакше - залиш поточне повідомлення
4. Клас `User` не змінюй.

---

### **Requirements:**  

• Значення, що його повертає метод setName, має бути оброблено.  
• Значення, що його повертає метод setAge, має бути оброблено.  
• Значення, що його повертає метод indexOf, має бути оброблено.  

---

### **Start code:**  

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static final String INPUT_NAME = "\nВведіть ім'я: ";
    public static final String INPUT_AGE = "Введіть вік користувача '%s': ";

    public static final String CANNOT_BE_NULL = "Ім'я не може бути null.";
    public static final String CANNOT_BE_EMPTY = "Ім'я не може бути порожнім.";
    public static final String CANNOT_CONTAIN_DIGIT = "Ім'я не може містити цифри.";
    public static final String CANNOT_BE_NEGATIVE = "Вік не може бути меншим за 0.";
    public static final String CANNOT_BE_TOO_BIG = "Вік не може бути більшим за 150.";
    public static final String UNKNOWN_ERROR = "Невідома помилка.";

    public static final String FOUND = "\nКористувача '%s' знайдено з індексом %d.\n";
    public static final String NOT_FOUND = "\nКористувача '%s' не знайдено.\n";

    static List<User> users = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            addUser(new User());
        }

        User userToSearch = new User();
        userToSearch.setName("Рафаель");

        findUserIndex(userToSearch);
    }

    static void addUser(User user) {
        System.out.print(INPUT_NAME);
        String name = scanner.nextLine();

        System.out.printf(INPUT_AGE, name);
        int age = Integer.parseInt(scanner.nextLine());

        //напишіть тут ваш код
        user.setName(name);

        user.setAge(age);

        users.add(user);
    }

    static void findUserIndex(User user) {
        //напишіть тут ваш код
        System.out.printf(FOUND, user.getName(), users.indexOf(user));
    }
}
```

```java
import java.util.Objects;

public class User {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int setName(String name) {
        if (name == null) {
            return -1;
        } else if (name.isEmpty()) {
            return -2;
        } else if (name.matches(".*\\d.*")) {
            return -3;
        } else {
            this.name = name;
            return 0;
        }                 
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        if (age < 0) {
            return -1;
        } else if (age > 150) {
            return -2;
        } else {
            this.age = age;
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(getName(), user.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
```

---

### **My solution: [Link](./src/)**  

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static final String INPUT_NAME = "\nВведіть ім'я: ";
    public static final String INPUT_AGE = "Введіть вік користувача '%s': ";

    public static final String CANNOT_BE_NULL = "Ім'я не може бути null.";
    public static final String CANNOT_BE_EMPTY = "Ім'я не може бути порожнім.";
    public static final String CANNOT_CONTAIN_DIGIT = "Ім'я не може містити цифри.";
    public static final String CANNOT_BE_NEGATIVE = "Вік не може бути меншим за 0.";
    public static final String CANNOT_BE_TOO_BIG = "Вік не може бути більшим за 150.";
    public static final String UNKNOWN_ERROR = "Невідома помилка.";

    public static final String FOUND = "\nКористувача '%s' знайдено з індексом %d.\n";
    public static final String NOT_FOUND = "\nКористувача '%s' не знайдено.\n";

    static List<User> users = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            addUser(new User());
        }

        User userToSearch = new User();
        userToSearch.setName("Рафаель");

        findUserIndex(userToSearch);
    }

    static void addUser(User user) {
        System.out.print(INPUT_NAME);
        String name = scanner.nextLine();

        System.out.printf(INPUT_AGE, name);
        int age = Integer.parseInt(scanner.nextLine());

        int setNameRes = user.setName(name);
        if (setNameRes == -1) {
            System.out.println(CANNOT_BE_NULL);
        } else if (setNameRes == -2) {
            System.out.println(CANNOT_BE_EMPTY);
        } else if (setNameRes == -3) {
            System.out.println(CANNOT_CONTAIN_DIGIT);
        } else if (setNameRes != 0) {
            System.out.println(UNKNOWN_ERROR);
        }

        int setAgeRes = user.setAge(age);
        if (setAgeRes == -1) {
            System.out.println(CANNOT_BE_NEGATIVE);
        } else if (setAgeRes == -2) {
            System.out.println(CANNOT_BE_TOO_BIG);
        } else if (setAgeRes != 0) {
            System.out.println(UNKNOWN_ERROR);
        }

        users.add(user);
    }

    static void findUserIndex(User user) {
        int userIndex = users.indexOf(user);
        if (userIndex == -1) {
            System.out.printf(NOT_FOUND, user.getName());
        } else {
            System.out.printf(FOUND, user.getName(), userIndex);
        }
    }
}
```

```java
import java.util.Objects;

public class User {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int setName(String name) {
        if (name == null) {
            return -1;
        } else if (name.isEmpty()) {
            return -2;
        } else if (name.matches(".*\\d.*")) {
            return -3;
        } else {
            this.name = name;
            return 0;
        }                 
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        if (age < 0) {
            return -1;
        } else if (age > 150) {
            return -2;
        } else {
            this.age = age;
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(getName(), user.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
```
