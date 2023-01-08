### **The task to solve:**  

Виведи на екран цей текст у два рядки:  
```
It's a Windows path: "C:\Program Files\Java\jdk-13.0.0\bin"
```
```
It's a Java string: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"
```

**Підказка:**  
`\”` — екранування подвійних лапок;  
`\\` — екранування оберненої скісної риски (`\`).

Детально про екранування символів та Escape-послідовності в мові Java читай у статті "Екранування символів у Java".

---

### **Requirements:**  

• Програма має виводити текст.  
• Текст має бути виведено у два рядки.  
• Текст першого рядка має бути таким: It's a Windows path: "C:\Program Files\Java\jdk-13.0.0\bin"  
• Текст другого рядка має бути таким: It's a Java string: \\"C:\\\Program Files\\\Java\\\jdk-13.0.0\\\bin\\"

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

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println("It's a Windows path: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"");
        System.out.println("It's a Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk-13.0.0\\\\bin\\\"");
        
    }
}
```
