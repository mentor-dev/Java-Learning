### **The task to solve:**  

У класі `Solution` оголошено поле `grades` типу `HashMap<String, Double>`, де ключ - ім'я та прізвище студента, а значення - його середня оцінка.  
Твоє завдання - реалізувати метод `addStudents`, який додасть `5` студентів разом з їхньою середньою оцінкою в колекцію `grades`.  
Можна вибирати будь-які значення.

---

### **Requirements:**  

• У класі Solution потрібно ініціалізувати публічне статичне поле grades типу HashMap\<String, Double>.  
• Клас Solution має містити публічний статичний метод addStudents, який не повертає жодного значення (тип void).  
• Метод addStudents має додавати 5 студентів разом з їхньою середньою оцінкою в поле grades.

---

### **Start code:**  

```java
import java.util.HashMap;

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.HashMap;

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Brad Pitt", 4.45);
        grades.put("Angelina Jolie", 4.21);
        grades.put("Sandra Bullock", 4.1);
        grades.put("Bruce Willis", 3.84);
        grades.put("Natalie Portman", 4.92);
    }
}
```
