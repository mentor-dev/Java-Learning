import java.util.HashMap;

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Brad Pitt", 4.45);
        grades.put("Angelina Jolie", 4.21);
        grades.put("Sandra Bullock", 4.1);
        grades.put("Bruce Willis", 3.84);
        grades.put("Natalie Portman", 4.92);
    }
}