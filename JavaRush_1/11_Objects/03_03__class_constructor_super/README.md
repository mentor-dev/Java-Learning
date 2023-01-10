### **The task to solve:**  

Ця задача потрібна, щоб зрозуміти, як викликається конструктор базового (батьківського) класу.  
У тебе є класи `ElectricCar`, `GasCar`, `HybridCar`, які успадковують клас `Car`.  
Тобі потрібно в конструкторах спадкоємців класу `Car` передати тип автомобіля в конструктор базового (батьківського) класу, використовуючи `super("тип автомобіля")`. Для цього в класі `Solution` у методі `main` створи 3 об'єкти: `HybridCar`, `GasCar` і `ElectricCar`.

Результат виведення має бути таким (у будь-якій послідовності):
```
Привіт. Я ElectricCar
Привіт. Я GasCar
Привіт. Я HybridCar
```

---

### **Requirements:**  

• Класи ElectricCar, GasCar, HybridCar мають успадковуватися від класу Саг.  
• Тіло конструктора класу Car не змінюй.  
• Спадкоємці класу Car мають викликати конструктор базового класу з відповідним аргументом.  
• У методі main має бути створено 3 об'єкти класів HybridCar, GasCar і ElectricCar.  
• Результат виведення має відповідати умові.

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
    }
}
```

```java
public class Car {

    public Car(String type) {
        System.out.println("Привіт. Я " + type);
    }
}
```

```java
public class ElectricCar extends Car {

    public ElectricCar() {
        //напишіть тут ваш код
    }
 }
```

```java
public class GasCar extends Car {

    public GasCar() {
        //напишіть тут ваш код
    }
}
```

```java
public class HybridCar extends Car {

    public HybridCar() {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/)**  

```java
public class Solution {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        GasCar gasCar = new GasCar();
        HybridCar hybridCar = new HybridCar();
    }
}
```

```java
public class Car {

    public Car(String type) {
        System.out.println("Привіт. Я " + type);
    }
}
```

```java
public class ElectricCar extends Car {

    public ElectricCar() {
        super("ElectricCar");
    }
 }
```

```java
public class GasCar extends Car {

    public GasCar() {
        super("GasCar");
    }
}
```

```java
public class HybridCar extends Car {

    public HybridCar() {
        super("HybridCar");
    }
}
```
