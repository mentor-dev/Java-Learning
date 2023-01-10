### **The task to solve:**  

Зроби всі змінні класу `Planet` нестатичними.  
Після цього внеси необхідні виправлення в метод `main`.

---

### **Requirements:**  

• Усі змінні класу Planet мають бути нестатичними.  
• У методі main мають присвоюватися значення всім змінним об'єкта Planet earth.

---

### **Start code:**  

```java
public class Solution {

    public static void main(String[] args) {
        Planet earth = new Planet();
        Planet.name = "Земля";
        Planet.age = 4_540_000_000L;
        Planet.speed = 170_218;
        Planet.area = 510_072_000;
        earth.printInformation();
    }
}
```

```java
public class Planet {

    public static String name;
    public static long age;
    public static int speed;
    public static int area;
    
    public void printInformation() {
        System.out.println("Ім'я планети: " + name + ".");
        System.out.println("Вік: " + age + " років.");
        System.out.println("Орбітальна швидкість: " + speed + " км/год.");
        System.out.println("Загальна площа: " + area + " кв. км.");
    }
}
```

---

### **My solution: [Link](./src/)**  

```java
public class Solution {

    public static void main(String[] args) {
        Planet earth = new Planet();
        earth.name = "Земля";
        earth.age = 4_540_000_000L;
        earth.speed = 170_218;
        earth.area = 510_072_000;
        earth.printInformation();
    }
}
```

```java
public class Planet {

    public static String name;
    public static long age;
    public static int speed;
    public static int area;
    
    public void printInformation() {
        System.out.println("Ім'я планети: " + name + ".");
        System.out.println("Вік: " + age + " років.");
        System.out.println("Орбітальна швидкість: " + speed + " км/год.");
        System.out.println("Загальна площа: " + area + " кв. км.");
    }
}
```
