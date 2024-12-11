
//Bank Account
import java.util.*;

class Account1 {
    double balance, tamount, damount, wamount, amount;

    Account1() {
        tamount = 1000;
    }

    Account1(Account1 b) {
        this.tamount = b.tamount;
        this.damount = b.damount;
        this.wamount = wamount;
    }

    void depositeAMT() {
        tamount = tamount + damount;
        System.out.println("Total Balance :: " + tamount);
    }

    void WithdrawAMT() {
        System.out.println("Total Balance :: " + tamount);
        try {
            tamount = tamount - wamount;
            if (tamount < 1000) {
                throw new Exception();
            } else {
                System.out.println("Total Balance After Withdraw :: " + tamount);
            }
        } catch (Exception e) {
            System.out.println("InSufficientFundException :: 1000 Rs Must Be there in Account");
        }
    }

    void totalBal() {
        System.out.println("Total Balance :: " + tamount);
    }
}

class BankAccountDemod2d {
    public static void main(String[] args) {
        double damount = 0;
        Scanner sc = new Scanner(System.in);
        Account1 b = new Account1();
        Account1 b1 = new Account1(b);

        double balance, wamount, tamount = 0;
        while (true) {
            System.out.println("");
            System.out.print("1) Deposit Amount \n2) Withdraw Amount \n3) Exit ");
            System.out.println("");
            System.out.println("Enter Your Choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.print("Enter Amount To Deposit :: ");
                    b1.damount = sc.nextDouble();
                    b1.depositeAMT();
                    break;
                }
                case 2: {
                    System.out.print("Enter Amount to Withdraw :: ");
                    b1.wamount = sc.nextDouble();
                    b1.WithdrawAMT();
                    break;
                }
                case 3: {
                    System.exit(0);
                }
                default:
                    System.out.println("Invalid Choice...");
            }
        }
    }
}