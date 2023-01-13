### **The task to solve:**  

У класі `Solution` є `8` об'єктів-обгорток примітивних типів з іменами формату `типValueBox`.  
Для кожного з цих об'єктів-обгорток потрібно створити змінні відповідного примітивного типу й присвоїти їм імена формату `типValue`.  
Для створення змінної використовуй метод об'єкта-обгортки `типValueBox.примітивValue()`.  

Приклад змінної примітивного типу: `int intValue = ....;`

---

### **Requirements:**  

• Клас Solution має містити 8 об'єктів типу клас-обгортка примітивного типу з іменами формату типValueBox.  
• Клас Solution має містити 8 змінних примітивних типів даних з іменами формату типValue.  
• Під час створення змінних примітивних типів потрібно використовувати наявні об'єкти-обгортки й метод типValueBox.примітивValue().  

---

### **Start code:**  

```java
public class Solution {
    Byte byteValueBox;
    Short shortValueBox;
    Integer integerValueBox;
    Long longValueBox;

    Float floatValueBox;
    Double doubleValueBox;

    Character characterValueBox;
    Boolean booleanValueBox;

    //напишіть тут ваш код
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    Byte byteValueBox;
    Short shortValueBox;
    Integer integerValueBox;
    Long longValueBox;
    Float floatValueBox;
    Double doubleValueBox;
    Character characterValueBox;
    Boolean booleanValueBox;

    byte byteValue = byteValueBox.byteValue();
    short shortValue = shortValueBox.shortValue();
    int intValue = integerValueBox.intValue();
    long longValue = longValueBox.longValue();
    float floatValue = floatValueBox.floatValue();
    double doubleValue = doubleValueBox.doubleValue();
    char charValue = characterValueBox.charValue();
    boolean booleanValue = booleanValueBox.booleanValue();
}
```
