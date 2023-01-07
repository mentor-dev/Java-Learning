### **The task to solve:**  

Перед тобою програма, яка виводить інформацію про людину в консоль. На жаль, програма не компілюється.  
Зміни мінімальну необхідну кількість модифікаторів доступу в класі `Person`, щоб код скомпілювався.

---

### **Requirements:**  

• Код має компілюватися.  
• Потрібно змінити мінімальну необхідну кількість модифікаторів доступу в класі Person.

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        Person person = new Person("Петро", "Петренко");
        System.out.println("Досьє.");
        System.out.println("Ім'я: " + person.getFirstName());
        System.out.println("Прізвище: " + person.getLastName());
        System.out.println("Повне ім'я: " + person.getFullName());
    }
}
```

```java
public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    private String getFullName(){
        return firstName + " " + lastName;
    }
}
```

---

### **My solution: [Link](./src/)**  

```java
public class Solution {
    public static void main(String[] args) {
        Person person = new Person("Петро", "Петренко");
        System.out.println("Досьє.");
        System.out.println("Ім'я: " + person.getFirstName());
        System.out.println("Прізвище: " + person.getLastName());
        System.out.println("Повне ім'я: " + person.getFullName());
    }
}
```

```java
public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    protected String getFullName(){
        return firstName + " " + lastName;
    }
}
```
