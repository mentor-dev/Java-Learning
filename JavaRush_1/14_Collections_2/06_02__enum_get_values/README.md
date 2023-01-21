### **The task to solve:**  

В `enum JavarushQuest` зберігається список квестів. Твоє завдання - отримати масив усіх елементів у методі `main` (скористайся методом `values()`) і вивести порядковий номер кожного елемента (скористайся методом `ordinal()`) з нового рядка.

---

### **Requirements:**  

• У методі main отримай список усіх констант із переліку enum JavarushQuest за допомогою методу values().  
• У методі main виведи порядковий номер кожного елемента з нового рядка за допомогою методу ordinal().

---

### **Start code:**  

```java
public class Solution {

    public static void main(String[] args) {
        //напишіть тут ваш код
    }
}
```

```java
public enum JavarushQuest {
    JAVA_SYNTAX,
    JAVA_CORE,
    JAVA_MULTITHREADING,
    JAVA_COLLECTIONS,
    CS_50,
    ANDROID,
    GAMES
}
```

---

### **My solution: [Link](./src/)**  

```java
public class Solution {

    public static void main(String[] args) {
        JavarushQuest[] arr = JavarushQuest.values();
        for (JavarushQuest i : arr) {
            System.out.println(i.ordinal());
        }
    }
}
```

```java
public enum JavarushQuest {
    JAVA_SYNTAX,
    JAVA_CORE,
    JAVA_MULTITHREADING,
    JAVA_COLLECTIONS,
    CS_50,
    ANDROID,
    GAMES
}
```
