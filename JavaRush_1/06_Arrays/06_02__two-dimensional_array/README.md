### **The task to solve:**  

**Двовимірний масив** - це масив масивів, тобто в кожній його комірці розташоване посилання на якийсь масив. Але значно простіше уявити його у вигляді таблиці з заданою кількістю рядків (перший вимір) і заданою кількістю стовпців (другий вимір). У цій задачі ми створюватимемо такий масив.

Для цього реалізуй метод `main(String[])`, який:

Зчитує з консолі число `N` - кількість рядків масиву. Число має бути більшим за `0`.  
Зчитує `N` чисел із консолі (будь-які числа, більші за `0`).  
Ініціалізує двовимірний масив `multiArray`:  
кількістю рядків `N`;  
рядки - масивами, розмір яких відповідає числам, уведеним у п. 2 (у порядку введення).  

**Приклад:**

Уведено число `5`.  
Уведено числа `1`, `7`, `5`, `9`, `3`.  
Отримуємо такий масив:
```
[]
[][][][][][][]
[][][][][]
[][][][][][][][][]
[][][]
```

---

### **Requirements:**  

• У класі Solution має бути неініціалізована публічна статична змінна multiArray типу int[][].  
• Метод main(Strmg[]) має зчитуватиimport java.util.Scanner;

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        multiArray = new int[num][];
        for (int i = 0; i < num; i++) {
            int num1 = scan.nextInt();
            multiArray[i] = new int[num1];
        }
        scan.close();
    }
} N+1 чисел з клавіатури.  
• У методі main(String[]) ініціалізуй і заповни двовимірний масив згідно з умовою.  

---

### **Start code:**  

```java
import java.util.Scanner;

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
import java.util.Scanner;

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        multiArray = new int[num][];
        for (int i = 0; i < num; i++) {
            int num1 = scan.nextInt();
            multiArray[i] = new int[num1];
        }
        scan.close();
    }
}
```
