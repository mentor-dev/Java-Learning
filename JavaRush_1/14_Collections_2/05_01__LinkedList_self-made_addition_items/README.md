### **The task to solve:**  

Настав час познайомитися із двобічно зв'язаним списком. Розв'язуючи цю задачу, ти зрозумієш, як працює двобічно зв'язаний список, і зможеш додавати в нього елементи. У тебе є клас `StringsLinkedList`, який має поля `first` і `last`, що вказують, відповідно, на перший та останній елементи.  
Тобі потрібно реалізувати логіку методу `add`, який буде додавати елементи до списку.

**Підказки**  
1. Для правильної реалізації слід розуміти, що списком можна пересуватися як від першого елемента до останнього, так і в зворотному напрямку. Тому, додаючи нові елементи, не забувай змінювати посилання в сусідніх елементах.  
2. Метод `add` має створювати новий об'єкт класу `Node`, куди буде записано передане значення. Перш ніж додавати новий вузол, потрібно змінити посилання останнього вузла, вказавши новий вузол, а новий вузол стане останнім.  
3. Якщо список містить один елемент, то на нього вказують одночасно і `first.next`, і `last.prev`.  
4. Метод `printAll` створено для налагодження (`debug`), і в перевірці він не використовується.  

**Важливо!**  
Поле `Node first` не повинно містити значення - воно тільки вказує на перший елемент(`first.next`);  
`Node last` також не містить значення, а тільки вказує на останній елемент(`last.prev`).

---

### **Requirements:**  

• Під час додавання нового елемента попередній елемент має отримувати посилання на нього.  
• Під час додавання нового елемента він має отримувати посилання на попередній.  
• Поле first класу StringsLinkedList має завжди посилатися на перший елемент, не повинно містити значення (value) і посилання на попередній елемент (prev).  
• Поле last класу StringsLinkedList має завжди посилатися на останній елемент, не повинно містити значення (value) і посилання на наступний елемент (next).  

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
        stringsLinkedList.printAll();
    }
}
```

```java
public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
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
        stringsLinkedList.printAll();
    }
}
```

```java
public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node lastNode = last.prev;
        Node newNode = new Node();
        newNode.value = value;
        if (first.next != null) {
            newNode.prev = lastNode;
            lastNode.next = newNode;
        } else {
            first.next = newNode;
        }
        last.prev = newNode;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
```
