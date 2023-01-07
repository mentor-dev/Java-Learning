### **The task to solve:**  

Правильно успадкуй класи:  
людину - від істоти;  
Java-девелопера - від людини.  

Видали дублікати методів.

---

### **Requirements:**  

• Клас Human має успадковуватися від класу Entity.  
• Клас JavaDeveloper має успадковуватися від класу Human.  
• Методи не повинні мати дублікатів.

---

### **Start code:**  

```java
public class Entity {
    public void move(){
        System.out.println("Я рухаюся.");
    }

    public void eat(){
        System.out.println("Я їм.");
    }
}
```

```java
public class Human {
    public void move(){
        System.out.println("Я рухаюся.");
    }

    public void eat(){
        System.out.println("Я їм.");
    }                 

    public void speak(){
        System.out.println("Я вмію спілкуватися.");
    }
}
```

```java
public class JavaDeveloper {
    public void move(){
        System.out.println("Я рухаюся.");
    }

    public void eat(){
        System.out.println("Я їм.");
    }

    public void speak(){
        System.out.println("Я вмію спілкуватися.");
    }

    public void code(){
        System.out.println("Я вмію спілкуватися мовою Java.");
    }
}
```

---

### **My solution: [Link](./src/)**  

```java
public class Entity {
    public void move() {
        System.out.println("Я рухаюся.");
    }

    public void eat() {
        System.out.println("Я їм.");
    }
}
```

```java
public class Human extends Entity {
    public void speak() {
        System.out.println("Я вмію спілкуватися.");
    }
}
```

```java
public class JavaDeveloper extends Human {
    public void code() {
        System.out.println("Я вмію спілкуватися мовою Java.");
    }
}
```
