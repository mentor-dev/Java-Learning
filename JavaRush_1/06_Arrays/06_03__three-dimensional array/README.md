### **The task to solve:**  

У методі `main(String[])` виведи на екран усі числа з тривимірного масиву `multiArray`.

---

### **Requirements:**  

• У класі Solution має бути публічна статична змінна multiArray типу int[][][].  
• У методі main(String[]) виведи на екран усі числа з multiArray.

---

### **Start code:**  

```java
public class Solution {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                for (int k = 0; k < multiArray[i][j].length; k++) {
                    System.out.println(multiArray[i][j][k]);
                }
            }
        }
    }
}
```
