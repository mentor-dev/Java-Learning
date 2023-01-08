### **The task to solve:**  

Реалізуй метод `changePath(String, String)` так, щоб він заміняв версію jdk у шляху, отриманому як перший параметр методу, на версію, отриману як другий параметр, і повертав новий шлях.  
Версія jdk починається з рядка "`jdk`" і закінчується символом "`/`".

**Приклад:**  
шлях - "/usr/java/jdk1.8/bin"  
версія jdk - "jdk-13"

Метод `changePath`(шлях, версія jdk) має повернути шлях - "/usr/java/jdk-13/bin".  
Метод `main()` у тестуванні не використовується.

---

### **Requirements:**  

• Потрібно реалізувати метод changePath(String, String) згідно з умовою.

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin";
        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        //напишіть тут ваш код
        return null;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin";
        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int indexStart = path.indexOf("jdk");
        int indexEnd = path.indexOf("/", indexStart);
        return path.substring(0, indexStart) + jdk +
                path.substring(indexEnd);
    }
}
```
