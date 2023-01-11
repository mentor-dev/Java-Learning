### **The task to solve:**  

Метод `main` має додавати двох студентів у масив і виводити їхні імена в консоль за допомогою методу `printStudents`.  
Зроби виправлення в методі `main`, щоб програма запрацювала.

---

### **Requirements:**  

• Клас University має містити приватне нестатичне поле students типу String[] із модифікатором final, яке відразу ініціалізується.  
• Клас University має містити метод public void addStudent(String), який додає передане ім'я студента в список students.  
• Клас University має містити метод public void printStudents, який виводить імена всіх студентів у консоль.  
• Метод main має двічі викликати метод addStudent.  
• Метод main має викликати метод printStudents один раз.

---

### **Start code:**  

```java
public class University {
    private final String[] students = new String[30];

    public void addStudent(String student) {
        int i = 0;
        for (; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
        }
        students[i] = student;
    }

    public void printStudents() {
        for (String student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        //напишіть тут ваш код
        addStudent("Максим Федоренко");
        addStudent("Олег Кесарчук");
        printStudents();
    }
}
```

---

### **My solution: [Link](./src/University.java)**  

```java
public class University {
    private final String[] students = new String[30];

    public void addStudent(String student) {
        int i = 0;
        for (; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
        }
        students[i] = student;
    }

    public void printStudents() {
        for (String student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        University group = new University();
        group.addStudent("Максим Федоренко");
        group.addStudent("Олег Кесарчук");
        group.printStudents();
    }
}
```
