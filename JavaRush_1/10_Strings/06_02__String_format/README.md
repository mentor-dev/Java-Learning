### **The task to solve:**  

Реалізуй метод `format(String name, int salary)`, який повертатиме такий рядок:  
Мене звати `<name>`. Я зароблятиму `$<salary>` на місяць.

Скористайся для цього методом `String.format()`.

---

### **Requirements:**  

• Метод format(String, int) має використовувати метод String. format().  
• Метод format(String, int) має повертати рядок згідно
з умовою задачі.

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println(format("Аміго", 5000));
    }

    public static String format(String name, int salary) {
        String phrase = "Мене звати . Я зароблятиму $ на місяць.";
        //напишіть тут ваш код
        return null;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println(format("Аміго", 5000));
    }

    public static String format(String name, int salary) {
        String phrase = String.format("Мене звати %s. Я зароблятиму $%d на місяць.", name, salary);
        return phrase;
    }
}
```
