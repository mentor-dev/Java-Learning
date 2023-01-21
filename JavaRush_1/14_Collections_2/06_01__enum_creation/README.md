### **The task to solve:**  

Потрібно створити набір значень (`enum`) для пір року. Для цього слід в окремому файлі створити `enum Season` і оголосити в ньому `4` значення.  
У методі `Solution` виведи на екран усі елементи переліку з нового рядка.

---

### **Requirements:**  

• Створи в окремому файлі публічний перелік enum Season і додай значення: WINTER, SPRING, SUMMER, AUTUMN.  
• У класі Solution виведи в консоль кожну пору року з нового рядка. Використовуй елементи переліку безпосередньо: наприклад, Season.WINTER.  

---

### **Start code:**  

```java
public class Solution {

    public static void main(String[] args) {
        //напишіть тут ваш код
    }
}
```

---

### **My solution: [Link](./src/)**  

```java
public class Solution {

    public static void main(String[] args) {
        System.out.println(Season.WINTER);
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
    }
}
```

```java
public enum Season {
    WINTER, 
    SPRING, 
    SUMMER, 
    AUTUMN
}
```
