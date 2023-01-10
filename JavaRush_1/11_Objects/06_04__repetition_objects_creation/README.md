### **The task to solve:**  

Наше завдання - нагодувати їжачка. У методі `main` слід створити один об'єкт `Apple` і один об'єкт `Hedgehog`, у якого викликати метод   і передати потрібний аргумент - `яблуко`.

---

### **Requirements:**  

• Клас Hedgehog має містити вкладений клас public static class Apple.  
• Клас Hedgehog має містити нестатичний публічний метод eat(Apple) з типом повернення void.  
• У методі main має бути створено один об'єкт класу Apple.  
• У методі main має бути створено один об'єкт класу Hedgehog.  
• У методі main для об'єкта класу Hedgehog потрібно викликати метод eat і передати створений об'єкт класу Apple.

---

### **Start code:**  

```java
public class Hedgehog {

    public void eat(Apple apple) {
        System.out.println("Яблуко з'їли!");
    }

    public static void main(String[] args) {
        //напишіть тут ваш код
    }

    public static class Apple {
    }
}
```

---

### **My solution: [Link](./src/Hedgehog.java)**  

```java
public class Hedgehog {

    public void eat(Apple apple) {
        System.out.println("Яблуко з'їли!");
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        Hedgehog hedgehog = new Hedgehog();
        hedgehog.eat(apple);
    }

    public static class Apple {
    }
}
```
