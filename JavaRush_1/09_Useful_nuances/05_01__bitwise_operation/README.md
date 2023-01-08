### **The task to solve:**  

Закоментуй непотрібні рядки коду, щоб вивести на екран цифру `5`.  
Примітка. Потрібно закоментувати лише два рядки.

---

### **Requirements:**  

• Програма має виводити на екран цифру 5.  
• Не можна змінювати рядок з оголошенням змінної х.  
• Не можна змінювати тіло методу main(String[]), можна лише закоментувати певні 2 рядки.

---

### **Start code:**  

```java
public class Solution {

    public static void main(String[] args) {
        int x = 7;
        x = x & 25;
        x = x & 5;
        x = x & 3;
        x = x & 12;
        x = x | 1;
        System.out.println(x);
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {

    public static void main(String[] args) {
        int x = 7;      // 7 =  00000111
     // x = x & 25;     // 25 = 00011001
        x = x & 5;      // 5 =  00000101    0101
     // x = x & 3;      // 3 =  00000011
        x = x & 12;     // 12 = 00001100    0100
        x = x | 1;      // 1 =  00000001    0101
        System.out.println(x);
    }
}
```
