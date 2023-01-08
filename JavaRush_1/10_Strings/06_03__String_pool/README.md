### **The task to solve:**  

Метод `equal(String, String)` порівнює рядки за посиланням за допомогою оператора `==`.  
Цей метод має повертати `true`, якщо рядки мають однаковий вміст, і `false`, якщо їхній вміст різний. Метод `equals()` використовувати не можна.

---

### **Requirements:**  

• У методі equal(String, String) потрібно порівнювати вміст рядків, використовуючи оператор ==.  
• Якщо рядки однакові, метод equal (String, String) має повертати значення true.  
• Якщо рядки різні, метод equal(String, String) має повертати значення false.  
• Метод equals() використовувати не можна.

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        String first = new String("JavaRush");
        String second = new String("JavaRush");
        String third = new String("javarush");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
    }

    public static boolean equal(String first, String second) {
        //напишіть тут ваш код
        return false;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static void main(String[] args) {
        String first = new String("JavaRush");
        String second = new String("JavaRush");
        String third = new String("javarush");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
    }

    public static boolean equal(String first, String second) {
        String s1 = first.intern();
        String s2 = second.intern();
        return (s1 == s2);
    }
}
```
