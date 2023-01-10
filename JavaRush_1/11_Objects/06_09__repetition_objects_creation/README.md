### **The task to solve:**  

Спробуймо зібрати комп'ютер. У нас є класи: системний блок, монітор, клавіатура, миша. У класі комп'ютер створи в конструкторі об'єкти класів - складових комп'ютера.

---

### **Requirements:**  

• В окремих файлах мають бути публічні класи Computer, Keyboard, Monitor, Mouse, SystemUnit.  
• У конструкторі класу Computer потрібно створити 4 об'єкти різних "складових".

---

### **Start code:**  

```java
public class Computer {
}
```

```java
public class Keyboard {
}
```

```java
public class Monitor {
}
```

```java
public class Mouse {
}
```

```java
public class SystemUnit {
}
```

---

### **My solution: [Link](./src/)**  

```java
public class Computer {
    Keyboard keyboard = new Keyboard();
    Monitor monitor = new Monitor();
    Mouse mouse = new Mouse();
    SystemUnit systemUnit = new SystemUnit();
}
```

```java
public class Keyboard {
}
```

```java
public class Monitor {
}
```

```java
public class Mouse {
}
```

```java
public class SystemUnit {
}
```
