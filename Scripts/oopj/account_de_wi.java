import java.util.*;

class account {
    double amount, total_amount, withdraw_amount, deposite_amount, balance;

    account() {
        total_amount = 1000;
    }

    account(account b) {
        this.total_amount = total_amount;
        this.withdraw_amount = withdraw_amount;
        this.deposite_amount = deposite_amount;
    }

    void deposite_atm() {
        total_amount = total_amount + deposite_amount;
        System.out.println("the total amount are" + total_amount);
    }

    void withdraw_atm() {
        System.out.println("the total amount are" + total_amount);

        try {
            total_amount = total_amount - withdraw_amount;

            if (total_amount < 1000) {
                throw new Exception();
            }

            else {
                System.out.println("the after the withdraw_amount:-" + total_amount);
            }
        }

        catch (Exception e) {
            System.out.println("the exception are genrated" + total_amount);
            System.exit(0);
        }
    }

    void get_amount() {
        System.out.println("the total_amount are:" + total_amount);
    }

}

public class account_de_wi {
    public static void main(String[] args) {
        account a1 = new account();
        account b1 = new account(a1);
        Scanner sc = new Scanner(System.in);
        double deposite_amount = 0;
        double total_amount = 0, withdraw_amount, balance;

        while (true) {

            System.out.println("1]deposite \n 2]withdraw \n 3]exit");

            System.out.println("enter the choice");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("enter the deposite_amount:");
                    b1.deposite_amount = sc.nextDouble();
                    b1.deposite_atm();
                    break;
                }

                case 2: {
                    System.out.println("enter the withdraw_atm:");
                    b1.withdraw_amount = sc.nextDouble();
                    b1.withdraw_atm();
                    break;
                }

                case 3: {
                    System.exit(0);
                }

                default: {
                    System.out.println("invaild choice");
                }
            }
        }
    }
}