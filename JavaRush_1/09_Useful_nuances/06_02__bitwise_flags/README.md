### **The task to solve:**  

Реалізуй методи:  

`setFlag(int number, int flagPos)` - встановлює значення "`1`" біту з індексом `flagPos` числа `number` і повертає нове значення.  
`resetFlag(int number, int flagPos)` - встановлює значення "`0`" біту з індексом `flagPos` числа `number` і повертає нове значення.  
`checkFlag(int number, int flagPos)` - перевіряє значення біта з індексом `flagPos` числа `number` і повертає `true`, якщо значення "`1`", і `false`, якщо "`0`".

---

### **Requirements:**  

• Реалізуй метод setFlag(int, int) згідно з умовою.  
• Реалізуй метод resetFlag(int, int) згідно з умовою.  
• Реалізуй метод checkFlag(int, int) згідно з умовою.  

---

### **Start code:**  

```java
public class Solution {

    public static int setFlag(int number, int flagPos) {
        //напишіть тут ваш код
        return 0;
    }

    public static int resetFlag(int number, int flagPos) {
        //напишіть тут ваш код
        return 0;
    }

    public static boolean checkFlag(int number, int flagPos) {
        //напишіть тут ваш код
        return false;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {

    public static int setFlag(int number, int flagPos) {
        return (number | (1 << flagPos));
    }

    public static int resetFlag(int number, int flagPos) {
        return (number & ~(1 << flagPos));
    }

    public static boolean checkFlag(int number, int flagPos) {
        return ((number & (1 << flagPos)) == (1 << flagPos));
    }
}
```
