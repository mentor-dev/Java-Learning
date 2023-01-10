### **The task to solve:**  

У методі `main` створюються два айфони з однаковими параметрами.
У консоль виводиться результат їх порівняння. Розберися, чому зараз результат негативний і зроби так, щоб він був позитивним. Для цього тобі слід перевизначити метод `equals(Iphone)`, який буде враховувати всі параметри.  
У двох рівних об'єктів значення полів мають бути однаковими.  
Метод `main` у перевірці не використовується.

---

### **Requirements:**  

• У класі Iphone має бути перевизначено метод public boolean equals(Object).  
• Метод equals має повертати true для двох рівних об'єктів типу Iphone і false - для різних.  
• Метод equals має повертати false, якщо в нього передано null.

---

### **Start code:**  

```java
import java.util.Objects;

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    //напишіть тут ваш код

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }
}
```

---

### **My solution: [Link](./src/Iphone.java)**  

```java
import java.util.Objects;

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || !(obj instanceof Iphone))
            return false;

        Iphone iphone = (Iphone) obj;

        return Objects.equals(model, iphone.model) &&
                Objects.equals(color, iphone.color) && 
                price == iphone.price;
        }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }
}
```
