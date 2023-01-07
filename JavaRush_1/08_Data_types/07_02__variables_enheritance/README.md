### **The task to solve:**  

Правильно успадкуй класи:  
машину - від транспортного засобу;  
електрокар - від машини.  

Видали дублікати змінних.

---

### **Requirements:**  

• Клас Саг має успадковуватися від класу Vehicle.  
• Клас ElectricCar має успадковуватися від класу Саг.  
• Змінні не повинні мати дублікатів.

---

### **Start code:**  

```java
public class Vehicle {
    double maxSpeed;
}
```

```java
public class Car {
    double maxSpeed;
    int wheelCount;
    double weight;
}
```

```java
public class ElectricCar {
    double maxSpeed;
    int wheelCount;
    double weight;
    int electricEnginePower;
}
```

---

### **My solution: [Link](./src/)**  

```java
public class Vehicle {
    double maxSpeed;
}
```

```java
public class Car extends Vehicle {
    int wheelCount;
    double weight;
}
```

```java
public class ElectricCar extends Car {
    int electricEnginePower;
}
```
