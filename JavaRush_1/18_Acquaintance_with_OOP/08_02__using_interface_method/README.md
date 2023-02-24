### **The task to solve:**  

У містечку Вілларібо є струнний оркестр, а в містечку Віллабаджо - клавішний.  
Одного разу візки з музикантами із двох містечок зіткнулися на перехресті, і все змішалося в купу.  
Допоможи артистам розібрати свої інструменти. І, звичайно, після цього обидва оркестри мають дати концерт.

Для цього:
- у методі `createKeyboardOrchestra()` додай до списку `orchestra` один орган і три піаніно;
- у методі `createStringedOrchestra()` додай до списку `orchestra` дві скрипки й одну гітару;
- метод `playOrchestra()` має викликати метод `play()` для всіх елементів списку `orchestra`.

---

### **Requirements:**  

• Метод createKeyboardOrchestra() має додавати до списку orchestra один об'єкт класу Organ і три об'єкти класу Piano.  
• Метод createStringedOrchestra() має додавати до списку orchestra два об'єкти класу Violin і один об'єкт класу Guitar.  
• Метод playOrchestra() має викликати метод play() для всіх елементів списку orchestra.

---

### **Start code:**  

```java
import java.util.ArrayList;
import java.util.List;

public class Solution {
    static List<MusicalInstrument> orchestra = new ArrayList<>();

    public static void main(String[] args) {
        createKeyboardOrchestra();
        createStringedOrchestra();
        playOrchestra();
    }

    public static void createKeyboardOrchestra() {
        //напишіть тут ваш код
    }

    public static void createStringedOrchestra() {
        //напишіть тут ваш код
    }

    public static void playOrchestra() {
        //напишіть тут ваш код
    }
}
```

```java
public interface MusicalInstrument {
    void play();
}
```

```java
public class Guitar implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Грає гітара.");
    }
}
```

```java
public class Organ implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Грає орган.");
    }
}
```

```java
public class Piano implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Грає піаніно.");
    }
}
```

```java
public class Violin implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Грає скрипка.");
    }
}
```

---

### **My solution: [Link](./src/)**  

```java
import java.util.ArrayList;
import java.util.List;

public class Solution {
    static List<MusicalInstrument> orchestra = new ArrayList<>();

    public static void main(String[] args) {
        createKeyboardOrchestra();
        createStringedOrchestra();
        playOrchestra();
    }

    public static void createKeyboardOrchestra() {
        orchestra.add(new Organ());
        orchestra.add(new Piano());
        orchestra.add(new Piano());
        orchestra.add(new Piano());
    }

    public static void createStringedOrchestra() {
        orchestra.add(new Violin());
        orchestra.add(new Violin());
        orchestra.add(new Guitar());        
    }

    public static void playOrchestra() {
        for (MusicalInstrument instrument : orchestra) {
            instrument.play();
        }
    }
}
```

```java
public interface MusicalInstrument {
    void play();
}
```

```java
public class Guitar implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Грає гітара.");
    }
}
```

```java
public class Organ implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Грає орган.");
    }
}
```

```java
public class Piano implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Грає піаніно.");
    }
}
```

```java
public class Violin implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Грає скрипка.");
    }
}
```