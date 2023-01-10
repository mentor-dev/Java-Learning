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