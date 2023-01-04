### **The task to solve:**  

Створи трикутний масив, де значення кожного елемента - це сума його індексів.  

Наприклад:  
```
array[7][3] = 7 + 3 = 10,  
array[3][0] = 3 + 0 = 3.
```

Виведи масив на екран у такому вигляді:
```
0
1 2
2 3 4
3 4 5 6
4 5 6 7 8
5 6 7 8 9 10
...
```

Числа в рядках розділені пробілами.

Створити трикутний масив можна в такий спосіб:
```
int[][] array = new int[10][];
array[0] = new int[1];
array[1] = new int[2];
array[2] = new int[3];
...
```

---

### **Requirements:**  

• У методі main(String[]) двовимірний масив result заповни числами згідно з умовою.  
• Виведений текст має містити 10 рядків.  
• Виведені числа мають відповідати умові.

---

### **Start code:**  

```java
public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                result[i][j] = i + j;
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(result[i][j]);
                if (j != i) {
                    System.out.print(" ");
                }
            }
            if (i < result.length - 1) {
                System.out.println();
            }
        }
    }
}
```
