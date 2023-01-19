### **The task to solve:**  

У класі `Solution` оголошено поле `grades` типу `HashMap<String, Double>`, де ключ - ім'я та прізвище студента, а значення - його середня оцінка.  

Цього разу твоє завдання - реалізувати методи:
- `printStudents`, який виводить тільки імена всіх студентів (ключ колекції);
- `getAverageMark`, який повертає середній бал усіх студентів.

---

### **Requirements:**  

• У класі Solution потрібно ініціалізувати публічне статичне поле grades типу HashMap\<String, Double>.  
• Метод printStudents має виводити імена та прізвища всіх студентів із колекції grades (кожну пару з нового рядка).  
• Метод getAverageMark має повертати середній бал усіх студентів із колекції grades.

---

### **Start code:**  

```java
import java.util.HashMap;

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println("Список студентів групи: ");
        printStudents();
        System.out.print("Середній бал групи: " + getAverageMark());
    }

    public static void addStudents() {
        grades.put("Давидов Олег", 4.3d);
        grades.put("Шульга Микола", 4.1d);
        grades.put("Колос Василь", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudents() {
        //напишіть тут ваш код
    }

    public static Double getAverageMark() {
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
        System.out.println("Список студентів групи: ");
        printStudents();
        System.out.print("Середній бал групи: " + getAverageMark());
    }

    public static void addStudents() {
        grades.put("Давидов Олег", 4.3d);
        grades.put("Шульга Микола", 4.1d);
        grades.put("Колос Василь", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudents() {
        for (String name : grades.keySet()) {
            System.out.println(name);
        }
    }

    public static Double getAverageMark() {
        double sum = 0;
        for (double mark : grades.values()) {
            sum += mark;
        }
        double avg = sum / grades.size();        
        return avg;
    }
}
```
