public class Solution {
    public static void main(String[] args) {

    }

    public static void signIn(String username){
        if (username.equals("user")) {
            return;
        }
        System.out.println("Ласкаво просимо, " + username);
        System.out.println("Дуже скучили за Вами, " + username);
    }
}