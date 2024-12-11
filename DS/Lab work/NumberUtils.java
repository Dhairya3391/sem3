public class NumberUtils {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int[] getFactors(int n) {
        int[] factors = new int[n];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[count] = i;
                count++;
            }
        }
        int[] result = new int[count];
        System.arraycopy(factors, 0, result, 0, count);
        return result;
    }

    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}