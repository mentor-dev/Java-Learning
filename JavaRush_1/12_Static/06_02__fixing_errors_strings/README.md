### **The task to solve:**  

Програма має зчитати з консолі рядок і вивести його на екран у нижньому регістрі. Виправ помилку в коді, щоб програма компілювалася й працювала.

---

### **Requirements:**  

• Програма має зчитати з консолі рядок і вивести його на екран у нижньому регістрі.

---

### **Start code:**  

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String line = console.nextLine();
        line.toLowerCase();
        System.out.println(line);
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String line = console.nextLine();
        console.close();
        String newLine = line.toLowerCase();
        System.out.println(newLine);
    }
}
```
