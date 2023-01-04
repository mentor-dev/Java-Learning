### **The task to solve:**  

Проініціалізуй масив `MULTIPLICATION_TABLE` значенням `new int[10][10]`, заповни його таблицею множення й виведи в консоль у такому вигляді:
```
1 2 3 4 …
2 4 6 8 …
3 6 9 12 …
4 8 12 16 …
…
```
Числа в рядках розділено пробілами.

---

### **Requirements:**  

• У методі main масив MULTIPLICATION_TABLE має бути заповнений таблицею множення.  
• Виведений текст має містити 10 рядків.  
• Кожен виведений рядок має містити 10 чисел, розділених пробілами.  
• Виведені числа мають бути таблицею множення.

---

### **Start code:**  

```java
public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                MULTIPLICATION_TABLE[i][j] = (i + 1) * (j + 1);
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            }
            if (i != 9) {
                System.out.println();                
            }
        }
    }
}
```
