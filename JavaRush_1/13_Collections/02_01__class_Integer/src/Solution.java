public class Solution {
    public static Integer balance = Integer.MAX_VALUE;

    public static void main(String[] args) {
        String bill = "1234567890";

        System.out.println("Поточний баланс : " + balance);
        processPayment(bill);
        System.out.println("Поточний баланс : " + balance);
    }
                          
    public static void processPayment(String bill) {
        balance -= Integer.parseInt(bill);
    }
}