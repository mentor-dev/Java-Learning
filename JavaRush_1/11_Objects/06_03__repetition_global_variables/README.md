### **The task to solve:**  

Тебе відправили до крамниці й сказали, що треба купити батон, а якщо будуть яйця, то взяти десять штук.  
Розберися, чому метод `makePurchases` незалежно від переданих аргументів завжди виводить у консоль "`Куплено 10 батонів`", і виправ його.  
Метод `main` у перевірці не використовується.

---

### **Requirements:**  

• Не можна змінювати поле hasEggs класу Market.  
• Клас Market має містити публічний статичний метод makePurchases(boolean) з типом повернення void.  
• Якщо метод makePurchases(boolean) викликається з аргументом false, то він має вивести в консоль текст: "Куплено 1 батон".  
• Якщо метод makePurchases(boolean) викликається з аргументом true, то він має вивести в консоль текст: "Куплено 10 батонів".

---

### **Start code:**  

```java
public class Market {
    private static boolean hasEggs = true;

    public static void main(String[] args) {
        boolean hasEggs = false;
        makePurchases(hasEggs);
    }

    public static void makePurchases(boolean hasEggs) {
        if (Market.hasEggs) {
            System.out.println("Куплено 10 батонів");
        } else {
            System.out.println("Куплено 1 батон");
        }
    }
}
```

---

### **My solution: [Link](./src/Market.java)**  

```java
public class Market {
    private static boolean hasEggs = true;

    public static void main(String[] args) {
        boolean hasEggs = false;
        makePurchases(hasEggs);
    }

    public static void makePurchases(boolean hasEggs) {
        if (hasEggs) {
            System.out.println("Куплено 10 батонів");
        } else {
            System.out.println("Куплено 1 батон");
        }
    }
}
```
