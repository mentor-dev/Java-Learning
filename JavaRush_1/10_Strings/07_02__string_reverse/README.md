### **The task to solve:**  

Використовуючи `StringBuilder` в методі `reverseString(String)`, переверни рядок, отриманий як параметр.

---

### **Requirements:**  

• У методі reverseString(String) потрібно використовувати StringBuilder.  
• Метод reverseString(String) має повертати перевернутий рядок.

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        String string = "Їхав мопед задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        //напишіть тут ваш код
        return null;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static void main(String[] args) {
        String string = "Їхав мопед задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder result = new StringBuilder(string);
        result.reverse();
        return result.toString();
    }
}
```
