### **The task to solve:**  

Як відомо, на планеті Земля є `6` материків. Створи для кожного материка власний клас. У кожному класі має бути поле, що зберігає площу відповідного материка.  
Площу материка потрібно вказувати під час його створення, і вона має бути незмінюваною.  
Щоб задати площу материків, ти можеш використовувати будь-які числа.

---

### **Requirements:**  

• В окремих файлах створи публічні класи Africa, Antarctica, Australia, Eurasia, NorthAmerica, SouthAmerica.  
• Кожен зі створених класів має містити поле private final int area.  
• Кожен зі створених класів має містити публічний конструктор з аргументом типу int, який ініціалізуватиме поле area.  
• У методі main класу Earth створи 6 різних материків і передай у них значення площі.

---

### **Start code:**  

```java
public class Earth {
    public static void main(String[] args) {
        //напишіть тут ваш код
    }                  
}
```

---

### **My solution: [Link](./src/)**  

```java
public class Earth {
    public static void main(String[] args) {
        Africa africa = new Africa(30_370_000);
        Antarctica antarctica = new Antarctica(13_660_000);
        Australia australia = new Australia(7_617_930);
        Eurasia eurasia = new Eurasia(54_760_000);
        NorthAmerica northAmerica = new NorthAmerica(24_710_000);
        SouthAmerica southAmerica = new SouthAmerica(17_840_000);
    }                  
}
```

```java
public class Africa {
    private final int area;

    public Africa(int area) {
        this.area = area;
    }
}
```

```java
public class Antarctica {
    private final int area;

    public Antarctica(int area) {
        this.area = area;
    }
}
```

```java
public class Australia {
    private final int area;

    public Australia(int area) {
        this.area = area;
    }
}
```

```java
public class Eurasia {
    private final int area;

    public Eurasia(int area) {
        this.area = area;
    }
}
```

```java
public class NorthAmerica {
    private final int area;

    public NorthAmerica(int area) {
        this.area = area;
    }
}
```

```java
public class SouthAmerica {
    private final int area;

    public SouthAmerica(int area) {
        this.area = area;
    }
}
```
