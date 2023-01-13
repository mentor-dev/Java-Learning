### **The task to solve:**  

У класі `Solution` є три поля з однаковими значеннями. У методі `main` виконується їх порівняння з виведенням результату в консоль.  
Додай використання методу `equals()` в методі `main` стільки разів, скільки необхідно для виведення в консоль такого результату:
```
true
true
true
```

---

### **Requirements:**  

• Поля класу Solution змінювати не можна.  
• Результат виведення має відповідати умові.  
• Додай використання методу equals() мінімальну кількість разів.

---

### **Start code:**  

```java
public class Solution {
    static Integer first = 1000;
    static Integer second = 1000;
    static int third = 1000;

    public static void main(String[] args) {
        System.out.println(first == second);
        System.out.println(third == second);
        System.out.println(third == first);
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    static Integer first = 1000;
    static Integer second = 1000;
    static int third = 1000;

    public static void main(String[] args) {
        System.out.println(first.equals(second));
        System.out.println(third == second);
        System.out.println(third == first);
    }
}
```
