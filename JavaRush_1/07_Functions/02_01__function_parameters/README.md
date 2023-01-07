### **The task to solve:**  

Перейменуй параметри методу `printPersonInfo()`:  
`firstName` на `name`;  
`lastName` на `surname`;  
`favouriteDish` на `meal`;  
у такий спосіб, щоб функціонал програми залишився незмінним.  
Імена змінних в методі `main()` залиш без змін.

---

### **Requirements:**  

• Параметри методу printPersonlnfo() мають називатися name, surname і meal.  
• Результат виведення в консоль має відповідати умові задачі.  
• У методі main() змінні firstName, lastName, favouriteDish мають залишитися без змін.

---

### **Start code:**  

```java
public class Solution {

    public static void main(String[] args) {
        String firstName = "Даша";
        String lastName = "Євтух";
        String favouriteDish = "Борщ";
        printPersonInfo(firstName, lastName, favouriteDish);
    }

    public static void printPersonInfo(String firstName, String lastName, String favouriteDish){
        System.out.println("Коротке досьє:");
        System.out.println("Ім'я: " + firstName);
        System.out.println("Прізвище: " + lastName);
        System.out.println("Улюблена страва: " + favouriteDish);
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {

    public static void main(String[] args) {
        String firstName = "Даша";
        String lastName = "Євтух";
        String favouriteDish = "Борщ";
        printPersonInfo(firstName, lastName, favouriteDish);
    }

    public static void printPersonInfo(String name, String surname, String meal) {
        System.out.println("Коротке досьє:");
        System.out.println("Ім'я: " + name);
        System.out.println("Прізвище: " + surname);
        System.out.println("Улюблена страва: " + meal);
    }
}
```
