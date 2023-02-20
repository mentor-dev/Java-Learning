### **The task to solve:**  

Клас `Person` оголошено як абстрактний. Це означає, що ми не можемо створювати його екземпляри.  
Перетвори цей клас на звичайний, допиши відсутню логіку, яка відповідає загальноприйнятим підходам до інкапсуляції:  
гетери мають повертати, а сетери - встановлювати значення відповідних полів.

---

### **Requirements:**  

• Клас Shape не повинен бути абстрактним.  
• Метод getName() має повертати значення поля name.  
• Метод setName(String) має присвоювати передане значення полю name.  
• Метод getAge() має повертати значення поля age.  
• Метод setAge(int) має присвоювати передане значення полю age.

---

### **Start code:**  

```java
public abstract class Person {
    private String name;
    private int age;

    public abstract String getName();

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }                     

    public abstract void setAge(int age);
}
```

---

### **My solution: [Link](./src/Person.java)**  

```java
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }                     

    public void setAge(int age) {
        this.age = age;
    }
}
```
