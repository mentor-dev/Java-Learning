### **The task to solve:**  

Виправ помилки в коді, щоб програма компілювалася й працювала.

---

### **Requirements:**  

• Програма має компілюватися й працювати.  
• У програмі має бути публічний клас Solution.  
• У програмі має бути клас Cat.

---

### **Start code:**  

```java
class solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.name);
    }
}
public class Cat {
    String name = "Tom";
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.name);
    }
}

class Cat {
    String name = "Tom";
}
```
