public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Хмарочос побудовано.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Хмарочос побудовано. Кількість поверхів - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Хмарочос побудовано. Забудовник - ";

    public Skyscraper() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }

    public Skyscraper(int floors) {
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + floors);
    }

    public Skyscraper(String developer) {
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + developer);
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper(50);
        Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
    }
}