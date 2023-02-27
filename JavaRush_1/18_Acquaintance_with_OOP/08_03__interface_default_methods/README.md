### **The task to solve:**  

Класи `Car` і `Bus` реалізують інтерфейс `Vehicle`. Проте деякі методи цього інтерфейсу реалізовано в цих класах по-різному.  
Реалізуй ці методи як `default` у самому інтерфейсі `Vehicle` і видали їх із класів `Car` і `Bus`.

---

### **Requirements:**  

• Інтерфейс Vehicle має реалізовувати метод default void start().  
• Інтерфейс Vehicle має реалізовувати метод default void stop().  
• Клас Саг не повинен реалізовувати методи void start() і void stop().  
• Клас Bus не повинен реалізовувати методи void start() і void stop().

---

### **Start code:**  

```java
public interface Vehicle {
    void start();
    void move();
    void stop();
}
```

```java
public class Car implements Vehicle {
    public void start() {
        System.out.println("Починаю рух.");
    }

    public void move() {
        System.out.println("Їду із середньою швидкістю 70 км/год.");
    }

    public void stop() {
        System.out.println("Зупиняюся.");
    }
}
```

```java
public class Bus implements Vehicle{
    public void start() {
        System.out.println("Починаю рух.");
    }

    public void move() {
        System.out.println("Їду із середньою швидкістю 50 км/год.");
    }

    public void stop() {
        System.out.println("Зупиняюся.");
    }
}
```

---

### **My solution: [Link](./src/)**  

```java
public interface Vehicle {
    default void start() {
        System.out.println("Починаю рух.");
    }

    default void stop() {
        System.out.println("Зупиняюся.");
    }

    void move();
}
```

```java
public class Car implements Vehicle {
    public void move() {
        System.out.println("Їду із середньою швидкістю 70 км/год.");
    }
}
```

```java
public class Bus implements Vehicle{
    public void move() {
        System.out.println("Їду із середньою швидкістю 50 км/год.");
    }
}
```
