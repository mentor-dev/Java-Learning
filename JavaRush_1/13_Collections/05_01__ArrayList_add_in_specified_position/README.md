### **The task to solve:**  

У 3020 році вчені навчилися створювати нові планети, одну з яких відправили в Сонячну систему.  
Орбіта цієї планети пролягає між орбітами Землі та Марса.  
Реалізуй метод `createNewPlanet(String)`, який має додавати передану планету в список `planets` одразу за Землею. Подивись, як змінилася послідовність планет.  
Методи `main()`, `addPlanets()` і `print()` у перевірці не використовуються.  

---

### **Requirements:**  

• Метод createNewPlanet(String) має додавати передану планету в список planets на наступну позицію після Землі.

---

### **Start code:**  

```java
import java.util.ArrayList;

public class Solution {
    public static ArrayList<String> planets = new ArrayList<>();

    public static void main(String[] args) {
        addPlanets();
        print();
        createNewPlanet("Зоря Смерті");
        print();
    }

    public static void createNewPlanet(String planetName) {
        //напишіть тут ваш код
    }

    public static void addPlanets() {
        planets.add("Меркурій");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпітер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
    }

    public static void print() {
        for (int i = 0; i < planets.size(); i++) {
            System.out.println(String.format("%s — %d-а (-я) планета від Сонця", planets.get(i), (i + 1)));
        }
        System.out.println();
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.ArrayList;

public class Solution {
    public static ArrayList<String> planets = new ArrayList<>();

    public static void main(String[] args) {
        addPlanets();
        print();
        createNewPlanet("Зоря Смерті");
        print();
    }

    public static void createNewPlanet(String planetName) {
        int targetIndex = planets.indexOf("Земля") + 1;
        planets.add(targetIndex, planetName);
    }

    public static void addPlanets() {
        planets.add("Меркурій");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпітер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
    }

    public static void print() {
        for (int i = 0; i < planets.size(); i++) {
            System.out.println(String.format("%s — %d-а (-я) планета від Сонця", planets.get(i), (i + 1)));
        }
        System.out.println();
    }
}
```
