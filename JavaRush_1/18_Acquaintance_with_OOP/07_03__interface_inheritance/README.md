### **The task to solve:**  

Справжній артист повинен уміти розважати людей. Танці та спів - це складові розваги.  
Перед тобою `3` інтерфейси:  
`Dance` - танцюрист,  
`Sing` - співак,  
`Artist` - артист.

Обміркуй, яка структура успадкування підійде цим інтерфейсам. Успадкуй один інтерфейс від двох інших.

---

### **Requirements:**  

• Один інтерфейс має успадковуватися від двох інших.

---

### **Start code:**  

```java
public interface Artist {
}
```

```java
public interface Dance { 
}
```

```java
public interface Sing {
}
```

---

### **My solution: [Link](./src/)**  

```java
public interface Artist extends Sing, Dance {
}
```

```java
public interface Dance { 
}
```

```java
public interface Sing {
}
```