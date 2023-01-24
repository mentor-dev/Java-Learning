### **The task to solve:**  

У методі `main` перехопи виняток і виведи трасу його стека.

---

### **Requirements:**  

• Метод main має викликати метод dangerousMethod.  
• Метод dangerousMethod має кидати Exception.  
• Метод main має виводити на екран трасу стека перехопленого винятку.

---

### **Start code:**  

```java
public class Solution {

    public static void main(String[] args) {
        dangerousMethod();
    }

    static void dangerousMethod() throws Exception {
        throw new Exception("Mu-ha-ha!");
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {

    public static void main(String[] args) {
        try {
            dangerousMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void dangerousMethod() throws Exception {
        throw new Exception("Mu-ha-ha!");
    }
}
```
