public class MathUtils {
    public static final double PI = 3.14159265358979323846;

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }

    public static double sum(double[] numbers) {
        double total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total;
    }

    public static double power(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static double squareRoot(double n) {
        double x = n;
        double y = 1;
        double e = 0.000001; // precision
        while (x - y > e) {
            x = (x + y) / 2;
            y = n / x;
        }
        return x;
    }
}