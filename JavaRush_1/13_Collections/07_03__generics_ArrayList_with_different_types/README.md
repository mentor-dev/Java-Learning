### **The task to solve:**  

У класі `Solution` є метод `printAnything(ArrayList)`, який має отримувати список і виводити його вміст у консоль.  
Наразі метод отримує на вході тільки список рядків. Твоє завдання - виправити метод так, щоб він отримував на вході список із будь-якими типами даних (для цього потрібно видалити відповідне узагальнення).  
Метод `main` у перевірці не використовується.

---

### **Requirements:**  

• Виправ сигнатуру методу printAnything так, щоб він отримував список із будь-якими типами даних.  

---

### **Start code:**  

```java
import java.util.ArrayList;

public class Solution {

    public static void printAnything(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public static void main(String[] args) {
        var arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add("Hello");
        arrayList.add(154);
        arrayList.add("string");

        printAnything(arrayList);
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.ArrayList;

public class Solution {

    public static void printAnything(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public static void main(String[] args) {
        var arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add("Hello");
        arrayList.add(154);
        arrayList.add("string");

        printAnything(arrayList);
    }
}
```
