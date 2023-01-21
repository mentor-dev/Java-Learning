public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }                      

    public static Month getNextMonth(Month month) {
        if (month.ordinal() == Month.values().length - 1) {
            return Month.values()[0];
        } else {
            return Month.values()[month.ordinal() + 1];
        }
    }
}