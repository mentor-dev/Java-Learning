### **The task to solve:**  

У класі `Solution` є метод `getShapeNameByCountOfCorners(int)`, який повертає назву багатокутника залежно від кількості кутів.  
Твоє завдання - переписати метод, використовуючи тільки оператор `switch`.

---

### **Requirements:**  

• Результат роботи методу getShapeNameByCountOfCorners(int) має залишитися незміннім.  
• У методі getShapeNameByCountOfCorners має використовуватися тільки оператор switch.

---

### **Start code:**  

```java
public class Solution {

    public static void main(String[] args) {
        System.out.println(getShapeNameByCountOfCorners(3));
        System.out.println(getShapeNameByCountOfCorners(5));
        System.out.println(getShapeNameByCountOfCorners(1));
    }

    public static String getShapeNameByCountOfCorners(int countOfCorner) {
        String shape;
        if (countOfCorner == 3) {
            shape = "Трикутник";
        } else if (countOfCorner == 4) {
            shape = "Чотирикутник";
        } else if (countOfCorner == 5) {
            shape = "П'ятикутник";
        } else if (countOfCorner == 6) {
            shape = "Шестикутник";
        } else if (countOfCorner == 7) {
            shape = "Семикутник";
        } else if (countOfCorner == 8) {
            shape = "Восьмикутник";
        } else {
            shape = "Інша фігура";
        }
        return shape;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {

    public static void main(String[] args) {
        System.out.println(getShapeNameByCountOfCorners(3));
        System.out.println(getShapeNameByCountOfCorners(5));
        System.out.println(getShapeNameByCountOfCorners(1));
    }

    public static String getShapeNameByCountOfCorners(int countOfCorner) {
        String shape;
        switch (countOfCorner) {
            case 3:
                shape = "Трикутник";
                break;
            case 4:
                shape = "Чотирикутник";
                break;
            case 5:
                shape = "П'ятикутник";
                break;
            case 6:
                shape = "Шестикутник";
                break;
            case 7:
                shape = "Семикутник";
                break;
            case 8:
                shape = "Восьмикутник";
                break;
            default:
                shape = "Інша фігура";
        }
        return shape;
    }
}
```
