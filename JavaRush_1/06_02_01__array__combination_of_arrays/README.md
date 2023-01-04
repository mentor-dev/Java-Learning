### **The task to solve:**  

Реалізувати метод `main(String[])`, який має скопіювати вміст масивів `firstArray` і `secondArray` в один масив `resultArray`.  
Масив `firstArray` має бути розташований на початку нового масиву `resultArray`, а `secondArray` - після першого.

---

### **Requirements:**  

• У класі Solution має бути публічна статична змінна firstArray типу int[], проініціалізована масивом з 10 значеннями.  
• У класі Solution має бути публічна статична змінна secondArray типу int[], проініціалізована масивом з 10 значеннями.  
• У класі Solution має бути публічна статична змінна resultArray типу int[].  
• Реалізуй метод main(String[]) згідно з умовою.

---

### **Start code:**  

```java
public class Solution {
    
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        //напишіть тут ваш код
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}

```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {

    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        resultArray = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < resultArray.length; i++) {
            if (i < firstArray.length) {
                resultArray[i] = firstArray[i];
            } else {
                resultArray[i] = secondArray[i - firstArray.length];
            }
        }
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}
```
