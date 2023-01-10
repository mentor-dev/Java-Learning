### **The task to solve:**  

В алгоритмі роботи готельного ліфта прописано: щоб піднятися з третього поверху на шостий, потрібно проїхати до четвертого, потім - до п'ятого, ну, і нарешті до шостого.  
Але в нашій програмі всі поверхи переплуталися! Тому наразі клас `Hotel` не компілюється. Розстав поля класу в такому порядку, щоб клас компілювався й ліфт їхав правильно.

---

### **Requirements:**  

• Не можна видаляти поля з класу Hotel, змінювати їх або додавати нові.  
• Порядок полів класу Hotel має бути правильним.

---

### **Start code:**  

```java
public class Hotel {
    public int fourthFloor = thirdFloor + 1;
    public int sixthFloor = fifthFloor + 1;
    public int thirdFloor = 3;
    public int fifthFloor = fourthFloor + 1;
}
```

---

### **My solution: [Link](./src/Hotel.java)**  

```java
public class Hotel {
    public int thirdFloor = 3;
    public int fourthFloor = thirdFloor + 1;
    public int fifthFloor = fourthFloor + 1;
    public int sixthFloor = fifthFloor + 1;
}
```
