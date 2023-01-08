### **The task to solve:**  

Реалізуй метод `getPowerOfTwo(int power)`, який повертає число `2` в степені `power`.  
Тобі потрібно змінити реалізацію методу `getPowerOfTwo(int)`, використовуючи відповідний побітовий зсув.

---

### **Requirements:**  

• У методі getPowerOfTwo(int) потрібно повертати степінь двійки.  
• У методі getPowerOfTwo(int) слід використовувати оператор побітового зсуву вліво.

---

### **Start code:**  

```java
public class Solution {

    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(3));
    }
                       
    public static int getPowerOfTwo(int power) {
        int result = 2;
        for(int i = 0; i < power - 1; i++) {
            result *= 2;
        }
        return result;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {

    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(3));
    }

    public static int getPowerOfTwo(int power) {
        return (2 << (power - 1));
    }
}
```
