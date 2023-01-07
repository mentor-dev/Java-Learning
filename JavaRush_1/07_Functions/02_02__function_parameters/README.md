### **The task to solve:**  

Метод `createCrew()` виводить посади та імена членів екіпажу космічного корабля.  
Щоб уникнути плутанини всередині методу `createCrew()`, зміни імена його параметрів так, щоб вони відповідали іменам змінних, які передаються в метод:  

`name1` на `navigator`  
`name2` на `pilot`  
`name3` на `secondPilot`  
`name4` на `flightEngineer`  

Після перейменування параметрів результат виконання програми не повинен змінитися.

---

### **Requirements:**  

• Параметри методу createCrew() мають називатися navigator, pilot, secondPilot і flightEngineer.  
• Результат виведення в консоль має відповідати умові задачі.  
• У методі main() змінні navigator, pilot, secondPilot і flightEngineer мають залишитися без змін.

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        String navigator = "Джон";
        String pilot = "Пол";
        String secondPilot = "Джордж";
        String flightEngineer = "Рінго";
        createCrew(navigator, pilot, secondPilot, flightEngineer);
    }

    public static void createCrew(String name1, String name2, String name3, String name4){
        System.out.println("Четвірка, яка має підкорити космос:");
        System.out.println("Штурман: " + name1);
        System.out.println("Пілот: " + name2);
        System.out.println("Другий пілот: " + name3);
        System.out.println("Бортінженер: " + name4);
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static void main(String[] args) {
        String navigator = "Джон";
        String pilot = "Пол";
        String secondPilot = "Джордж";
        String flightEngineer = "Рінго";
        createCrew(navigator, pilot, secondPilot, flightEngineer);
    }

    public static void createCrew(String navigator, String pilot, String secondPilot, String flightEngineer){
        System.out.println("Четвірка, яка має підкорити космос:");
        System.out.println("Штурман: " + navigator);
        System.out.println("Пілот: " + pilot);
        System.out.println("Другий пілот: " + secondPilot);
        System.out.println("Бортінженер: " + flightEngineer);
    }
}
```
