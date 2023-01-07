### **The task to solve:**  

У методі main виклич метод `div()` двічі. Перший раз - із такими аргументами, щоб у консоль було виведено "`Infinity`", а другий - "`-Infinity`".  
Код методу `div()` змінювати не можна.

---

### **Requirements:**  

• У методі main() потрібно двічі викликати метод div().  
• У результаті двох викликів методу div() у консоль має бути виведено "Infinity" й "-Infinity".  
• Не змінюй код методу div().

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static void main(String[] args) {
        div(0.0, 1.0);
        div(0.0, -1.0);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
```
