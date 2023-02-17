### **The task to solve:**  

Клас `Pet` є батьківським класом для класів `Cat` і `Dog`. У ньому реалізовано метод `printInfo()`, який повідомляє, що цей об'єкт є вихованцем.  
У класах `Cat` і `Dog` потрібно перевизначити метод `printInfo()`, доповнивши його функціонал таким чином:  
- спочатку виклич метод `printInfo()` батьківського класу;  
- потім додатково виведи в консоль "`Я не люблю людей`" для класу `Cat` або "`Я люблю людей`" для класу `Dog`.  

Приклад виведення для класу `Cat`:

```
Я домашній вихованець.
Я не люблю людей.
```

Приклад виведення для класу `Dog`:

```
Я домашній вихованець.
Я люблю людей.
```

---

### **Requirements:**  

• У класі Cat має бути перевизначено метод printlnfo().  
• У класі Dog має бути перевизначено метод printlnfo().  
• Метод printlnfo() класу Cat має містити виклик методу printlnfo() батьківського класу.  
• Метод printlnfo() класу Dog має містити виклик методу printlnfo() батьківського класу.  
• Метод printlnfo() класу Cat має виводити в консоль текст згідно з умовою.  
• Метод printlnfo() класу Dog має виводити в консоль текст згідно з умовою.  

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.printInfo();
        Dog dog = new Dog();
        dog.printInfo();
    }
}
```

```java
public class Pet {
    public void printInfo(){
        System.out.println("Я домашній вихованець.");
    }
}
```

```java
public class Cat extends Pet {
    public static final String CAT = "Я не люблю людей.";

    //напишіть тут ваш код
}
```

```java
public class Dog extends Pet {
    public static final String DOG = "Я люблю людей.";

    //напишіть тут ваш код
}
```

---

### **My solution: [Link](./src/)**  

```java
public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.printInfo();
        Dog dog = new Dog();
        dog.printInfo();
    }
}
```

```java
public class Pet {
    public void printInfo(){
        System.out.println("Я домашній вихованець.");
    }
}
```

```java
public class Cat extends Pet {
    public static final String CAT = "Я не люблю людей.";

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(CAT);
    }
}
```

```java
public class Dog extends Pet {
    public static final String DOG = "Я люблю людей.";

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(DOG);
    }
}
```
