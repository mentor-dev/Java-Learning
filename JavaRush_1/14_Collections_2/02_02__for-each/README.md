### **The task to solve:**  

У класі `Solution` є методи `printHashSet(HashSet<String>)` і `printList(ArrayList<String>)`, які виводять усі елементи з переданих колекцій - списку та множини - з нового рядка. Твоє завдання - переписати ці методи, використовуючи цикл `for-each`.  
Метод `main` у перевірці не використовується.

---

### **Requirements:**  

• Клас Solution має містити публічний статичний метод printHashSet(HashSet\<String\>), який не повертає жодного значення (тип void).  
• Клас Solution має містити публічний статичний метод printList(ArrayList\<String\>), який не повертає жодного значення (тип void).  
• Метод printHashSet(HashSet\<String\>) має виводити всі елементи за допомогою циклу for-each.  
• Метод printList(ArrayList\<String\>) має виводити всі елементи за допомогою циклу for-each.

---

### **Start code:**  

```java
import java.util.*;

public class Solution {

    public static void printList(ArrayList<String> words) {
        for (Iterator<String> iterator = words.iterator(); iterator.hasNext(); ) {
            String word = iterator.next();
            System.out.println(word);
        }
    }

    public static void printHashSet(HashSet<String> words) {
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        String[] wordsArray = "Гадаю, це буде нова фіча. Тільки нікому не кажіть, що вона виникла випадково.".split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
        HashSet<String> wordsHashSet = new HashSet<>(wordsList);
        printList(wordsList);
        System.out.println("__________________________________");
        printHashSet(wordsHashSet);
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.*;

public class Solution {

    public static void printList(ArrayList<String> words) {
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void printHashSet(HashSet<String> words) {
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        String[] wordsArray = "Гадаю, це буде нова фіча. Тільки нікому не кажіть, що вона виникла випадково.".split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
        HashSet<String> wordsHashSet = new HashSet<>(wordsList);
        printList(wordsList);
        System.out.println("__________________________________");
        printHashSet(wordsHashSet);
    }
}
```
