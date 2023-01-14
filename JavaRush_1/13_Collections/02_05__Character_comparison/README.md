### **The task to solve:**  

Метод `compare(Character, Character)` отримує два символи та виводить у консоль результат їх порівняння.  
Реалізуй метод `compare(Character, Character)`, який має правильно порівнювати символи.  
Якщо код першого символу більший за код другого, вивести "`більше`".  
Якщо код першого символу менший за код другого, вивести "`менше`".  
Якщо код першого символу дорівнює коду другого, вивести "`однакові`".

---

### **Requirements:**  

• Виправ роботу методу compare(Character, Character), змінивши одну умову.

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        compare('a', 'a');
        compare('a', 'б');
        compare('р', 'в');
        compare('и', 'и');
    }

    public static void compare(Character first, Character second) {
        if (first == second) {
            System.out.println("однакові");
        } else if (first > second) {
            System.out.println("більше");
        } else if (first < second) {
            System.out.println("менше");
        } else {
            System.out.println("Хіба таке може бути???");
        }
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static void main(String[] args) {
        compare('a', 'a');
        compare('a', 'б');
        compare('р', 'в');
        compare('и', 'и');
    }

    public static void compare(Character first, Character second) {
        if (first.equals(second)) {
            System.out.println("однакові");
        } else if (first > second) {
            System.out.println("більше");
        } else if (first < second) {
            System.out.println("менше");
        } else {
            System.out.println("Хіба таке може бути???");
        }
    }
}
```
