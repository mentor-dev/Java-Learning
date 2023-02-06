### **The task to solve:**  

У `2010` році людині виповнилося `40` років. Ми спробували визначити рік, коли їй виповнилося `30` років, і програма видала `2020` рік. Як таке можливо? Зміни один символ у коді так, щоб програма вивела `2000` рік.

---

### **Requirements:**  

• У коді потрібно змінити один символ, щоб програма вивела 2000 рік.

---

### **Start code:**  

```java
import java.time.LocalDate;

public class Solution {

    public static void main(String[] args) {
        LocalDate jubilee40Years = LocalDate.of(-2010, 3, 13);

        LocalDate jubilee30Years = jubilee40Years.minusYears(10);
                          
        System.out.println(Math.abs(jubilee30Years.getYear()));
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.time.LocalDate;

public class Solution {

    public static void main(String[] args) {
        LocalDate jubilee40Years = LocalDate.of(2010, 3, 13);

        LocalDate jubilee30Years = jubilee40Years.minusYears(10);
                          
        System.out.println(Math.abs(jubilee30Years.getYear()));
    }
}
```
