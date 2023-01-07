### **The task to solve:**  

Перед тобою клас `Earth` - набір змінних, які описують певні характеристики планети Земля.  
Зроби зі змінних класу `Earth` глобальні константи. Не забудь перейменувати змінні так, щоб вони відповідали стилю написання глобальних змінних.

---

### **Requirements:**  

• Змінну name класу Earth потрібно перетворити на глобальну змінну.  
• Змінну square класу Earth потрібно перетворити на глобальну змінну.  
• Змінну population класу Earth потрібно перетворити на глобальну змінну.  
• Змінну equatorLength класу Earth потрібно перетворити на глобальну змінну.  

---

### **Start code:**  

```java
public class Earth {
    String name = "Земля";
    double square = 510_100_000;
    long population = 7_594_000_000L;
    long equatorLength = 40_075_696;
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Earth {
    public static final String NAME = "Земля";
    public static final double SQUARE = 510_100_000;
    public static final long POPULATION = 7_594_000_000L;
    public static final long EQUATOR_LENGTH = 40_075_696;
}
```
