### **The task to solve:**  

"Кон", "коти" й "нація". Як з'єднати ці три рядки? Ти ще пам'ятаєш, як у Java з'єднувати `String`'и? Виправ помилки в коді, щоб програма компілювалася й працювала.

---

### **Requirements:**  

• У методі main класу Solution потрібно виправити помилки: для виведення на екран має використовуватися конкатенація рядків.

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        String name = "Diego";
        int age = 35;
        System.out.println("Name : " name " Age : " age);
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static void main(String[] args) {
        String name = "Diego";
        int age = 35;
        System.out.println("Name : " + name + " Age : " + age);
    }
}
```
