### **The task to solve:**  

У методі `main` перетвори рядок `string` на тип `double` за допомогою статичного методу `parseDouble` класу `Double`.  
Потім округли отримане значення за допомогою статичного методу `round` класу `Math`.  
Результат виведи на екран.

---

### **Requirements:**  

• У методі main потрібно викликати метод parseDouble класу Double.  
• У методі main потрібно викликати метод round класу Math.  
• У консоль має бути виведено число 13.

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        long result = Math.round(Double.parseDouble(string));
        System.out.println(result);
    }
}
```
