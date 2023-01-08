### **The task to solve:**  

У класі `Solution` у методі `countDown()` ведеться зворотний відлік. Ти маєш зробити так, щоб рядки тексту виводилися в консоль з інтервалом `1` секунда. У цьому тобі допоможе метод `sleep(long)` класу `Thread`.

---

### **Requirements:**  

• Реалізуй метод countDown() згідно з умовою.

---

### **Start code:**  

```java
public class Solution {

    public static void main(String[] args) throws InterruptedException {
        countDown();
    }
    public static void countDown() throws InterruptedException {
        System.out.println("3");
        System.out.println("2");
        System.out.println("1");
        System.out.println("Старт!");
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {

    public static void main(String[] args) throws InterruptedException {
        countDown();
    }
    public static void countDown() throws InterruptedException {
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("Старт!");
    }
}
```
