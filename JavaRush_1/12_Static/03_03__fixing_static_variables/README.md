### **The task to solve:**  

У давні-прадавні часи всі машини мали однакові назви. І от одного чудового дня директорові автомобільного заводу набридла одноманітність, і він видав наказ: називати моделі автомобілів по-різному.  
Отже, як можна здогадатися, твоє завдання полягає в тому, щоб допомогти головному інженерові виправити програму виробництва машин так, щоб кожному об'єкту-машині можна було присвоїти унікальне ім'я.

---

### **Requirements:**  

• Поле плосІеІМате класу Car має бути нестатичним.  
• Гетер і сетер для поля modelName мають бути виправлені.

---

### **Start code:**  

```java
public class Car {
    private static String modelName;
    private int speed;

    public static String getModelName() {
        return modelName;
    }

    public static void setModelName(String modelName) {
        Car.modelName = modelName;
    }                      

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
```

---

### **My solution: [Link](./src/Car.java)**  

```java
public class Car {
    private String modelName;
    private int speed;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }                      

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
```
