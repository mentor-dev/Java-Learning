### **The task to solve:**  

Тут ти бачиш поганий приклад використання методів:  
Методи розділили двовірш;  
Один рядок коду не варто обгортати окремим методом.  
Перепиши код так, щоб увесь текст виводився в методі `main`, а решту методів видали.  
Результат виведення програми не повинен змінитися.

---

### **Requirements:**  

• Метод main() має бути єдиним методом у класі Solution.  
• Результат виведення в консоль має відповідати умові задачі.

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        print1();
        print2();
    }
    public static void print1(){
        System.out.println("Я поет, я звуся Квітик.");
    }
    public static void print2(){
        System.out.println("Вам від мене всім привітик.");
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println("Я поет, я звуся Квітик.");
        System.out.println("Вам від мене всім привітик.");
    }
}
```
