### **The task to solve:**  

**ArrayList** - це список, який зберігає динамічно розширюваний масив елементів. Зараз ми будемо реалізовувати свою версію списку, в якому зберігаються рядки. Клас `CustomStringArrayList` має три поля:  
- `String[] elements` - це масив поточних елементів (у схожому масиві зберігає значення `ArrayList`). Початково його розмір дорівнює `10` (`capacity = 10`).  
- `int size` - кількість заповнених елементів, початкове значення - `0`.  
- `int capacity` - поточна місткість масиву (`elements`) даних, яка збільшуватиметься в ході додавання даних.  

Для простоти реалізації ми будемо використовувати лише два методи:  
1. Публічний метод `add(String)`, який додає елементи в масив. Цей метод дасть нам змогу побачити, як масив динамічно розширюється.  
Коли масив заповнено (`size == capacity`), викликається метод `grow()` для розширення масиву.  
2. Приватний метод `grow()`, який має присвоїти полю `elements` новий масив у півтора раза більшої місткості (`capacity`), ніж у старого масиву, і скопіювати дані зі старого масиву в новий у тому самому порядку. Поле `capacity` має збільшитися так само, як і розмір масиву.

---

### **Requirements:**  

• Клас CustomStringArrayList має містити нестатичні приватні поля int size, int capacity, String[] elements.  
• Клас CustomStringArrayList має містити конструктор без параметрів, який ініціалізує поле size значенням 0, поле capacity - значенням 10, поле elements - новим масивом (розмір масиву - capacity).  
• Клас CustomStringArrayList має містити метод public void add(String).  
• Клас CustomStringArrayList має містити метод private void grow().  
• Метод grow() має працювати згідно з умовою.  
• Метод add(String) змінювати не можна.

---

### **Start code:**  

```java
public class Solution {

    public static void main(String[] args) {
        CustomStringArrayList arrayList = new CustomStringArrayList();
        for(int i = 0; i < 25; i++) {
            arrayList.add("count" + i);
        }
    }
}
```

```java
public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }                        

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/)**  

```java
public class Solution {

    public static void main(String[] args) {
        CustomStringArrayList arrayList = new CustomStringArrayList();
        for(int i = 0; i < 25; i++) {
            arrayList.add("count" + i);
        }
    }
}
```

```java
import java.util.Arrays;

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }                        

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        capacity = (int) (capacity * 1.5);
        String[] secondArray = Arrays.copyOf(elements, capacity);
        elements = secondArray;
    }
}
```
