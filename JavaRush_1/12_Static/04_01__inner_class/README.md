### **The task to solve:**  

Двигун - це складний механізм, який неможливо описати за допомогою звичайної змінної.  
У класі `Car` створи внутрішній клас (`inner class`) `Engine`. У класі `Engine` створи поле `isRunning` типу `boolean`, яке набуватиме значення `true`, коли двигун запущено, і `false` в іншому випадку. Крім того, додай у цей клас методи `start` і `stop`, які будуть запускати й зупиняти двигун (встановлювати відповідне значення поля `isRunning`).  
Щоб використовувати двигун, створи поле `engine` типу `Engine` у класі `Car`.

---

### **Requirements:**  

• У класі Car потрібно створити внутрішній клас (inner class) Engine.  
• У класі Engine має бути приватне поле isRunning типу boolean.  
• У класі Engine має бути публічний метод void start, який присвоює значення true полю isRunning.  
• У класі Engine має бути публічний метод void stop, який присвоює значення false полю isRunning.  
• У класі Саг має бути поле engine типу Engine.

---

### **Start code:**  

```java
public class Car {
    //напишіть тут ваш код
}
```

---

### **My solution: [Link](./src/Car.java)**  

```java
public class Car {

    Engine engine = new Engine();
    
    public class Engine {
        private boolean isRunning;

        public void start() {
            isRunning = true;
        }

        public void stop() {
            isRunning = false;
        }
    }
}
```
