### **The task to solve:**  

В інтерфейсі `Runnable` оголошено метод `run()` та є дві його реалізації: у класі `Car` і в класі `Plane`.  
У класі `Solution` є публічне статичне поле `ArrayList<Runnable> list`, а також два публічні статичні методи:  
`addToList(Runnable)`, який додає у список `list` елемент, отриманий як вхідний параметр, і метод `runList()`, який викликає метод `run()` для кожного елемента списку `list`.  
Твоє завдання - реалізувати ці методи.

Метод `main()` у перевірці не використовується.

---

### **Requirements:**  

• У публічному статичному методі void addToList(Runnable) потрібно додавати у список list елемент, отриманий як вхідний параметр.  
• У публічному статичному методі void runList() слід викликати метод run() для кожного елемента списку list.

---

### **Start code:**  

```java
import java.util.ArrayList;

public class Solution {
    public static ArrayList<Runnable> list = new ArrayList<>();

    public static void main(String[] args) {
        addToList(new Car());
        addToList(new Plane());

        runList();
    }

    public static void addToList(Runnable runnable) {
        //напишіть тут ваш код
    }

    public static void runList() {
        //напишіть тут ваш код
    }
}
```

```java
public interface Runnable {
    void run();
}
```

```java
public class Car implements Runnable {

    @Override
    public void run() {
        System.out.println("Car is running!");
    }
}
```

```java
public class Plane implements Runnable {

    @Override
    public void run() {
        System.out.println("Plane is running!");
    }
}
```

---

### **My solution: [Link](./src/)**  

```java
import java.util.ArrayList;

public class Solution {
    public static ArrayList<Runnable> list = new ArrayList<>();

    public static void main(String[] args) {
        addToList(new Car());
        addToList(new Plane());

        runList();
    }

    public static void addToList(Runnable runnable) {
        list.add(runnable);
    }

    public static void runList() {
        for (Runnable elem : list) {
            elem.run();
        }
    }
}
```

```java
public interface Runnable {
    void run();
}
```

```java
public class Car implements Runnable {

    @Override
    public void run() {
        System.out.println("Car is running!");
    }
}
```

```java
public class Plane implements Runnable {

    @Override
    public void run() {
        System.out.println("Plane is running!");
    }
}
```