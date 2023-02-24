### **The task to solve:**  

Є `2` інтерфейси - `Swimmable` і `Flyable`, які вказують, чи вміє об'єкт відповідно плавати та/або літати.  
Реалізуй ці інтерфейси в класах `Zeppelin` (Дирижабль), `Ship` (Корабель) і `JamesBondCar` (Машина Джеймса Бонда) відповідно до їхніх можливостей.

Пам'ятай: машина Джеймса Бонда вміє все.

---

### **Requirements:**  

• Клас Zeppelin має реалізувати інтерфейс Flyable.  
• Клас Ship має реалізувати інтерфейс Swimmable.  
• Клас JamesBondCar має реалізувати інтерфейси Flyable і Swimmable.

---

### **Start code:**  

```java
public interface Flyable {
}
```

```java
public interface Swimmable {
}
```

```java
public class JamesBondCar {
}
```

```java
public class Ship {
}
```

```java
public class Zeppelin {
}
```

---

### **My solution: [Link](./src/)**  

```java
public interface Flyable {
}
```

```java
public interface Swimmable {
}
```

```java
public class JamesBondCar implements Flyable, Swimmable {
}
```

```java
public class Ship implements Swimmable {   
}
```

```java
public class Zeppelin implements Flyable {   
}
```