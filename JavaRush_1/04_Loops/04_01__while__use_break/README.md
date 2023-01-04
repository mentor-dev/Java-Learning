### **The task to solve:**  

Вводимо дані з клавіатури й одразу виводимо їх на екран, доки не буде введено слово "`enough`".  
Слово "`enough`" виводити не потрібно.  
Для цього потрібно використовувати нескінченний цикл (`while(true)`).

**Підказка:**  
щоб завершити нескінченний цикл, використай оператор `break`.

---

### **Requirements:**  

• Програма повинна зчитувати дані з клавіатури.  
• У програмі потрібно використовувати цикл while.  
• Для завершення нескінченного циклу слід використати оператор break.  
• Програма повинна виводити на консоль усі введені дані з нового рядка, доки не буде введено слово "enough".  

---

### **Start code:**  

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String stop_word = "enough";
        Scanner scan = new Scanner(System.in);
        while (true) {
            String line = scan.nextLine();
            if (line.equals(stop_word)) {
                scan.close();
                break;
            }
            System.out.println(line);
        }
    }
}
```