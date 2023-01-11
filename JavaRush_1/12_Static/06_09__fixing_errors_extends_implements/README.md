### **The task to solve:**  

Потрібно правильно розмістити ключові слова `extends` і `implements` у наявних класах, щоб програма компілювалася.

---

### **Requirements:**  

• Інтерфейс SmartFunctions має компілюватися.  
• Клас SmartPhone має компілюватися.  
• Клас Jphone має компілюватися.  
• Клас Gnusmas має компілюватися.

---

### **Start code:**  

```java
public class SmartPhone extends SmartFunctions {
}
```

```java
public class Gnusmas implements SmartPhone {
}
```

```java
public class Jphone implements SmartPhone {
}
```

```java
public interface BasicFunctions {
}
```

```java
public interface SmartFunctions implements BasicFunctions {
}
```

---

### **My solution: [Link](./src/)**  

```java
public class SmartPhone implements SmartFunctions {
}
```

```java
public class Gnusmas extends SmartPhone {
}
```

```java
public class Jphone extends SmartPhone {
}
```

```java
public interface BasicFunctions {
}
```

```java
public interface SmartFunctions extends BasicFunctions {
}
```
