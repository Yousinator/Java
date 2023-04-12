import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double choice = 0, num1 = 0, num2 = 0;
        String operation;
        Scanner scanf = new Scanner(System.in);
        do {
            System.out.println("Enter two numbers and the operation");
            num1 = scanf.nextDouble();
            operation = scanf.next();
            num2 = scanf.nextDouble();

            switch (operation) {
                case "+":
                    System.out.printf("[%.2f] %s [%.2f] = [%.2f]\n", num1, operation, num2, add(num1, num2));
                    System.out.println("=========================================================================");
                    break;
                case "-":
                    System.out.printf("[%.2f] %s [%.2f] = [%.2f]\n", num1, operation, num2, subtract(num1, num2));
                    System.out.println("=========================================================================");
                    break;
                case "*":
                    System.out.printf("[%.2f] %s [%.2f] = [%.2f]\n", num1, operation, num2, multiply(num1, num2));
                    System.out.println("=========================================================================");
                    break;
                case "/":
                    while (num2 == 0) {
                        System.out.println("Denominator can't be 0. enter another number");
                        num2 = scanf.nextDouble();
                    }
                    System.out.printf("[%.2f] %s [%.2f] = [%.2f]\n", num1, operation, num2, divide(num1, num2));
                    System.out.println("=========================================================================");
                    break;
            }
            System.out.println("Welcome to the calculator! if you want to exit enter (-1)");
            choice = scanf.nextDouble();
        } while (choice != -1);

    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

}
