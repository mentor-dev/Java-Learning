### **The task to solve:**  

Ця програма має виводити інформацію про створений масив. Але через неправильно розставлені модифікатори `static` вона не компілюється.  
Виправ ці помилки. Додай модифікатор `static` там, де це потрібно.

---

### **Requirements:**  

• Код має компілюватися.  
• Потрібно змінити мінімальну необхідну кількість модифікаторів доступу в класі Solution.

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        int[] array = {123, 7, -14, 67, 16, 98, 75, 576};
        System.out.println("У масиві : ");
        printArray(array);
        System.out.println("Мінімальне число : " + getMinValue(array));
        System.out.println("Максимальне число : " + getMaxValue(array));
    }

    public int getMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int getMinValue(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static void main(String[] args) {
        int[] array = {123, 7, -14, 67, 16, 98, 75, 576};
        System.out.println("У масиві : ");
        printArray(array);
        System.out.println("Мінімальне число : " + getMinValue(array));
        System.out.println("Максимальне число : " + getMaxValue(array));
    }

    public static int getMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int getMinValue(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
```
