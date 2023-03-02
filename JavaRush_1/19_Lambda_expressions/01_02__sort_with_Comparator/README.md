### **The task to solve:**  

У класі `Solution` є статичне поле `students`, яке заповнюється студентами (об'єктами типу `Student`) у методі `main()`.  
Студент (клас `Student`) має ім'я (поле `name`) і вік (поле `age`). У програмі потрібно відсортувати студентів за віком у порядку спадання (від найстаршого до наймолодшого).  
Для цього використовується метод `Collections.sort(ArrayList<Student>, Comparator<Student>)`, в який передається список студентів `students` і компаратор сортування за спаданням значень віку.

**Твоє завдання** - реалізувати цей компаратор. Для цього в класі `AgeComparator` слід імплементувати інтерфейс `Comparator<Student>` і реалізувати метод `int compare(Student student1, Student student2)`, який повертає числове значення згідно з такими умовами:
- від'ємне число, якщо вік студента `student1` перевищує вік студента `student2`;
- додатне число, якщо вік студента `student1` менший за вік студента `student2`;
- `0`, якщо вік студентів `student1` і `student2` однаковий.

Метод `main()` під час тестування не перевіряється.

---

### **Requirements:**  

• У класі AgeComparator потрібно реалізувати інтерфейс Comparator\<Student>.  
• У класі AgeComparator потрібно створити публічний метод int compare(Student, Student).  
• Метод compare(Student, Student) потрібно реалізувати згідно з умовою.

---

### **Start code:**  

```java
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(students,
                new Student("Іваненко", 22),
                new Student("Петренко", 18),
                new Student("Сидоренко", 19)
        );

        Collections.sort(students, new AgeComparator());

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
```

```java
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Студент - " + name +
                ", вік - " + age +
                '.';
    }
}
```

```java
import java.util.Comparator;

public class AgeComparator {
    //напишіть тут ваш код
}
```

---

### **My solution: [Link](./src/)**  

```java
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(students,
                new Student("Іваненко", 22),
                new Student("Петренко", 18),
                new Student("Сидоренко", 19)
        );

        Collections.sort(students, new AgeComparator());

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
```

```java
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Студент - " + name +
                ", вік - " + age +
                '.';
    }
}
```

```java
import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    public int compare(Student student1, Student student2) {
        return (student2.getAge() - student1.getAge());
    }
}
```
