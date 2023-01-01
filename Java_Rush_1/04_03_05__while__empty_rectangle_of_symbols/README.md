### **Завдання:** 

Використовуючи вкладені цикли `while` (цикл у циклі), виведи на екран незаповнений прямокутник (контур) розміром `10` (висота) на `20` (ширина) з літер «`Б`».  
Незаповнена частина складається з пробілів.

**Приклад виведення:**
```
ББББББББББББББББББББ
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
ББББББББББББББББББББ
```

---

### **Вимоги:**  

• Програма повинна виводити текст на екран.  
• Програма повинна виводити контур прямокутника висотою 10 і шириною 20 із літер 'Б'.  
• У програмі потрібно використовувати вкладені цикли while (цикл у циклі).  
• Виведення на екран повинно відбуватися в циклі while.

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
        String symbol_border = "Б";
        String symbol_solid = " ";
        int rows = 10;
        int columns = 20;
        int rows_ind = 0;
        while (rows_ind < rows) {
            int columns_ind = 0;
            while (columns_ind < columns) {
                if (rows_ind == 0 || rows_ind == (rows - 1)) {
                    System.out.print(symbol_border);
                } else {
                    if (columns_ind == 0 || columns_ind == (columns - 1)) {
                        System.out.print(symbol_border);
                    } else {
                        System.out.print(symbol_solid);
                    }
                }
                columns_ind++;
            }
            if (rows_ind != (rows - 1))
                System.out.println();
            rows_ind++;
        }
    }
}
```
