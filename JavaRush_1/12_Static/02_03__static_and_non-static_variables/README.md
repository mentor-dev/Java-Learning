### **The task to solve:**  

У методі main створюються `5` роботів і виводиться інформація про них.  
Видали максимально можливу кількість модифікаторів `static` так, щоб функціонал програми не змінився.  
У методі `main` нічого змінювати не потрібно.

---

### **Requirements:**  

• Модифікатори static мають бути правильно розміщені.

---

### **Start code:**  

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println("Презентація роботів, виготовлених компанією " + Robot.vendor);

        Robot robot1 = new Robot("RCV-322", 2019);
        robot1.displayInformation();
                          
        Robot robot2 = new Robot("JavaTron-008", 2017);
        robot2.displayInformation();

        Robot robot3 = new Robot("BugDestroyer-007", 1998);
        robot3.displayInformation();

        Robot robot4 = new Robot("Gundam-14", 2004);
        robot4.displayInformation();

        Robot robot5 = new Robot("Eve-2", 2012);
        robot5.displayInformation();
    }
}
```

```java
public class Robot {

    public static int robotCounter;
    public static int id;
    public static String model;
    public static int productionYear;
    public static String vendor = "Javarush Co.";

    public Robot(String model, int productionYear) {
        this.model = model;
        this.productionYear = productionYear;
        this.id = ++robotCounter;
    }

    public void displayInformation() {
        System.out.printf("Я %d-й із %d роботів. Модель: %s. Виготовлений компанією %s у %d році.\n",
                 id, robotCounter, model, vendor, productionYear);
    }
}
```

---

### **My solution: [Link](./src/)**  

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println("Презентація роботів, виготовлених компанією " + Robot.vendor);

        Robot robot1 = new Robot("RCV-322", 2019);
        robot1.displayInformation();
                          
        Robot robot2 = new Robot("JavaTron-008", 2017);
        robot2.displayInformation();

        Robot robot3 = new Robot("BugDestroyer-007", 1998);
        robot3.displayInformation();

        Robot robot4 = new Robot("Gundam-14", 2004);
        robot4.displayInformation();

        Robot robot5 = new Robot("Eve-2", 2012);
        robot5.displayInformation();
    }
}
```

```java
public class Robot {

    public static int robotCounter;
    public int id;
    public String model;
    public int productionYear;
    public static String vendor = "Javarush Co.";

    public Robot(String model, int productionYear) {
        this.model = model;
        this.productionYear = productionYear;
        this.id = ++robotCounter;
    }

    public void displayInformation() {
        System.out.printf("Я %d-й із %d роботів. Модель: %s. Виготовлений компанією %s у %d році.\n",
                 id, robotCounter, model, vendor, productionYear);
    }
}
```
