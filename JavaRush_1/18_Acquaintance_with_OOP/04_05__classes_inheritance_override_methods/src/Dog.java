public class Dog extends Pet {
    public static final String DOG = "Я люблю людей.";

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(DOG);
    }
}