### **The task to solve:**  

Клас `Bat` (кажан) успадковано від класу `Animal` (тварина). Усе логічно, от тільки під час виклику методу `move()` для об'єкта класу `Bat` у консоль буде виведено "`Я біжу!`".  
Навіщо ж бігти, якщо ти вмієш літати?  
Перевизнач метод `move()` для класу `Bat`, щоб він виводив у консоль "`Я лечу!`".  
Метод `main()` у тестуванні не використовується.

---

### **Requirements:**  

• Клас Animal не змінюй.  
• Клас Bat має успадковуватися від Animal.  
• У класі Bat має бути перевизначено метод move().  
• Метод move(), викликаний для об'єкта класу Bat, має виводити в консоль "Я лечу!".

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.move();
    }
}
```

```java
public class Animal {
    public void move(){
        System.out.println("Я біжу!");
    }
}
```

```java
public class Bat extends Animal {
    //напишіть тут ваш код
}
```

---

### **My solution: [Link](./src/)**  

```java
public class Solution {
    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.move();
    }
}
```

```java
public class Animal {
    public void move(){
        System.out.println("Я біжу!");
    }
}
```

```java
public class Bat extends Animal {
    @Override
    public void move(){
        System.out.println("Я лечу!");
    }
}
```
