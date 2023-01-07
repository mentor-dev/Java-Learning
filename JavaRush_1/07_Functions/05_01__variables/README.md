### **The task to solve:**  

Метод `printSqrt(int[] array)` має виводити квадратний корінь із кожного елемента масиву, переданого в метод.  
Однак цього не відбувається через конфлікт імен змінних. Виправ імена змінних так, щоб код компілювався.  
У результаті роботи програма має виводити в консоль відповідний рядок для кожного елемента масиву.

**Приклад рядка:**  
`Квадратний корінь із числа 64 дорівнює 8.0`

---

### **Requirements:**  

• Код має компілюватися.  
• Метод printSqrt(int[] array) для кожного елемента масиву має виводити рядок згідно з умовою.

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        int[] array = {15,64,9,51,42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        String elementSqrt = "Квадратний корінь із числа ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double elementSqrt = Math.sqrt(element);
            System.out.println(elementSqrt + element + " дорівнює " + elementSqrt);
        }
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static void main(String[] args) {
        int[] array = {15,64,9,51,42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        String elementSqrtString = "Квадратний корінь із числа ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double elementSqrt = Math.sqrt(element);
            System.out.println(elementSqrtString + element + " дорівнює " + elementSqrt);
        }
    }
}
```
