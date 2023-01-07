### **The task to solve:**  

Перед тобою метод `signIn()`, який вітає користувачів сайту. Зараз він вітає всіх користувачів, а має вітати лише зареєстрованих. Імена всіх незареєстрованих користувачів - "`user`".  
Додай перевірку імені користувача на початку методу `signIn()`.
Якщо ім'я користувача - "`user`", слід перервати виконання методу, використовуючи ключове слово `return`.

---

### **Requirements:**  

• Якщо ім'я користувача - "user", метод signln() має припинити роботу й нічого не виводити в консоль.  
• Якщо ім'я користувача - не "user", метод sіgnІп() має продовжувати роботу й вивести рядки привітання в консоль.  
• Для переривання роботи методу sіgnІп() слід використовувати ключове слово return.

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
    }

    public static void signIn(String username){
        //напишіть тут ваш код
        System.out.println("Ласкаво просимо, " + username);
        System.out.println("Дуже скучили за Вами, " + username);
    }
}
```

---

### **My solution: [Link](./src/Solution.java)**  

```java
public class Solution {
    public static void main(String[] args) {
    }

    public static void signIn(String username){
        if (username.equals("user")) {
            return;
        }
        System.out.println("Ласкаво просимо, " + username);
        System.out.println("Дуже скучили за Вами, " + username);
    }
}
```
