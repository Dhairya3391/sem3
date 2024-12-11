import java.util.*;

class evalute {
    public static int topo(String a) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (Character.isDigit(c)) {
                s.push(c - '0');

            } else {
                int val1 = s.pop();
                int val2 = s.pop();
                switch (c) {
                    case '+':
                        s.push(val2 + val1);
                        break;

                    case '-':
                        s.push(val2 - val1);
                        break;

                    case '*':
                        s.push(val2 * val1);
                        break;

                    case '/':
                        s.push(val2 / val1);
                        break;

                }

            }
        }
        return s.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        String a = sc.nextLine();
        System.out.println(topo(a));

    }
}