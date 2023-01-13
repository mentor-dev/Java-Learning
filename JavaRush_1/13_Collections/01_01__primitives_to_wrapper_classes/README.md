### **The task to solve:**  

У класі `Solution` є `8` змінних примітивних типів з іменами формату `типValue`.  
Для кожної з цих змінних потрібно створити об'єкти-обгортки та присвоїти їм імена, що мають формат `типValueBox`.  
Для створення об'єктів-обгорток використовуй метод `Тип.valueOf(примітив)`.

Приклад змінної об'єкта-обгортки: `Integer integerValueBox = ....;`

---

### **Requirements:**  

• Клас Solution має містити 8 змінних примітивних типів даних з іменами формату типValue.  
• Клас Solution має містити 8 об'єктів типу клас-обгортка примітивного типу з іменами формату ValueBox.  
• Під час створення об'єктів-обгорток потрібно використовувати наявні змінні примітивних типів і метод Тип.valueOf(примітив).

---

### **Start code:**  

```java
public class Solution {
    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;

    float floatValue;
    double doubleValue;

    char charValue;
    boolean booleanValue;

    //напишіть тут ваш код
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;
    float floatValue;
    double doubleValue;
    char charValue;
    boolean booleanValue;

    Byte byteValueBox = Byte.valueOf(byteValue);
    Short shortValueBox = Short.valueOf(shortValue);
    Integer integerValueBox = Integer.valueOf(intValue);
    Long longValueBox = Long.valueOf(longValue);
    Float floatValueBox = Float.valueOf(floatValue);
    Double doubleValueBox = Double.valueOf(doubleValue);
    Character characterValueBox = Character.valueOf(charValue);
    Boolean booleanValueBox = Boolean.valueOf(booleanValue);    
}
```
