import java.util.ArrayList;

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвінно");
        waitingEmployees.add("Гунігерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Ніфрод");
        waitingEmployees.add("Альбіуф");
        waitingEmployees.add("Іногрім");
        waitingEmployees.add("Фріле");
    }

    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {
        if (name == null)
            return;
        
        if (waitingEmployees.contains(name)) {
            alreadyGotSalaryEmployees.add(name);
            int pos = waitingEmployees.indexOf(name);
            waitingEmployees.set(pos, null);
        }
    }
}