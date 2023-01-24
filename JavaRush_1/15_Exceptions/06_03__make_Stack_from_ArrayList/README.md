### **The task to solve:**  

У класі `MyStack` потрібно реалізувати свою версію структури зберігання даних «стек» на базі `ArrayList`.  
Всі елементи зберігаються в приватному списку `storage`. Твоє завдання - реалізувати всі оголошені методи класу `MyStack`, де:
- метод `push(String)` додає елемент у початок списку `storage`; 
- метод `pop()` повертає перший елемент списку `storage`, а потім видаляє його з цього списку; 
- метод `peek()` повертає перший елемент списку `storage`;
- метод `empty()` перевіряє, чи не є список `storage` порожнім. 
- метод `search(String)` шукає елемент у списку `storage` і повертає його індекс; якщо елемента немає в списку - повертає `-1`.

---

### **Requirements:**  

• Метод push(String) слід реалізувати згідно з умовою.  
• Метод pop() слід реалізувати згідно з умовою.  
• Метод peek() слід реалізувати згідно з умовою.  
• Метод empty() слід реалізувати згідно з умовою.  
• Метод search(String) слід реалізувати згідно з умовою.

---

### **Start code:**  

```java
import java.util.ArrayList;
import java.util.List;

public class MyStack {

    private final List<String> storage = new ArrayList<>();

    public void push(String s) {
        //напишіть тут ваш код
    }                   

    public String pop() {
        //напишіть тут ваш код
    }

    public String peek() {
        //напишіть тут ваш код
    }

    public boolean empty() {
        //напишіть тут ваш код
    }

    public int search(String s) {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/MyStack.java)**  

```java
import java.util.ArrayList;
import java.util.List;

public class MyStack {

    private final List<String> storage = new ArrayList<>();

    public void push(String s) {
        storage.add(0, s);
    }                   

    public String pop() {
        return storage.remove(0);
    }

    public String peek() {
        return storage.get(0);
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    public int search(String s) {
        return storage.indexOf(s);
    }
}
```
