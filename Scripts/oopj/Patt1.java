import java.util.*;

public class Patt1 {

    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = s1.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
