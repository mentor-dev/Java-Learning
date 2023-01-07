### **The task to solve:**  

Перед тобою 5 загальновідомих величин.  
Перепиши їх у зручнішому для читання форматі - експоненціальному. Мантиса повинна бути дробовим числом від `1.0` до `10`.  
Після зміни формату числа його реальне значення, що зберігається в змінній, має залишитися таким самим.

**Приклад:**  
`109.1678` — звичайна форма;  
`1.091678E+2` — експоненціальна форма запису.

---

### **Requirements:**  

• Наявним змінним мають бути присвоєні значення, записані в експоненціальному форматі.  
• Значенням мантиси має бути дробове число від 1.0 до 10.  
• Реальні значення змінних не повинні змінитися.

---

### **Start code:**  

```java
public class Solution {
    double earthDiameter = 12742.0;
    double lightSpeed = 299792458.0;
    double uraniumAtomicMass = 238.0289;
    double averageBeeWeight = 0.085;
    double javaDeveloperSalary = 10000.0;
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    double earthDiameter = 1.2742E+4;       //12742.0
    double lightSpeed = 2.99792458E+8;      //299792458.0
    double uraniumAtomicMass = 2.380289E+2; //238.0289
    double averageBeeWeight = 8.5E-2;       //0.085
    double javaDeveloperSalary = 1.0E+4;    //10000.0
}
```
