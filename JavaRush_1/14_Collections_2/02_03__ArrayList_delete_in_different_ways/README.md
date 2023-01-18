### **The task to solve:**  

У класі `Solution` оголошено методи, які слід реалізувати таким чином:

1. `removeBugWithFor(ArrayList<String>)` - має видалити зі списку рядок, який містить слово `bug`, за допомогою циклу `for` і лічильника.
2. `removeBugWithWhile(ArrayList<String>)` - має видалити зі списку рядок, який містить слово `bug`, за допомогою циклу `while` і методу `iterator()`.
3. `removeBugWithCopy(ArrayList<String>)` - має видалити зі списку рядок, який містить слово `bug`, за допомогою циклу `for-each` і копії списку.

Під час пошуку слова `bug` регістр не враховується.  
Метод `main` реалізовано для вашого коду, і він у перевірці не використовується.

---

### **Requirements:**  

• Клас Solution має містити публічний статичний метод removeBugWithFor(ArrayList\<String\>), який не повертає жодного значення (тип void).  
• Клас Solution має містити публічний статичний метод removeBugWithWhile(ArrayList\<String\>), який не повертає жодного значення (тип void).  
• Клас Solution має містити публічний статичний метод removeBugWithCopy(ArrayList\<String\>), який не повертає жодного значення (тип void).  
• Метод removeBugWithFor(ArrayList\<String\>) має працювати згідно з умовою.  
• Метод removeBugWithWhile(ArrayList\<String\>) має працювати згідно з умовою.  
• Метод removeBugWithCopy(ArrayList\<String\>) має працювати згідно з умовою.  

---

### **Start code:**  

```java
import java.util.ArrayList;
import java.util.Iterator;

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);

        removeBugWithFor(copyWordsFirst);
        removeBugWithWhile(copyWordsSecond);
        removeBugWithCopy(copyWordsThird);

        copyWordsFirst.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        copyWordsSecond.forEach(System.out::println);
        System.out.println(line);
        copyWordsThird.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) {
        //напишіть тут ваш код
    }

    public static void removeBugWithWhile(ArrayList<String> list) {
        //напишіть тут ваш код
    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.ArrayList;
import java.util.Iterator;

public class Solution {

    static final String WORD_TO_REMOVE = "bug";

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);

        removeBugWithFor(copyWordsFirst);
        removeBugWithWhile(copyWordsSecond);
        removeBugWithCopy(copyWordsThird);

        copyWordsFirst.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        copyWordsSecond.forEach(System.out::println);
        System.out.println(line);
        copyWordsThird.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase(WORD_TO_REMOVE)) {
                list.remove(i);
                i--;
            }
        }
    }

    public static void removeBugWithWhile(ArrayList<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(WORD_TO_REMOVE)) {
                it.remove();
            }
        }
    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        ArrayList<String> copyList = new ArrayList<>(list);
        for (String word : copyList) {
            if (word.equalsIgnoreCase(WORD_TO_REMOVE)) {
                list.remove(word);
            }
        }
    }
}
```
