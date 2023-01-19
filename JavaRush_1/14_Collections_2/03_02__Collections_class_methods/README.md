### **The task to solve:**  

У класі Solution оголошено методи: `reverse(ArrayList<Integer>)`, `sort(ArrayList<Integer>)`, `rotate(ArrayList<Integer>, int)`, `shuffle(ArrayList<Integer>)`.  
Ти маєш розібратися, що саме роблять ці методи, і переписати їхній код, використовуючи тільки відповідні методи класу `Collections`.

---

### **Requirements:**  

• Клас Solution має містити публічний статичний метод reverse(ArrayList\<lnteger>), який не повертає жодного значення (тип void).  
• Клас Solution має містити публічний статичний метод sort(ArrayList\<lnteger>), який не повертає жодного значення (тип void).  
• Клас Solution має містити публічний статичний метод rotate(Arrayl_ist\<Integer> int), який не повертає жодного значення (тип void).  
• Клас Solution має містити публічний статичний метод shuffle(Arrayüst\<lnteger>), який не повертає жодного значення (тип void).  
• Метод reverse(ArrayList\<lnteger>) потрібно переписати, використовуючи метод reverse класу Collections.  
• Метод sort(ArrayList\<lnteger>) потрібно переписати, використовуючи метод sort класу Collections.  
• Метод rotate(ArrayList\<lnteger>, int) потрібно переписати, використовуючи метод rotate класу Collections.  
• Метод shuffle(Arraylist\<lnteger>) потрібно переписати, використовуючи метод shuffle класу Collections.  

---

### **Start code:**  

```java
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Solution {

    public static void reverse(ArrayList<Integer> list) {
        for (int i = 0, j = list.size() - 1; i < list.size() / 2; i++) {
            Integer integer = list.get(i);
            list.set(i, list.get(j - i));
            list.set(j - i, integer);
        }
    }

    public static void sort(ArrayList<Integer> list) {
        int n = list.size();
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (list.get(j - 1) > list.get(j)) {
                    temp = list.get(j - 1);
                    list.set(j - 1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    public static void rotate(ArrayList<Integer> list, int distance) {
        for (int i = 0; i < distance; i++) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }
    }

    public static void shuffle(ArrayList<Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < list.size(); i++) {
            int randomIndexToSwap = rand.nextInt(list.size());
            int temp = list.get(randomIndexToSwap);
            list.set(randomIndexToSwap, list.get(i));
            list.set(i, temp);
        }
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }

    public static void rotate(ArrayList<Integer> list, int distance) {
        Collections.rotate(list, distance);
    }

    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }
}
```
