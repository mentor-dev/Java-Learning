### **The task to solve:**  

У класі `Solution` є список працівників `waitingEmployees`, які чекають на зарплату, і список працівників `alreadyGotSalaryEmployees`, які вже її отримали.  
Потрібно реалізувати метод `paySalary(String)`. Як аргумент у метод слід передати ім'я працівника, котрий бажає отримати зарплату.  
Метод має перевірити наявність працівника в списку `waitingEmployees`, і якщо він ще не отримав зарплату, видати її:  
1. Якщо параметр методу `paySalary(String)` дорівнює `null`, нічого робити не треба.  
2. Додати ім'я працівника в список `alreadyGotSalaryEmployees`.  
3. У списку waitingEmployees замінити ім'я працівника на `null`.

---

### **Requirements:**  

• Метод paySalary(String) має додавати в список alreadyGotSalaryEmployees ім'я працівника, якщо воно є в списку waitingEmployees.  
• Метод paySalary(String) має заміняти ім'я працівника на значення null, якщо воно є в списку waitingEmployees.  
• Метод paySalary(String) не повинен змінювати списки waitingEmployees і alreadyGotSalaryEmployees, якщо переданого імені немає в списку waitingEmployees.  
• Якщо в метод paySalary(String) передається null, метод не повинен додавати це значення у waitingEmployees або alreadyGotSalaryEmployees.

---

### **Start code:**  

```java
import java.util.ArrayList;

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвінно");
        waitingEmployees.add("Гунігерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Ніфрод");
        waitingEmployees.add("Альбіуф");
        waitingEmployees.add("Іногрім");
        waitingEmployees.add("Фріле");
    }

    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.ArrayList;

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвінно");
        waitingEmployees.add("Гунігерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Ніфрод");
        waitingEmployees.add("Альбіуф");
        waitingEmployees.add("Іногрім");
        waitingEmployees.add("Фріле");
    }

    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {
        if (name == null)
            return;
        
        if (waitingEmployees.contains(name)) {
            alreadyGotSalaryEmployees.add(name);
            int pos = waitingEmployees.indexOf(name);
            waitingEmployees.set(pos, null);
        }
    }
}
```
