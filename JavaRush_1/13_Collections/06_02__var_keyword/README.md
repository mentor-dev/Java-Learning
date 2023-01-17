### **The task to solve:**  

У класі `Solution` є поле `intArray`, гетер і сетер для нього, і метод `main` з оголошеними в ньому змінними. Тобі потрібно замінити тип змінних `var` на конкретний тип об'єкта (змінювати назви та ініціалізацію об'єктів не можна), а також полагодити гетер і сетер поля `intArray`.

**Приклад:**  
`var console = new Scanner(System.in);`  
замінити на:  
`Scanner console = new Scanner(System.in);`

---

### **Requirements:**  

• Заміни тип змінних var на конкретний тип об'єкта.  
• Полагодь гетер і сетер для поля intArray.

---

### **Start code:**  

```java
public class Solution {
    private var intArray = new int[4];

    public var getIntArray() {
        return intArray;
    }

    public void setIntArray(var intArray) {
        this.intArray = intArray;
    }

    public static void main(String[] args) {
        var solution = new Solution();
        var string = new String("Hello");
        var stringBuilder = new StringBuilder();
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    private int[] intArray = new int[4];

    public int[] getIntArray() {
        return intArray;
    }

    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String string = new String("Hello");
        StringBuilder stringBuilder = new StringBuilder();
    }
}
```
