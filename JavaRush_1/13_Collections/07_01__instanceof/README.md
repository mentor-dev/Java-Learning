### **The task to solve:**  

У методі `main` створюється список, заповнюється різними об'єктами й передається в метод `checkElementsType(ArrayList<Object>)`.  

Твоє завдання - реалізувати цей метод, який має визначити тип кожного елемента списку, а також:
1. Для типу `String` викликати `printString()`;
2. Для типу `Integer` викликати `printInteger()`;
3. Для типу `Integer[]` викликати `printIntegerArray()`;
4. Для решти типів викликати `printUnknown()`.

Метод `main` у перевірці не використовується.

---

### **Requirements:**  

• Не змінювати оголошення й реалізацію методу printString(String).  
• Не змінювати оголошення й реалізацію методу printInteger(Integer).  
• Не змінювати оголошення й реалізацію методу printIntegerArray(Integer[]).  
• Не змінювати оголошення й реалізацію методу printUnknown(Object).  
• Метод checkElementsType(ArrayList\<Object\>) має працювати згідно з умовою.  

---

### **Start code:**  

```java
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        var elements = new ArrayList<>();
        elements.add("Привіт");
        elements.add(10);
        elements.add(new Integer[15]);
        elements.add(new LinkageError());

        checkElementsType(elements);
    }

    public static void checkElementsType(ArrayList<Object> elements) {
        //напишіть тут ваш код
    }

    public static void printString() {
        System.out.println("Рядок");
    }

    public static void printInteger() {
        System.out.println("Ціле число");
    }                     

    public static void printIntegerArray() {
        System.out.println("Масив цілих чисел");
    }

    public static void printUnknown() {
        System.out.println("Інший тип даних");
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        var elements = new ArrayList<>();
        elements.add("Привіт");
        elements.add(10);
        elements.add(new Integer[15]);
        elements.add(new LinkageError());

        checkElementsType(elements);
    }

    public static void checkElementsType(ArrayList<Object> elements) {
        for (var elem : elements) {
            if (elem instanceof String) {
                printString();
            } else if (elem instanceof Integer) {
                printInteger();
            } else if (elem instanceof Integer[]) {
                printIntegerArray();
            } else {
                printUnknown();
            }
        }
    }

    public static void printString() {
        System.out.println("Рядок");
    }

    public static void printInteger() {
        System.out.println("Ціле число");
    }                     

    public static void printIntegerArray() {
        System.out.println("Масив цілих чисел");
    }

    public static void printUnknown() {
        System.out.println("Інший тип даних");
    }
}
```
