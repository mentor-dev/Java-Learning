### **The task to solve:**  

Програма зчитує з консолі номер, знаходить у журналі відповідного студента й викликає його (її) до дошки.  
Методи `parseInt` і `get` можуть генерувати винятки `NumberFormatException` і `ArrayIndexOutOfBoundsException`. Обгорни їх одним блоком `try` із двома блоками `catch`.  
Блок `catch` для `NumberFormatException` має виводити повідомлення: "`Потрібно ввести ціле число`", а блок `catch` для `ArrayIndexOutOfBoundsException` має виводити повідомлення: "`Студента з таким номером не існує`".

---

### **Requirements:**  

• Програма має продовжити роботу в разі виникнення NumberFormatException.  
• Програма має виводити повідомлення: "Потрібно ввести ціле число" кожного разу під час виникнення NumberFormatException.  
• Програма має продовжити роботу в разі виникнення ArraylndexOutOfBoundsException.  
• Програма має виводити повідомлення: "Студента з таким номером не існує" кожного разу під час виникнення ArraylndexOutOfBoundsException.  
• Програма має містити один блок try і два блоки catch.

---

### **Start code:**  

```java
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static final String PROMPT_STRING = "Введіть номер студента, або exit щоб вийти: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "Відповідає ";
    public static final String NOT_EXIST = "Студента з таким номером не існує";
    public static final String INTEGER_REQUIRED = "Потрібно ввести ціле число";

    static List<String> studentsJournal = Arrays.asList(
            "Тимур М'ясний"
            , "Пенелопа Сиволап"
            , "Орест Злобін"
            , "Ірида Продуваленко"
            , "Гектор Гадюкін"
            , "Електра Чемоданко"
            , "Гвідон Недумко"
            , "Роксана Борисенко"
            , "Юліан Мумбриченко"
            , "Зігфрід Горемикін");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(PROMPT_STRING);
            String input = scanner.nextLine();
            if (input.toLowerCase().equals(EXIT)) {
                break;
            }

            int studentId = Integer.parseInt(input);
            System.out.println(ANSWERING + studentsJournal.get(studentId));
        }
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static final String PROMPT_STRING = "Введіть номер студента, або exit щоб вийти: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "Відповідає ";
    public static final String NOT_EXIST = "Студента з таким номером не існує";
    public static final String INTEGER_REQUIRED = "Потрібно ввести ціле число";

    static List<String> studentsJournal = Arrays.asList(
            "Тимур М'ясний"
            , "Пенелопа Сиволап"
            , "Орест Злобін"
            , "Ірида Продуваленко"
            , "Гектор Гадюкін"
            , "Електра Чемоданко"
            , "Гвідон Недумко"
            , "Роксана Борисенко"
            , "Юліан Мумбриченко"
            , "Зігфрід Горемикін");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(PROMPT_STRING);
            String input = scanner.nextLine();
            if (input.toLowerCase().equals(EXIT)) {
                break;
            }

            try {
                int studentId = Integer.parseInt(input);
                System.out.println(ANSWERING + studentsJournal.get(studentId));
            } catch (NumberFormatException e) {
                System.out.println(INTEGER_REQUIRED);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(NOT_EXIST);
            }
        }
    }
}
```
