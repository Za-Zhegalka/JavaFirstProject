import java.util.Scanner;
public class Function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите значение b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите значение c: ");

        double c = scanner.nextDouble();

        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        double y = calculateFunction(a, b, c, x);

        System.out.println("Значение функции y = " + y);
    }
    private static double calculateFunction(double a, double b, double c, double x) {
        double numerator = a * x + 3.8 * Math.tan(x);
        double denominator = Math.sqrt(c * Math.pow(x, 3) + b);

        if (denominator == 0) {
            System.out.println("Ошибка: Знаменатель равен нулю.");
            System.exit(1); // Выход из программы с кодом ошибки
    }
        return numerator / denominator;
    }
}
