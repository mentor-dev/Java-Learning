### **The task to solve:**  

Спробуймо побудувати житловий комплекс із трьох висоток. Для цього ми будемо використовувати три різні способи виведення інформації:  
- Оголошує про результат будівництва.  
- Оголошує про результат і вказує кількість поверхів.  
- Оголошує про результат і вказує забудовника.  

**Приклад виведення:**  
```
Хмарочос побудовано.  
Хмарочос побудовано. Кількість поверхів - 50  
Хмарочос побудовано. Забудовник - JavaRushDevelopment  
```

Щоб виконати завдання, ти маєш оголосити три різні конструктори та в цих конструкторах виводити текст.  
Метод main у тестуванні не використовується.

---

### **Requirements:**  

• Клас Skyscraper має містити три публічні конструктори.  
• Клас Skyscraper має містити конструктор без параметрів.  
• Клас Skyscraper має містити конструктор з параметром типу int.  
• Клас Skyscraper має містити конструктор з параметром типу String.  
• У конструкторі без параметрів результат виведення має відповідати прикладу з умови.  
• У конструкторі з параметром типу int результат виведення має відповідати прикладу з умови.  
• У конструкторі з параметром типу String результат виведення має відповідати прикладу з умови.

---

### **Start code:**  

```java
public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Хмарочос побудовано.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Хмарочос побудовано. Кількість поверхів - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Хмарочос побудовано. Забудовник - ";

    //напишіть тут ваш код

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper(50);
        Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
    }
}
```

---

### **My solution: [Link](./src/Skyscraper.java)**  

```java
public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Хмарочос побудовано.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Хмарочос побудовано. Кількість поверхів - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Хмарочос побудовано. Забудовник - ";

    public Skyscraper() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }

    public Skyscraper(int floors) {
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + floors);
    }

    public Skyscraper(String developer) {
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + developer);
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper(50);
        Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
    }
}
```
