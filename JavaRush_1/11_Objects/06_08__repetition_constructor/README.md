### **The task to solve:**  

У класі `Solution` є поле `currentYear`, яке має ініціалізуватися значенням поточного року (`Calendar.getInstance().get(Calendar.YEAR)`) під час створення нового об'єкта типу `Solution`.  
Тобі потрібно знайти помилку й виправити її, щоб під час створення об'єкта класу `Solution` поле `currentYear` ініціалізувалося правильно.

---

### **Requirements:**  

• Клас Solution має містити приватне нестатичне поле currentYear типу int.  
• У класі Solution має бути гетер getCurrentYear для поля currentYear.  
• Під час створення об'єкта класу Solution поле currentYear має ініціалізуватися значенням поточного року (використовуй метод Calendar.getlnstance().get(Calendar.YEAR)).

---

### **Start code:**  

```java
import java.util.Calendar;

public class Solution {

    private int currentYear;

    public void Solution() {
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    public int getCurrentYear() {
        return currentYear;
    }
                      
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getCurrentYear());
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.Calendar;

public class Solution {

    private int currentYear;

    public Solution() {
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getCurrentYear());
    }
}
```
