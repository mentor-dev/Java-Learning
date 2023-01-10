### **The task to solve:**  

У нас є клас `Programmer`, а в ньому є дуже важливе поле - `salary`. Наше завдання таке: треба додати можливість отримати й змінити значення цього поля за допомогою гетера й сетера.
Але є нюанс: зарплату можна тільки підвищувати. Отож тобі потрібно додати в сетер перевірку: якщо значення аргументу більше за поточне, то поле `salary` змінюємо, інакше - ігноруємо.

---

### **Requirements:**  

• Клас Programmer має містити приватне (private) нестатичне поле salary типу int.  
• Клас Programmer має містити публічний гетер для поля salary.  
• Клас Programmer має містити публічний сетер для поля salary.  
• Сетер має змінювати значення поля salary, тільки якщо значення вхідного аргументу перевищує поточне значення.

---

### **Start code:**  

```java
public class Programmer {
    private int salary = 1000;
    //напишіть тут ваш код
}
```

---

### **My solution: [Link](./src/Programmer.java)**  

```java
public class Programmer {
    private int salary = 1000;
    
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = (salary > this.salary) ? salary : this.salary;
    }
}
```
