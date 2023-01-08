### **The task to solve:**  

Потрібно реалізувати 2 методи, використовуючи `StringBuilder`: `addTo(String, String[])`, `replace(String, String, int, int)`.

1. Метод `addTo(String, String[])` додає до рядка, отриманого як перший параметр, усі рядки за порядком із масиву рядків, отриманого як другий параметр, і повертає об'єкт типу `StringBuilder` на основі цього рядка.  
Щоб додати нове значення до наявного об'єкта типу `StringBuilder`, потрібно викликати його метод `append(String)` і передати в нього це нове значення.  

2. Метод `replace(String, String, int, int)` замінює частину рядка, отриманого як перший параметр, починаючи з індексу, отриманого як третій параметр, і закінчуючи індексом, отриманим як четвертий параметр, на рядок, отриманий як другий параметр, і повертає об'єкт типу `StringBuilder` на основі цього рядка.  
Щоб замінити частину значення об'єкта типу `StringBuilder`, потрібно викликати його метод `replace(int, int, String)` і передати в нього початкову та кінцеву позиції для заміни, а також нове значення.

---

### **Requirements:**  

• Потрібно реалізувати метод addTo(String, String[]) згідно з умовою.  
• Потрібно реалізувати метод replace(String, String, int, int) згідно з умовою.

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        String string = "Навчатися, навчатися і ще раз навчатися! ";

        System.out.println(addTo(string, new String[]{"Під ", "лежачий ", "камінь ", "вода ", "не ", "тече"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        //напишіть тут ваш код
        return null;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        //напишіть тут ваш код
        return null;
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static void main(String[] args) {
        String string = "Навчатися, навчатися і ще раз навчатися! ";

        System.out.println(addTo(string, new String[]{"Під ", "лежачий ", "камінь ", "вода ", "не ", "тече"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        StringBuilder result = new StringBuilder(string);
        for (String elem : strings) {
            result.append(elem);
        }
        
        return result;
    }
    
    public static StringBuilder replace(String string, String str, int start, int end) {
        StringBuilder result = new StringBuilder(string);
        result.replace(start, end, str);

        return result;
    }
}
```
