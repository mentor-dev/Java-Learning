### **The task to solve:**  

У класі `Solution` оголошено методи: `min(ArrayList<Integer>)`, `max(ArrayList<Integer>)`, `frequency(ArrayList<Integer>, Integer)`, `binarySearch(ArrayList<Integer>, Integer)`.  
Ти маєш розібратися, що саме роблять ці методи, і переписати їхній код, використовуючи тільки відповідні методи класу `Collections`.

---

### **Requirements:**  

• Клас Solution має містити публічний статичний метод min(ArrayList\<lnteger>), який повертає значення Integer.  
• Клас Solution має містити публічний статичний метод max(Arraylist\<lnteger>), який повертає значення Integer.  
• Клас Solution має містити публічний статичний метод frequency(ArrayList\<lnteger>, Integer), який повертає значення типу int.  
• Клас Solution має містити публічний статичний метод binarySearch(ArrayList\<lnteger>, Integer), який повертає значення типу int.  
• Метод min(ArrayList\<lnteger>) потрібно переписати, використовуючи метод min класу Collections.  
• Метод max(Arrayüst\<lnteger>) потрібно переписати, використовуючи метод max класу Collections.  
• Метод frequency(ArrayList\<lnteger>, Integer) потрібно переписати, використовуючи метод frequency класу Collections.  
• Метод binarySearch(ArrayList\<lnteger>, Integer) потрібно переписати, використовуючи метод binarySearch класу Collections.

---

### **Start code:**  

```java
import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public static Integer min(ArrayList<Integer> list) {
        Integer minimum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < minimum) {
                minimum = list.get(i);
            }
        }
        return minimum;
    }

    public static Integer max(ArrayList<Integer> list) {
        Integer maximum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > maximum) {
                maximum = list.get(i);
            }
        }
        return maximum;
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {
        int frequency = 0;
        if (element == null) {
            for (Integer integer : list)
                if (integer == null)
                    frequency++;
        } else {
            for (Integer integer : list) {
                if (integer.equals(element)) {
                    frequency++;
                }
            }
        }
        return frequency;
    }

    public static int binarySearch(ArrayList<Integer> list, Integer key) {
        int low = 0;
        int high = list.size() - 1;
        int mid = (low + high) / 2;
        int index = -1;
        while (low <= high) {
            if (list.get(mid) < key) {
                low = mid + 1;
            } else if (list.get(mid).equals(key)) {
                index = mid;
                break;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        return index;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public static Integer min(ArrayList<Integer> list) {
        return Collections.min(list);
    }

    public static Integer max(ArrayList<Integer> list) {
        return Collections.max(list);
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {
        return Collections.frequency(list, element);
    }

    public static int binarySearch(ArrayList<Integer> list, Integer key) {
        return Collections.binarySearch(list, key);
    }
}
```
