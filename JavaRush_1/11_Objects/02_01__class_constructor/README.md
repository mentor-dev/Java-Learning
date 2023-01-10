### **The task to solve:**  

Спробуймо спорудити свій перший хмарочос і оголосити про результат виконання в консолі. Для цього тобі потрібно викликати конструктор класу `Skyscraper` в методі `main` і в тілі конструктора вивести в консоль текст "`Хмарочос побудовано.`".

---

### **Requirements:**  

• Клас Skyscraper має містити публічний конструктор без параметрів.  
• У методі main тобі потрібно створити один об'єкт класу Skyscraper.  
• У конструкторі класу Skyscraper має виводитися в консоль текст "Хмарочос побудовано."

---

### **Start code:**  

```java
public class Skyscraper {

    //напишіть тут ваш код

    public static void main(String[] args) {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Skyscraper.java)**  

```java
public class Skyscraper {

    public Skyscraper() {
        System.out.println("Хмарочос побудовано.");
    }

    public static void main(String[] args) {
        new Skyscraper();
    }
}
```
