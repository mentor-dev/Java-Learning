### **The task to solve:**  

У класі `Faculty` є метод `printStudentNames(ArrayList)`, який отримує список об'єктів і виводить їхні імена. Однак наразі програма не компілюється.  
Твоє завдання - виправити цей баг. Для цього потрібно виправити сигнатуру методу `printStudentNames(ArrayList)` так, щоб він отримував список об'єктів лише типу `Student` (використовуй узагальнення).  
Метод `main` у перевірці не використовується.

---

### **Requirements:**  

• Виправ сигнатуру методу printStudentNames так, щоб він отримував список лише студентів.  
• Реалізацію методу printStudentNames не змінювати.

---

### **Start code:**  

```java
import java.util.ArrayList;

public class Faculty {

    public static void main(String[] args) {
        var students = new ArrayList<Student>();
        students.add(new Student("Акакій"));
        students.add(new Student("Любослав"));

        printStudentNames(students);
    }

    public static void printStudentNames(ArrayList students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }
    }
}
```

```java
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

---

### **My solution: [Link](./src/)**  

```java
import java.util.ArrayList;

public class Faculty {

    public static void main(String[] args) {
        var students = new ArrayList<Student>();
        students.add(new Student("Акакій"));
        students.add(new Student("Любослав"));

        printStudentNames(students);
    }

    public static void printStudentNames(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }
    }
}
```

```java
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```
