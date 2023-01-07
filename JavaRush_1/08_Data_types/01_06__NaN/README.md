### **The task to solve:**  

У методі `main` виклич метод `div()` із таким аргументом, щоб у консоль було виведено "`NaN`".  
Код методу `div()` змінювати не можна.

---

### **Requirements:**  

• У методі main() потрібно викликати метод div().  
• У результаті виклику методу div() у консоль має бути виведено "NaN".  
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
        div(0.0, 0.0);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
```
