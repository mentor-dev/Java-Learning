public class Solution {

    public static void main(String[] args) {
        int x = 7;      // 7 =  00000111
     // x = x & 25;     // 25 = 00011001
        x = x & 5;      // 5 =  00000101    0101
     // x = x & 3;      // 3 =  00000011
        x = x & 12;     // 12 = 00001100    0100
        x = x | 1;      // 1 =  00000001    0101
        System.out.println(x);
    }
}