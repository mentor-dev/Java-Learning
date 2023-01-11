### **The task to solve:**  

Метод `main` містить виклик методу `add`, який має збільшувати значення поля `salary` класу `Solution` на передане значення, але значення поля `salary`, яке виводиться на екран, - `0`. Зроби так, щоб програма працювала правильно.

---

### **Requirements:**  

• Клас Solution має містити публічне статичне поле salary типу int.  
• Клас Solution має містити публічний статичний метод add(int), який не повертає жодного значення (тип void).  
• Виправ помилку, щоб програма працювала правильно.

---

### **Start code:**  

```java
public class Solution {
    public static int salary;

    public static void add(int increase) {
        int salary = Solution.salary;
        salary += increase;
    }
    public static void main(String[] args) {
        add(100500);     
        System.out.println(salary);
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static int salary;

    public static void add(int increase) {
        salary += increase;
    }
    public static void main(String[] args) {
        add(100500);     
        System.out.println(salary);
    }
}
```
