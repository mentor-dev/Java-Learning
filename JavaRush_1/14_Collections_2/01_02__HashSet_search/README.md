### **The task to solve:**  

У класі `Solution` є метод `checkWords(String)`, який має перевіряти наявність переданого слова в множині `words`.  

Якщо слово є, то виводимо в консоль:  
`Слово [передане слово] є в множині`  
Якщо слова немає:  
`Слова [передане слово] немає в множині`

Метод `main` у перевірці не використовується.

**Приклад виведення:**  

```
Слово Java є в множині
```

---

### **Requirements:**  

• Клас Solution має містити публічне статичне поле words типу HashSet\<String\>.  
• Клас Solution має містити публічний статичний метод checkWords(String), який не повертає жодного значення (тип void).  
• Метод checkWords(String) має працювати згідно з умовою.

---

### **Start code:**  

```java
import java.util.Arrays;
import java.util.HashSet;

import static java.util.Arrays.asList;

public class Solution {
    public static HashSet<String> words = new HashSet<>(asList("Якби мене попросили вибрати мову взамін на Java, я б не вибирав".split(" ")));

    public static void checkWords(String word) {
        //напишіть тут ваш код
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.HashSet;

import static java.util.Arrays.asList;

public class Solution {
    public static HashSet<String> words = new HashSet<>(asList("Якби мене попросили вибрати мову взамін на Java, я б не вибирав".split(" ")));
    // public static HashSet<String> words = new HashSet<>(asList("Якби мене попросили вибрати мову взамін на Java, я б не вибирав".split("[ ,]")));

    public static void checkWords(String word) {
        if (words.contains(word)) {
            System.out.printf("Слово %s є в множині\n", word);
        } else {
            System.out.printf("Слова %s немає в множині\n", word);
        }
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}
```
