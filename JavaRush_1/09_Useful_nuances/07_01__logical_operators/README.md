### **The task to solve:**  

Виправ метод `taskForCondition()` так, щоб він виводив у консоль число `30`. Змінювати можна лише логічні оператори: `&&` на `&` і `||` на `|`.

---

### **Requirements:**  

• Метод taskForCondition() має виводити число 30.  
• У методі taskForCondition() не змінюй нічого, крім логічних операторів.

---

### **Start code:**  

```java
public class Solution {

    public static void main(String[] args) {
        taskForCondition();
    }

    public static void taskForCondition() {
        int number = 15;
        boolean conditionFirst = number < 15 && number > 25 && (number += 15) < 25;
        boolean conditionSecond = (number | 5) > 12 || (number = number + 2) > 40;
        System.out.println(number);
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {

    public static void main(String[] args) {
        taskForCondition();
    }

    public static void taskForCondition() {
        int number = 15;
        boolean conditionFirst = number < 15 & number > 25 & (number += 15) < 25;
        boolean conditionSecond = (number | 5) > 12 || (number = number + 2) > 40;
        System.out.println(number);
    }
}
```
