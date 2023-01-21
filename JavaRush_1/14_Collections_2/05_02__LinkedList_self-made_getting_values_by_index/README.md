### **The task to solve:**  

Розв'язуючи цю задачу, ти навчишся видобувати елемент із двобічно зв'язаного списку.  
Ми реалізували метод `add`, який додає елементи в кінець списку. Тобі потрібно реалізувати метод `get(int)`, який поверне рядок з індексом, переданим у метод. Якщо рядка з таким індексом немає, слід повернути `null`.  
Пам'ятай, що `first` і `last` не мають значень, а лише посилаються відповідно на перший і останній елементи.

---

### **Requirements:**  

• Метод get(int index) має повертати елемент списку з індексом index.

---

### **Start code:**  

```java
public class Solution {

    public static void main(String[] args) {
        StringsLinkedList stringsLinkedList = new StringsLinkedList();
        stringsLinkedList.add("1");
        stringsLinkedList.add("2");
        stringsLinkedList.add("3");
        stringsLinkedList.add("4");
        stringsLinkedList.add("5");
        stringsLinkedList.add("6");
        stringsLinkedList.add("7");
        stringsLinkedList.add("8");
        stringsLinkedList.add("9");
        System.out.println(stringsLinkedList.get(4)); // 5
    }
}
```

```java
public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void add(String value) {
        if (first.next == null) {
            Node node = new Node();
            node.value = value;
            first.next = node;
        }
        if (last.prev == null) {
            last.prev = first.next;
            return;
        }

        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public String get(int index) {
        //напишіть тут ваш код
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
```

---

### **My solution: [Link](./src/)**  

```java
public class Solution {

    public static void main(String[] args) {
        StringsLinkedList stringsLinkedList = new StringsLinkedList();
        stringsLinkedList.add("1");
        stringsLinkedList.add("2");
        stringsLinkedList.add("3");
        stringsLinkedList.add("4");
        stringsLinkedList.add("5");
        stringsLinkedList.add("6");
        stringsLinkedList.add("7");
        stringsLinkedList.add("8");
        stringsLinkedList.add("9");
        System.out.println(stringsLinkedList.get(4)); // 5
    }
}
```

```java
public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void add(String value) {
        if (first.next == null) {
            Node node = new Node();
            node.value = value;
            first.next = node;
        }
        if (last.prev == null) {
            last.prev = first.next;
            return;
        }

        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public String get(int index) {
        if (index < 0) return null;
        int i = 0;
        Node currentNode = first.next;
        while (i < index) {
            currentNode = currentNode.next;
            if (currentNode == null) {
                return null;
            }
            i++;
        }
        return currentNode.value;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
```
