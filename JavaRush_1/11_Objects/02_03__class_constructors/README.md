### **The task to solve:**  

Спробуймо побудувати бізнес-центр, який складається з двох будівель: одну з них тільки починаємо будувати, а друга перебуває на етапі планування, тому про неї мало що відомо.  

Тобі потрібно створити два конструктори: один з параметрами, другий - без. Обидва вони мають ініціалізувати поля `floorsCount` і `developer`.

---

### **Requirements:**  

• Клас Skyscraper має містити два публічні конструктори.  
• Клас Skyscraper має містити конструктор без параметрів.  
• Клас Skyscraper має містити конструктор з параметрами типу int і типу String.  
• Клас Skyscraper має містити приватне нестатичне поле типу int з іменем floorsCount.  
• Клас Skyscraper має містити приватне нестатичне поле типу String з іменем developer.  
• У конструкторі без параметрів потрібно ініціалізувати поля значеннями "5" і "JavaRushDevelopment”.  
• У конструкторі з параметрами потрібно ініціалізувати поля аргументами цього конструктора.

---

### **Start code:**  

```java
public class Skyscraper {
    private int floorsCount;
    private String developer;

    //напишіть тут ваш код

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperUnknown = new Skyscraper(50, "Невідомо");
    }
}
```

---

### **My solution: [Link](./src/Skyscraper.java)**  

```java
public class Skyscraper {
    private int floorsCount;
    private String developer;

    public Skyscraper() {
        floorsCount = 5;
        developer = "JavaRushDevelopment";
    }
    
    public Skyscraper(int floorsCount, String developer) {
        this.floorsCount = floorsCount;
        this.developer = developer;
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperUnknown = new Skyscraper(50, "Невідомо");
    }
}
```
