import java.util.*;

public class Throw_demo {
    public static void main(String args[]) {
        int balance = 5000;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Amount to Withdraw");
        int withdraw = s1.nextInt();
        try {
            if (balance - withdraw < 1000) {
                throw new Exception("Balance must be grater than 1000");
            } else {
                balance = balance - withdraw;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}