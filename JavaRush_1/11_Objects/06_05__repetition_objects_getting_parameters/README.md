### **The task to solve:**  

Клас `City` має два поля - назва міста й поточна температура повітря. Крім того, клас `Solution` містить метод `showWeather`, який виводить у консоль інформацію про погоду в місті, переданому як аргумент методу.  
Реалізуй метод `showWeather`, який має виводити в консоль інформацію в такому форматі: У місті "назва міста" сьогодні температура повітря "температура в місті".  
У методі `main` слід один раз викликати метод `showWeather` з потрібним аргументом.

**Приклад виведення:**

```
У місті Дубай сьогодні температура повітря 40
```

---

### **Requirements:**  

• Не змінюй клас City.  
• Клас Solution має містити метод showWeather з параметром City.  
• Метод showWeather має використовувати гетери класу City.  
• Метод showWeather має виводити текст у консоль відповідно до умови.

---

### **Start code:**  

```java
public class Solution {

    public static void showWeather(City city) {
        //напишіть тут ваш код
    }

    public static void main(String[] args) {
        //напишіть тут ваш код
    }
}
```

```java
public class City {
    private String name;
    private int temperature;

    public City(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }
                        
    public String getName() {
        return name;
    }

    public int getTemperature() {
        return temperature;
    }
}
```

---

### **My solution: [Link](./src/)**  

```java
public class Solution {

    public static void showWeather(City city) {
        String resultString = String.format("У місті %s сьогодні температура повітря %d", city.getName(), city.getTemperature());
        System.out.println(resultString);
    }

    public static void main(String[] args) {
        City kyivCity = new City("Kyiv", 20);
        showWeather(kyivCity);
    }
}
```

```java
public class City {
    private String name;
    private int temperature;

    public City(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }
                        
    public String getName() {
        return name;
    }

    public int getTemperature() {
        return temperature;
    }
}
```
