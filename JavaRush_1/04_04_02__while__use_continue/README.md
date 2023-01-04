### **The task to solve:**  

Вивести на екран суму чисел від `1` до `100` включно, які не кратні `3`.  
Використай для цього цикл `while`.

**Підказка:**  
для переходу в циклі до наступного числа використовуй оператор `continue`.

---

### **Requirements:**  

• Програма повинна вивести в консоль суму всіх чисел від 1 до 100 включно, які не кратні 3.  
• У програмі потрібно використовувати цикл while.  
• У програмі потрібно використовувати оператор continue.  

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static void main(String[] args) {
        int start_number = 1;
        int end_number = 100;
        int i = start_number - 1;
        int sum = 0;
        while (i < end_number) {
            i++;
            if (i % 3 != 0) {
                sum += i;
            } else {
                continue;
            }
        }
        System.out.println(sum);
    }
}
```