public class Solution {
    public static void main(String[] args) {
        System.out.println(ninthDegree(3));
    }

    public static long cube(long a){
        return a*a*a;   
    }

    public static long ninthDegree(long num) {
        return cube(cube(num));
    }
}