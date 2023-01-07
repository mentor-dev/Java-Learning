### **The task to solve:**  

Реалізуй метод `setValues(long value)`, який записуватиме отримане значення параметра `value` в змінні `a`, `b`, `c` і `d`.  
Змінювати типи змінних `a`, `b`, `c` і `d` не можна.

---

### **Requirements:**  

• Типи змінних а, Ь, с і d не повинні змінитися.  
• Метод setValues(long value) має записувати отримане значення в змінні а, Ь, с і d.

---

### **Start code:**  

```java
public class Solution {
    public static byte a;
    public static short b;
    public static int c;
    public static long d;
                   
    public static void main(String[] args) {
        setValues(100);
    }

    public static void setValues(long value){
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static byte a;
    public static short b;
    public static int c;
    public static long d;
                   
    public static void main(String[] args) {
        setValues(100);
    }

    public static void setValues(long value){
        a = (byte) value;
        b = (short) value;
        c = (int) value;
        d = value;
    }
}
```
