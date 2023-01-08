### **The task to solve:**  

У класі `Pair` реалізуй метод `swap()` так, щоб він міняв місцями значення змінних `x` і `y`.  
Можна використовувати тільки такі операції:  
Виключне або.  
Присвоювання.  
Виключне або з присвоюванням.  

Не додавай коментарів, не змінюй решту коду.

---

### **Requirements:**  

• Клас Pair має містити метод swap().  
• У класі Pair в методі swap() використовуй тільки дозволені операції.  
• Виклик методу swap() має поміняти значення полів x і y.  
• Не змінюй нічого в коді, окрім методу swap().

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        /* expected output
        x=4, y=5
        x=5, y=4
         */

        Pair pair = new Pair(4, 5);
        System.out.println(pair);
        pair.swap();        
        System.out.println(pair);
    }
}
```

```java
public class Pair {
    private int x;
    private int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x=%d, y=%d", x, y);
    }

    public void swap() {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/)**  

```java
public class Solution {
    public static void main(String[] args) {
        /* expected output
        x=4, y=5
        x=5, y=4
         */

        Pair pair = new Pair(4, 5);
        System.out.println(pair);
        pair.swap();        
        System.out.println(pair);
    }
}
```

```java
public class Pair {
    private int x;
    private int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x=%d, y=%d", x, y);
    }

    public void swap() {
        x ^= y;
        y ^= x;
        x ^= y;
    }
}
```
