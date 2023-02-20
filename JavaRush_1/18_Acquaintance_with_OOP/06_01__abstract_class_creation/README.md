### **The task to solve:**  

Клас `Shape` визначає геометричну фігуру. У майбутньому від нього можна буде успадкувати якусь певну фігуру.  
Для цієї фігури можна буде обчислити периметр і площу. Для різних фігур ці величини обчислюються за різними формулами.  
Оскільки ані периметр, ані площу абстрактної фігури обчислити неможливо, клас `Shape` варто зробити абстрактним.

Крім того, зроби заділ на майбутнє і створи в цьому класі абстрактні методи `getPerimeter()` і `getArea()`. Ці методи мають повертати значення типу `double`.

---

### **Requirements:**  

• Клас Shape має бути абстрактним.  
• Клас Shape має містити абстрактний метод double getPerimeter().  
• Клас Shape має містити абстрактний метод double getArea().

---

### **Start code:**  

```java
public class Shape {
    //напишіть тут ваш код
}
```

---

### **My solution: [Link](./src/Shape.java)**  

```java
public abstract class Shape {
    public abstract double getPerimeter();

    public abstract double getArea();
}
```
