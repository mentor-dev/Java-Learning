### **The task to solve:**  

У класі `Solution` оголошено чотири публічних поля, що відповідають чотирьом цілочисловим типам. Під час оголошення ці поля ініціалізуються різними значеннями - цілочисловими літералами.  
Проте програма не компілюється, і це потрібно виправити. Для цього зміни значення полів так, щоб тип змінної відповідав типу цілочислового літерала.  
Можна змінювати тільки знак і тип літерала; змінювати цифри та їх порядок не можна.

---

### **Requirements:**  

• Зміни літерал ініціалізації поля b згідно з умовою.  
• Зміни літерал ініціалізації поля s згідно з умовою.  
• Зміни літерал ініціалізації поля i згідно з умовою.  
• Зміни літерал ініціалізації поля l згідно з умовою.  

---

### **Start code:**  

```java
public class Solution {
    public byte b = 128;
    public short s = 32768;
    public int i = 1_234_567_890L;
    public long l = 2_345_678_900;
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public byte b = -128;
    public short s = -32768;
    public int i = 1_234_567_890;
    public long l = 2_345_678_900L;
}
```
