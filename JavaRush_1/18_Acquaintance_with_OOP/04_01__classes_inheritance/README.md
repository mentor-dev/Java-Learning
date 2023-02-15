### **The task to solve:**  

Перед тим, як космічний корабель стартує у Всесвіт, побтрібно запросити на борт екіпаж, який складатиметься із `2` людей, `1` собаки й `1` кота.  
У методі `createCrew()` додай потрібну кількість екземплярів відповідних класів до списку `astronauts`.

**Підказка:**  
Щоб додати до одного списку об'єкти різних класів, їм потрібен спільний предок. Успадкуй відповідні класи від класу `Astronaut`. Дослідником космосу може стати кожний :)

---

### **Requirements:**  

• Класи Human, Dog і Cat мають успадковуватися від класу Astronaut.  
• До списку astronauts має бути додано два об'єкти типу Human.  
• До списку astronauts має бути додано один об'єкт типу Dog.  
• До списку astronauts має бути додано один об'єкт типу Cat.  

---

### **Start code:**  

```java
import java.util.ArrayList;

public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
    }

    public static void createCrew(){
        //напишіть тут ваш код
    }

    public static void printCrewInfo() {
        System.out.println("На борт прибули члени екіпажу: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
```

```java
public class Astronaut {
    public String getInfo(){
        return "Невідомий астронавт";
    }
}
```

```java
public class Human {
    public String getInfo(){
        return "Людина";
    }
}
```

```java
public class Cat {
    public String getInfo(){
        return "Кіт"; 
    }
}
```

```java
public class Dog {
    public String getInfo(){
        return "Собака";
    }
}
```

---

### **My solution: [Link](./src/)**  

```java
import java.util.ArrayList;

public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
    }

    public static void createCrew() {
        astronauts.add(new Human());
        astronauts.add(new Human());
        astronauts.add(new Dog());
        astronauts.add(new Cat());
    }

    public static void printCrewInfo() {
        System.out.println("На борт прибули члени екіпажу: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
```

```java
public class Astronaut {
    public String getInfo() {
        return "Невідомий астронавт";
    }
}
```

```java
public class Human extends Astronaut {
    public String getInfo() {
        return "Людина";
    }
}
```

```java
public class Cat extends Astronaut {
    public String getInfo() {
        return "Кіт";
    }
}
```

```java
public class Dog extends Astronaut {
    public String getInfo() {
        return "Собака";
    }
}
```
