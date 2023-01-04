### **The task to solve:**  

У цій задачі тобі потрібно:

Зчитати `6` рядків і заповнити ними масив `strings`.  
Видалити повторювані рядки з масиву `strings`, замінивши їх на `null` (`null` не повинен бути рядком `"null"`).  

**Приклади.**  
Масив після зчитування рядків:  
`{"Hello", "Hello", "World", "Java", "Tasks", "World"} `  
Масив після видалення повторюваних рядків:  
`{null, null, null, "Java", "Tasks", null}`

---

### **Requirements:**  

• У методі main(String[]) зчитай з клавіатури 6 рядків і заповни ними масив strings.  
• У методі main(String[]) видали (заміни рядок на null) елементи масиву strings, які містять однакові рядки.

---

### **Start code:**  

```java
public class Solution {
    public static String[] strings;

    public static void main(String[] args) {

        //напишіть тут ваш код

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}

```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.Scanner;

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        strings = new String[6];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            strings[i] = scan.nextLine();
        }
        scan.close();
        for (int i = 0; i < strings.length - 1; i++) {
            if (strings[i] == null) continue;
            String tmp = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[j] == null) continue;
                if (tmp.equals(strings[j])) {
                    strings[j] = null;
                    if (strings[i] != null) {
                        strings[i] = null;
                    }
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
```
