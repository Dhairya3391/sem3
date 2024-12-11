import java.util.*;

public class Deletearr {
    public static void main(String args[]) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Length");
        int len = s1.nextInt();
        System.out.println("Enter Location");
        int loc = s1.nextInt();
        int[] a = new int[len];

        for (int i = 0; i < len; i++) {
            a[i] = s1.nextInt();
        }
        for (int i = loc; i < len; i++) {
            a[i - 1] = a[i];
        }
        for (int i = 0; i < len - 1; i++) {
            System.out.println("Value for" + i + "index" + a[i]);
        }

    }
}
