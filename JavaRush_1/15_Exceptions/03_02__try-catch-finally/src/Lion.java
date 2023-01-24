public class Lion {

    public void eat(Food food) {
        try {
            System.out.println();
            System.out.println("шукає їжу");
            System.out.println("знайшов " + food.name);
            System.out.println("усе з'їв");
        } catch (NullPointerException e) {
            System.out.println("нічого не знайшов");
            return;
        } finally {
            System.out.println("ліг спати" + (food == null ? " голодним" : ""));
        }
    }
}