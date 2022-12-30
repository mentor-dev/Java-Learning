**Завдання:**  
Використовуючи вкладені цикли `while` (цикл у циклі), виведи на екран заповнений прямокутник розміром `5` (висота) на `10` (ширина) з літер «`Q`».

**Приклад виведення:**
```
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
```

---

**Вимоги:**  
• Програма повинна виводити текст на екран.  
• Програма повинна виводити прямокутник висотою 5 і шириною 10, заповнений літерами 'Q'.  
• У програмі потрібно використовувати вкладені цикли while (цикл у циклі).  
• Виведення на екран повинно відбуватися в циклі while.

---

**Start code:**  
```java
/* 
Заповнений прямокутник
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код

    }
}
```

---

**My solution: [Link](./src/Solution.java)**  
```java
public class Solution {
    public static void main(String[] args) throws Exception {
        String sign = "Q";
        int rows = 5;
        int columns = 10;
        int rows_ind = 0;
        while (rows_ind < rows) {
            int Columns_ind = 0;
            while (Columns_ind < columns) {
                System.out.print(sign);
                Columns_ind++;
            }
            if (rows_ind != (rows - 1))
                System.out.println();
            rows_ind++;
        }
    }
}
```