### **The task to solve:**  

У класі `Outer` є внутрішній (`Inner`) клас і вкладений (`Nested`) клас.  
Створи в методі `main` класу `Solution` по одному об'єкту кожного з них.

---

### **Requirements:**  

• У методі main класу Solution потрібно створити об'єкт класу Inner.  
• У методі main класу Solution потрібно створити об'єкт класу Nested.  
• Клас Outer змінювати не можна.

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
public class Outer {
    class Inner {
        Inner() {
            System.out.println("Створення об'єкта внутрішнього класу");
        }
    }
    static class Nested {
        Nested() {         
            System.out.println("Створення об'єкта вкладеного класу");
        }
    }
}
```

---

### **My solution: [Link](./src/)**  

```java
public class Solution {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        Outer.Nested nested = new Outer.Nested();
    }
}
```

```java
public class Outer {
    class Inner {
        Inner() {
            System.out.println("Створення об'єкта внутрішнього класу");
        }
    }
    static class Nested {
        Nested() {         
            System.out.println("Створення об'єкта вкладеного класу");
        }
    }
}
```
