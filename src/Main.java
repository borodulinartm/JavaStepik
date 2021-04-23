import java.util.Scanner;

public class Main extends RuntimeException {
    // Выдаёт, откуда был вызван данный метод
    public static String getCallerClassAndMethodName() {
        if (Thread.currentThread().getStackTrace().length > 3) {
            return Thread.currentThread().getStackTrace()[3].getClassName() + "#" + Thread.currentThread().getStackTrace()[3].getMethodName();
        }
        return null;
    }

    public static double calculate_sqrt(double x) {
        if (x < 0) {
            String error = "Expected non-negative number, got " + x;
            throw new IllegalArgumentException(error);
        }

        return Math.sqrt(x);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()) {
            double x = scanner.nextDouble();
            System.out.println(calculate_sqrt(x));
        }
    }
}
