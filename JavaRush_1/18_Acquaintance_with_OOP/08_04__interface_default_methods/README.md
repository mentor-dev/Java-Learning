### **The task to solve:**  

Класи `Eagle` (Орел), `Raven` (Ворон) і `Aircraft` (Літак) реалізують інтерфейс `Flyable`, який містить дефолтну реалізацію методу `int getMaxSpeed()` і повертає значення `80`.  
Це неправильна реалізація, тому що в дійсності максимальна швидкість Орла - `180` км/год, Ворона - `48`, а літака - `1200`.

Тобі потрібно видалити дефолтну реалізацію методу `getMaxSpeed()` з інтерфейсу `Flyable` (сам метод потрібно залишити) і реалізувати цей метод у кожному із класів.  
Для кожного класу вкажи правильне значення максимальної швидкості.

---

### **Requirements:**  

• Метод int getMaxSpeed() інтерфейсу Flyable не повинен бути default.  
• Метод int getMaxSpeed() класу Eagle має повертати значення 180.  
• Метод int getMaxSpeed() класу Raven має повертати значення 48.  
• Метод int getMaxSpeed() класу Aircraft має повертати значення 1200.

---

### **Start code:**  

```java
public interface Flyable {
    default int getMaxSpeed(){
        return 80;    
    }
}
```

```java
public class Aircraft implements Flyable {
}
```

```java
public class Eagle implements Flyable {
}
```

```java
public class Raven implements Flyable {
}
```

---

### **My solution: [Link](./src/)**  

```java
public interface Flyable {
    int getMaxSpeed();
}
```

```java
public class Aircraft implements Flyable {
    public int getMaxSpeed() {
        return 1200;
    }
}
```

```java
public class Eagle implements Flyable {
    public int getMaxSpeed() {
        return 180;
    }
}
```

```java
public class Raven implements Flyable {
    public int getMaxSpeed() {
        return 48;
    }
}
```
