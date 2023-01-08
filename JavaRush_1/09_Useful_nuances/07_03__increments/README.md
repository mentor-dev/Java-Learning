### **The task to solve:**  

Виправ метод `main()` так, щоб він виводив у консоль число `20`.  
У методі можна змінювати лише постінкремент на преінкремент і навпаки, а також постдекремент на предекремент і навпаки.

---

### **Requirements:**  

• Виправ метод main() згідно з умовою.

---

### **Start code:**  

```java
public class Solution {

    public static void main(String[] args) {
        int a = 3;   
        int b = a++ + (--a * a++);

        System.out.println(b);
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {

    public static void main(String[] args) {
        int a = 3;   
        int b = ++a + (a-- * ++a);

        System.out.println(b);
    }
}
```
