### **The task to solve:**  

Розгляньмо аналог пам'яті комп'ютера на прикладі масиву рядків. Якщо видалити деякі елементи, то в масиві з'являться так звані "дірки" - елементи, рівні `null`. Метод `executeDefragmentation(String[])`, який отримує масив рядків, виконує його "дефрагментацію", тобто переміщує всі об'єкти на початок масиву зі збереженням їх порядку, а всі "дірки" (елементи, рівні `null`) пересуває в кінець масиву. У цій задачі тобі потрібно реалізувати метод `executeDefragmentation(String[])`.  
Метод `main()` можна використовувати для перевірки результату роботи методу `executeDefragmentation(String[])`.

---

### **Requirements:**  

• Клас Memory має містити метод public static void executeDefragmentation(String[]).  
• Реалізуй метод executeDefragmentation(String[]) згідно з умовою.

---

### **Start code:**  

```java
import java.util.Arrays;
import java.util.Objects;

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Memory.java)**  

```java
import java.util.Arrays;
import java.util.Objects;

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (Objects.isNull(array[i])) {
                for (int j = i + 1; j < array.length; j++) {
                    if (Objects.nonNull(array[j])) {
                        array[i] = array[j];
                        array[j] = null;
                        if (j == array.length - 1) 
                            i = array.length;
                        break;
                    }
                }
            }
        }
    }
}
```
