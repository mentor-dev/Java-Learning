### **The task to solve:**  

Виправ метод `main()` так, щоб він виводив у консоль число `12`.

---

### **Requirements:**  

• У методі main() розстав одну пару дужок так, щоб у консоль було виведено число 12. Решту коду не змінюй.  
• Метод main() має виводити число 12.

---

### **Start code:**  

```java
public class Solution {

    public static void main(String[] args) {
        int number = 2;  
        System.out.println(number + number * number + ++number);
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {

    public static void main(String[] args) {
        int number = 2;  
        System.out.println(number + number * (number + ++number));
    }
}
```
