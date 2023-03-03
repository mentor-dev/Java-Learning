### **The task to solve:**  

У класі `Solution` є статичне поле `mentors`, яке заповнюється менторами `JavaRush` (об'єктами типу `JavaRushMentor`) в методі `main()`.  
Ментор (клас `JavaRushMentor`) має ім'я (поле `name`). У програмі потрібно відсортувати менторів за довжиною імені в порядку зростання (від найкоротшого до найдовшого).  

Щоб відсортувати всіх менторів у списку mentors використовується метод `Collections.sort(ArrayList<JavaRushMentor>, Comparator<JavaRushMentor>)`, в який передається список менторів `mentors` і компаратор сортування.  

**Твоє завдання** - реалізувати цей компаратор. Для цього в класі `NameComparator` слід імплементувати інтерфейс `Comparator<JavaRushMentor>` і реалізувати метод `int compare(JavaRushMentor mentor1, JavaRushMentor mentor2)`, який повертає числове значення згідно з такими умовами:
- від'ємне число, якщо довжина імені ментора `mentor1` менша за довжину імені ментора `mentor2`;
- додатне число, якщо довжина імені ментора `mentor1` перевищує довжину імені ментора `mentor2`;
- `0`, якщо довжина імен менторів `mentor1` і `mentor2` однакова.

Метод `main()` під час тестування не перевіряється.

---

### **Requirements:**  

• У класі NameComparator потрібно реалізувати інтерфейс Comparator\<JavaRushMentor>.  
• У класі NameComparator потрібно створити публічний метод int compare(JavaRushMentor, JavaRushMentor).  
• Метод compare(JavaRushMentor, JavaRushMentor) потрібно реалізувати згідно з умовою.

---

### **Start code:**  

```java
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static ArrayList<JavaRushMentor> mentors = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(mentors,
                new JavaRushMentor("Джон Бобров"),
                new JavaRushMentor("Ріша"),
                new JavaRushMentor("Елеонора Керрі"),
                new JavaRushMentor("Ханс Нудлс"),
                new JavaRushMentor("Кім"),
                new JavaRushMentor("Хуліо Сієста"),
                new JavaRushMentor("Дієго"),
                new JavaRushMentor("Лага Білаабо")
        );

        Collections.sort(mentors, new NameComparator());

        for (JavaRushMentor mentor : mentors) {
            System.out.println(mentor);
        }
    }
}
```

```java
public class JavaRushMentor {
    private String name;

    public JavaRushMentor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Ментор на ім'я - " + name;
    }
}
```

```java
import java.util.Comparator;
                        
public class NameComparator {
    //напишіть тут ваш код
}
```

---

### **My solution: [Link](./src/)**  

```java
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static ArrayList<JavaRushMentor> mentors = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(mentors,
                new JavaRushMentor("Джон Бобров"),
                new JavaRushMentor("Ріша"),
                new JavaRushMentor("Елеонора Керрі"),
                new JavaRushMentor("Ханс Нудлс"),
                new JavaRushMentor("Кім"),
                new JavaRushMentor("Хуліо Сієста"),
                new JavaRushMentor("Дієго"),
                new JavaRushMentor("Лага Білаабо")
        );

        Collections.sort(mentors, new NameComparator());

        for (JavaRushMentor mentor : mentors) {
            System.out.println(mentor);
        }
    }
}
```

```java
public class JavaRushMentor {
    private String name;

    public JavaRushMentor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Ментор на ім'я - " + name;
    }
}
```

```java
import java.util.Comparator;
                        
public class NameComparator implements Comparator<JavaRushMentor> {
    public int compare(JavaRushMentor mentor1, JavaRushMentor mentor2) {
        return (mentor1.getName().length() - mentor2.getName().length());
    }
}
```
