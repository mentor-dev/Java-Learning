### **The task to solve:**  

Програма має виводити кількість населення найбільших міст світу й порівнювати його з найбільшим за чисельністю населення містом - Токіо. Але алгоритм програми трохи некоректний. Для виправлення помилки тобі потрібно зробити так, щоб у рядку з виведенням інформації про найбільше місто у світі використовувалися статичні змінні класу замість локальних аргументів методу.  

Якщо програма працює правильно, то результат виведення має бути таким:  
```
Населення міста Джакарта становить 25.3 млн осіб.
А тимчасом у найбільш населеному місті Токіо мешкає 34.5 млн осіб.
Населення міста Сеул становить 25.2 млн осіб.
А тимчасом у найбільш населеному місті Токіо мешкає 34.5 млн осіб.
Населення міста Делі становить 23.1 млн осіб.
А тимчасом у найбільш населеному місті Токіо мешкає 34.5 млн осіб.
Населення міста Нью-Йорк становить 21.6 млн осіб.
А тимчасом у найбільш населеному місті Токіо мешкає 34.5 млн осіб.
```

---

### **Requirements:**  

• Змінювати імена змінних не можна.  
• Для виведення інформації про найбільше місто потрібно використовувати статичні змінні класу - city і population.  
• Виведення результатів програми в консоль має відповідати умові задачі.

---

### **Start code:**  

```java
public class Solution {
    public static String city = "Токіо";
    public static double population = 34.5;

    public static void main(String[] args) {
        printCityPopulation("Джакарта", 25.3);
        printCityPopulation("Сеул", 25.2);
        printCityPopulation("Делі", 23.1);
        printCityPopulation("Нью-Йорк", 21.6);
    }

    public static void printCityPopulation(String city, double population){
        System.out.println("Населення міста " + city + " становить " + population + " млн осіб.");
        System.out.println("А тимчасом у найбільш населеному місті " + city + " мешкає " + population + " млн осіб.");
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static String city = "Токіо";
    public static double population = 34.5;

    public static void main(String[] args) {
        printCityPopulation("Джакарта", 25.3);
        printCityPopulation("Сеул", 25.2);
        printCityPopulation("Делі", 23.1);
        printCityPopulation("Нью-Йорк", 21.6);
    }

    public static void printCityPopulation(String city, double population){
        System.out.println("Населення міста " + city + " становить " + population + " млн осіб.");
        System.out.println("А тимчасом у найбільш населеному місті " + Solution.city + " мешкає " + Solution.population + " млн осіб.");
    }
}
```
