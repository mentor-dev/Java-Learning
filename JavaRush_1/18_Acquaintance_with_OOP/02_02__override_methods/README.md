### **The task to solve:**  

Класи `Triangle`, `Rectangle` і `Circle` - це геометричні фігури, тому їх успадковано від класу `Shape`.  
Перевизнач у них метод `printInfo()`, щоб він виводив у консоль назву певної фігури:  
для `Triangle` - "`Трикутник`";  
для `Rectangle` - "`Прямокутник`";  
для `Circle` - "`Круг`".

Метод `main()` у тестуванні не використовується.

---

### **Requirements:**  

• Клас Shape не змінюй.  
• Класи геометричних фігур мають успадковуватися від класу Shape.  
• У класах геометричних фігур потрібно перевизначити метод printlnfo().  
• Виклик методу printlnfo() для об'єкта геометричної фігури має виводити в консоль її назву.

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        shape.printInfo();
        circle.printInfo();
        rectangle.printInfo();
        triangle.printInfo();
    }
}
```

```java
public class Shape {
    public void printInfo(){
        System.out.println("Геометрична фігура");
    }
}
```

```java
public class Circle extends Shape {
    //напишіть тут ваш код
}
```

```java
public class Rectangle extends Shape {
    //напишіть тут ваш код
}
```

```java
public class Triangle extends Shape {
    //напишіть тут ваш код
}
```

---

### **My solution: [Link](./src/)**  

```java
public class Solution {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        shape.printInfo();
        circle.printInfo();
        rectangle.printInfo();
        triangle.printInfo();
    }
}
```

```java
public class Shape {
    public void printInfo(){
        System.out.println("Геометрична фігура");
    }
}
```

```java
public class Circle extends Shape {
    @Override
    public void printInfo(){
        System.out.println("Круг");
    }
}
```

```java
public class Rectangle extends Shape {
    @Override
    public void printInfo(){
        System.out.println("Прямокутник");
    }
}
```

```java
public class Triangle extends Shape {
    @Override
    public void printInfo(){
        System.out.println("Трикутник");
    }
}
```
