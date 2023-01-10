### **The task to solve:**  

Клас `Coordinate` містить `2` гетери й `2` сетери, але сетери не встановлюють значення змінним.  
Розберися, чому так відбувається й виправ ситуацію.  
Метод `main` у перевірці не використовується.

---

### **Requirements:**  

• Клас Coordinate має містити два приватних нестатичних поля х, у типу int.  
• У класі Coordinate має бути гетер getX для поля х.  
• У класі Coordinate має бути гетер getY для поля у.  
• Клас Coordinate має містити сетер setX(int) для поля х.  
• Клас Coordinate має містити сетер setY(int) для поля y.  
• Сетери мають ініціалізувати відповідні поля.

---

### **Start code:**  

```java
public class Solution {

    public static void main(String[] args) {
        Coordinate coordinate = new Coordinate();
        coordinate.setX(15);
        coordinate.setY(25);
        System.out.println(coordinate.getX());
        System.out.println(coordinate.getY());
    }
}
```

```java
public class Coordinate {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        x = this.x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        y = this.y;
    }
}
```

---

### **My solution: [Link](./src/)**  

```java
public class Solution {

    public static void main(String[] args) {
        Coordinate coordinate = new Coordinate();
        coordinate.setX(15);
        coordinate.setY(25);
        System.out.println(coordinate.getX());
        System.out.println(coordinate.getY());
    }
}
```

```java
public class Coordinate {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
```
