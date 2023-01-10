### **The task to solve:**  

Створімо каталог нових моделей автомобілів на нашому підприємстві. Для цього нам потрібно створити один метод `initialize`, який ініціалізуватиме такі поля об'єкта типу `Car`: модель, рік випуску, колір.

---

### **Requirements:**  

• Клас Car має містити приватне поле model типу String.  
• Клас Car має містити приватне поле year типу int.  
• Клас Car має містити приватне поле color типу String.  
• У класі Car не потрібно оголошувати конструктори.  
• Клас Car має містити нестатичний метод public void initialize із параметрами типу String, int, String.  
• Ініціалізація полів model, year, color має відбуватися в методі initialize(String model, int year, String color).

---

### **Start code:**  

```java
public class Car {
    private String model;
    private int year;
    private String color;

    //напишіть тут ваш код
}
```

---

### **My solution: [Link](./src/Car.java)**  

```java
public class Car {
    private String model;
    private int year;
    private String color;

    public void initialize(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }
}
```
