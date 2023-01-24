### **The task to solve:**  

Об'єднай блоки `catch` з однаковим кодом.

---

### **Requirements:**  

• Кількість блоків catch має бути мінімальною.

---

### **Start code:**  

```java
public class Solution {

    public static void main(String[] args) {
        try {
            System.out.println("Програма працює від паркану");
            Thread.sleep(1000);
            System.out.println("до обіду");
        } catch (NullPointerException e) {
            System.out.println("Стався виняток на літеру N");
        } catch (NumberFormatException e) {
            System.out.println("Стався виняток на літеру N");
        } catch (IllegalArgumentException e) {
            System.out.println("Стався виняток на літеру I");
        } catch (IllegalStateException e) {
            System.out.println("Стався виняток на літеру I");
        } catch (ClassCastException e) {
            System.out.println("Стався виняток на літеру C");
        } catch (InterruptedException e) {
            System.out.println("Стався виняток на літеру I");
        }
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {

    public static void main(String[] args) {
        try {
            System.out.println("Програма працює від паркану");
            Thread.sleep(1000);
            System.out.println("до обіду");
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Стався виняток на літеру N");
        } catch (IllegalArgumentException | IllegalStateException | InterruptedException e) {
            System.out.println("Стався виняток на літеру I");
        } catch (ClassCastException e) {
            System.out.println("Стався виняток на літеру C");
        }
    }
}
```
