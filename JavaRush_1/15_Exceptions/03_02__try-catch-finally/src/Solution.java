public class Solution {

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat(new Food("м'ясо"));
        lion.eat(null);
    }
}