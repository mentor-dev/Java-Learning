### **The task to solve:**  

Запусти програму й подивись, що відбувається.  
У методі `eat` додай блок `finally`, щоб лев лягав спати, навіть якщо йому не вдалося чогось перехопити.

Очікуваний результат на екрані, коли `food != null`:
```
шукає їжу
знайшов м'ясо
усе з'їв
ліг спати
```

Очікуваний результат на екрані, коли `food == null`:
```
шукає їжу
нічого не знайшов
ліг спати голодним
```

---

### **Requirements:**  

• Метод eat має містити блок finally.  
• Результат виведення має відповідати умові.

---

### **Start code:**  

```java
public class Solution {

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat(new Food("м'ясо"));
        lion.eat(null);
    }
}
```

```java
public class Lion {

    public void eat(Food food) {
        try {
            System.out.println();
            System.out.println("шукає їжу");
            System.out.println("знайшов " + food.name);
            System.out.println("усе з'їв");
        } catch (NullPointerException e) {
            System.out.println("нічого не знайшов");
            return;
        } //напишіть тут ваш код

        System.out.println("ліг спати" + (food == null ? " голодним" : ""));
    }
}
```

```java
public class Food {

    String name;

    public Food(String name) {
        this.name = name;
    }
}
```

---

### **My solution: [Link](./src/)**  

```java
public class Solution {

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat(new Food("м'ясо"));
        lion.eat(null);
    }
}
```

```java
public class Lion {

    public void eat(Food food) {
        try {
            System.out.println();
            System.out.println("шукає їжу");
            System.out.println("знайшов " + food.name);
            System.out.println("усе з'їв");
        } catch (NullPointerException e) {
            System.out.println("нічого не знайшов");
            return;
        } finally {
            System.out.println("ліг спати" + (food == null ? " голодним" : ""));
        }
    }
}
```

```java
public class Food {

    String name;

    public Food(String name) {
        this.name = name;
    }
}
```
