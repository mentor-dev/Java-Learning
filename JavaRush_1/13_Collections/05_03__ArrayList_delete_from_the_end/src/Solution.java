import java.util.ArrayList;

public class Solution {

    private static ArrayList<String> initList() {
        String glassTop     = "       ๐ท       ";
        String glassSecond  = "      ๐ท๐ท      ";
        String glassThird   = "     ๐ท๐ท๐ท     ";
        String glassFourth  = "    ๐ท๐ท๐ท๐ท    ";
        String glassFifth   = "   ๐ท๐ท๐ท๐ท๐ท   ";
        String glassSixth   = "  ๐ท๐ท๐ท๐ท๐ท๐ท  ";
        String glassSeventh = " ๐ท๐ท๐ท๐ท๐ท๐ท๐ท ";
        String glassEighth  = "๐ท๐ท๐ท๐ท๐ท๐ท๐ท๐ท";
        ArrayList<String> list = new ArrayList<>();
        list.add(glassEighth);
        list.add(glassSeventh);
        list.add(glassSixth);
        list.add(glassFifth);
        list.add(glassFourth);
        list.add(glassThird);
        list.add(glassSecond);
        list.add(glassTop);
        return list;
    }

    public static void print(ArrayList<String> glasses) {
        for(int i = glasses.size() - 1; i >= 0; i--) {
            System.out.println(glasses.get(i));
        }
    }

    public static void removeGlassesReverse(ArrayList<String> glasses) {
        System.out.println("ะะพัะธะฝะฐัะผะพ ัะพะทะฑะธัะฐัะธ ะฟััะฐะผัะดั...");

        for (int i = glasses.size() - 1; i >= 0; i--) {
            glasses.remove(i);
        }

        if(glasses.size() == 0) {
            System.out.println("ะััะฐะผัะดั ัะพะทัะฑัะฐะฝะพ!");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> glasses = initList();
        print(glasses);

        removeGlassesReverse(glasses);
        print(glasses);
    }
}