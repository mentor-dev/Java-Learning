### **The task to solve:**  

У методі `main` оголошено змінні типу `String`. У консоль виводиться результат їх порівняння: якщо рядки однакові, виводиться `true`, інакше - `false`. Тобі потрібно розкоментувати один рядок так, щоб у консоль виводилося

```
true
true
```

Тіло методу `main` змінювати не можна: дозволено лише розкоментувати один рядок.

---

### **Requirements:**  

• У методі main потрібно тільки розкоментувати один рядок: додавати або змінювати решту коду не можна.  
• Результат виведення має відповідати умові.

---

### **Start code:**  

```java
public class Solution {

    public static void main(String[] args) {
        String s1 = new String("JavaRush");
//        s1 = "JavaRush";
        String s2 = "JavaRush";
//        s2 = new String("JavaRush");
        String s3 = "JavaRush";
//        s3 = new String("JavaRush");
        System.out.println(s1 == s3);
        System.out.println(s2.equals(s3));
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {

    public static void main(String[] args) {
        String s1 = new String("JavaRush");
        s1 = "JavaRush";
        String s2 = "JavaRush";
//        s2 = new String("JavaRush");
        String s3 = "JavaRush";
//        s3 = new String("JavaRush");
        System.out.println(s1 == s3);
        System.out.println(s2.equals(s3));
    }
}
```
