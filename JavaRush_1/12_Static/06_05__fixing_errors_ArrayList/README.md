### **The task to solve:**  

Маємо групу в університеті й метод, який має відраховувати конкретного студента, але чомусь цей метод не працює.  
Твоє завдання - знайти й виправити помилку, щоб метод `exclude` таки зміг відрахувати студента.

---

### **Requirements:**  

• Клас UniversityGroup має містити публічне нестатичне поле students типу List\<String\>.  
• Клас UniversityGroup має містити публічний нестатичний метод exclude(String), який не повертає жодного значення (тип void).  
• Метод exclude повинен видаляти зі списку студента, ім'я якого передано в метод.

---

### **Start code:**  

```java
import java.util.ArrayList;
import java.util.List;

public class UniversityGroup {
    public List<String> students;

    public UniversityGroup() {
        students = new ArrayList<>();
        students.add("Сергій Фрединський");
        students.add("Віталій Правдивий");
        students.add("Максим Козименко");
        students.add("Наталія Андрющенко");
        students.add("Іра Величенко");
        students.add("Микола Соболєв");
        students.add("Сніжана Слободенюк");
    }

    public void exclude(String excludedStudent) {
        for (String student : students) {
            if (student.equals(excludedStudent)) {
                students.remove(student);
            }
        }
    }

    public static void main(String[] args) {
        UniversityGroup universityGroup = new UniversityGroup();
        universityGroup.exclude("Віталій Правдивий");
        universityGroup.students.forEach(System.out::println);
    }
}
```

---

### **My solution: [Link](./src/UniversityGroup.java)**  

```java
import java.util.ArrayList;
import java.util.List;

public class UniversityGroup {
    public List<String> students;

    public UniversityGroup() {
        students = new ArrayList<>();
        students.add("Сергій Фрединський");
        students.add("Віталій Правдивий");
        students.add("Максим Козименко");
        students.add("Наталія Андрющенко");
        students.add("Іра Величенко");
        students.add("Микола Соболєв");
        students.add("Сніжана Слободенюк");
    }

    public void exclude(String excludedStudent) {
        ArrayList<String> copy = new ArrayList<String>(students);
        for (String student : copy) {
            if (student.equals(excludedStudent)) {
                students.remove(student);
            }
        }
    }

    public static void main(String[] args) {
        UniversityGroup universityGroup = new UniversityGroup();
        universityGroup.exclude("Віталій Правдивий");
        universityGroup.students.forEach(System.out::println);
    }
}
```
