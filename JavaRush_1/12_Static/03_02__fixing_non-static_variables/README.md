### **The task to solve:**  

У класі `Window` є метод `changeSize`, який має змінювати розміри вікна відповідно до переданих у метод значень.  
Проте після запуску програми ти побачиш, що цей метод не діє.   Тобі потрібно виправити помилки, щоб метод почав діяти.

---

### **Requirements:**  

• Оголошення та ініціалізацію полів класу Window змінювати не можна.  
• Метод changeSize класу Window має змінювати значення полів класу згідно з переданими даними.  
• Оголошення методу changeSize і назви параметрів змінювати не можна.

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        Window window = new Window();
        window.printSize();
        window.changeSize(4, 5);
        window.printSize();
    }
}
```

```java
public class Window {
    private int height = 2;
    private int width = 3;

    public void changeSize(int height, int width){
        height = height;
        width = width;
    }

    public void printSize(){
        System.out.println("Height = " + height);
        System.out.println("Width = " + width);
    }
}
```

---

### **My solution: [Link](./src/)**  

```java
public class Solution {
    public static void main(String[] args) {
        Window window = new Window();
        window.printSize();
        window.changeSize(4, 5);
        window.printSize();
    }
}
```

```java
public class Window {
    private int height = 2;
    private int width = 3;

    public void changeSize(int height, int width){
        this.height = height;
        this.width = width;
    }

    public void printSize(){
        System.out.println("Height = " + height);
        System.out.println("Width = " + width);
    }
}
```
