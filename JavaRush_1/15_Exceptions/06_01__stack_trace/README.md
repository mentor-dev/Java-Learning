### **The task to solve:**  

Якщо запустити програму, вона закінчується винятком. Однак із тексту винятку в консолі незрозуміло, де він виник. У цій задачі тобі потрібно:
- обгорнути блоками `try-catch` код методів `addIce`, `addVodka`, `addJuice` і `addOrange`;
- у блоках `catch` викликати метод `printBugMethodName` і передати в нього `stack trace`.

Якщо зробиш все правильно, під час запуску програми на екран буде виведено імена методів, в яких виникає виняток.

---

### **Requirements:**  

• Потрібно обгорнути блоками try-catch код методів addlce, addVodka, addJuice і addOrange.  
• У методах addlce, addVodka, addJuice і addOrange у блоках catch потрібно розмістити одну команду - виклик методу printBugMethodName.  
• Під час кожного виклику методу printBugMethodName потрібно передавати в нього поточний stack trace.

---

### **Start code:**  

```java
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        Map<String, Integer> screwdriverIngredients = makeScrewdriver();
        String screwdriver = screwdriverIngredients.keySet().stream()
                .map(key -> key + "=" + screwdriverIngredients.get(key))
                .collect(Collectors.joining(", ", "{", "}"));
        System.out.println(screwdriver);
    }

    static Map<String, Integer> makeScrewdriver() {
        Map<String, Integer> ingredients = new TreeMap<>();
        addIce(ingredients);
        addVodka(ingredients);
        addJuice(ingredients);
        addOrange(ingredients);
        return ingredients;
    }

    static void addIce(Map<String, Integer> ingredients) {
        ingredients.put("ice cubes", 7);
    }

    static void addVodka(Map<String, Integer> ingredients) {
        ingredients.put("vodka", 50);
    }

    static void addJuice(Map<String, Integer> ingredients) {
        ingredients.put(null, 100);
    }

    static void addOrange(Map<String, Integer> ingredients) {
        ingredients.put("orange slice", 1);
    }

    public static void printBugMethodName(StackTraceElement[] stackTraceElements) {
        StackTraceElement stackTraceElement = stackTraceElements[1];
        System.out.println(stackTraceElement.getMethodName());
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        Map<String, Integer> screwdriverIngredients = makeScrewdriver();
        String screwdriver = screwdriverIngredients.keySet().stream()
                .map(key -> key + "=" + screwdriverIngredients.get(key))
                .collect(Collectors.joining(", ", "{", "}"));
        System.out.println(screwdriver);
    }

    static Map<String, Integer> makeScrewdriver() {
        Map<String, Integer> ingredients = new TreeMap<>();
        addIce(ingredients);
        addVodka(ingredients);
        addJuice(ingredients);
        addOrange(ingredients);
        return ingredients;
    }

    static void addIce(Map<String, Integer> ingredients) {
        try {
            ingredients.put("ice cubes", 7);
        } catch (Exception e) {
            printBugMethodName(Thread.currentThread().getStackTrace());
        }
    }

    static void addVodka(Map<String, Integer> ingredients) {
        try {
            ingredients.put("vodka", 50);
        } catch (Exception e) {
            printBugMethodName(Thread.currentThread().getStackTrace());
        }
    }

    static void addJuice(Map<String, Integer> ingredients) {
        try {
            ingredients.put(null, 100);
        } catch (Exception e) {
            printBugMethodName(Thread.currentThread().getStackTrace());
        }
    }

    static void addOrange(Map<String, Integer> ingredients) {
        try {
            ingredients.put("orange slice", 1);
        } catch (Exception e) {
            printBugMethodName(Thread.currentThread().getStackTrace());
        }
    }

    public static void printBugMethodName(StackTraceElement[] stackTraceElements) {
        StackTraceElement stackTraceElement = stackTraceElements[1];
        System.out.println(stackTraceElement.getMethodName());
    }
}
```
