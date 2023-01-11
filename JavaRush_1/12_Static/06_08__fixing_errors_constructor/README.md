### **The task to solve:**  

Метод main класу `Solution` створює об'єкт класу `Student` із певним іменем, але програма не компілюється.  
Ти маєш виправити помилку в класі `Student`, щоб програма компілювалася та після запуску виводила в консоль ім'я студента.

---

### **Requirements:**  

• Не змінюй метод main.  
• Клас Student має містити конструктор з одним параметром.  
• Конструктор має ініціалізувати поле name отриманим аргументом.

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        Student student = new Student("Аміго");
        System.out.println(student.name);
    }
}
```

```java
public class Student {
    private String name;

    public void Student(String name) {
        name = name;
    }
}
```

---

### **My solution: [Link](./src/)**  

```java
public class Solution {
    public static void main(String[] args) {
        Student student = new Student("Аміго");
        System.out.println(student.name);
    }
}
```

```java
public class Student {
    public String name;

    public Student(String name) {
        this.name = name;
    }
}
```
