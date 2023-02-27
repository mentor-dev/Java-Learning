public interface Vehicle {
    default void start() {
        System.out.println("Починаю рух.");
    }

    default void stop() {
        System.out.println("Зупиняюся.");
    }

    void move();
}