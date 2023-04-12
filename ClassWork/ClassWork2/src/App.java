import java.util.Scanner;;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanf = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("Please enter your choice\n 1- Factorial   2- Multiplication   3- Prime or not");
            choice = scanf.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please enter a number to get the factorial");
                    int number = scanf.nextInt();
                    System.out.println(number + "! = " + getFactorial(number));
                    System.out.println("*********************************\n");
                    break;
                case 2:
                    System.out.println("Please enter two numbers to multiply them");
                    int number1 = scanf.nextInt(), number2 = scanf.nextInt();
                    System.out.println("The result is: " + getMulti(number1, number2));
                    System.out.println("*********************************\n");
                    break;
                case 3:
                    System.out.println("Please enter a number to find out if prime or not");
                    int prime = scanf.nextInt();
                    System.out.println(prime + " is " + getPrime(prime));
                    System.out.println("*********************************\n");
                    break;
            }
        }

        scanf.close();
    }

    static long getFactorial(int number) {
        long factorial = 1;
        if (number < 0) {
            System.out.printf("numbers should be positive\n");
        }

        for (int i = 1; i <= number; i++) {
            factorial = i * factorial;
        }
        return factorial;
    }

    static int getMulti(int number1, int number2) {
        int multi = 0;
        for (int i = number1; i > 0; i--) {
            multi = multi + number2;
        }
        return multi;
    }

    static String getPrime(int prime) {
        if (prime == 2) {
            return "Prime";
        } else {
            for (int i = 2; i < prime; i++) {
                if (prime % 2 == 0) {
                    return "Not Prime";
                } else {
                    return "Prime";
                }
            }
        }
        return "Error";
    }

    public static void conversions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1- US to JD   2- JD to USD");
        int choice = scanner.nextInt();
        if (choice == 1) {
            float us = scanner.nextFloat();
            if (us >= 0)
                System.out.printf("%.2f USD = %.2f JD", us, (us * 0.71));
            else {
                System.out.println("It is negative");
            }
        } else if (choice == 2) {
            float us = scanner.nextFloat();
            if (us >= 0)
                System.out.printf("%.2f JD = %.2f USD", us, (us / 0.71));
            else {
                System.out.println("It is negative");
            }
        } else {
            System.out.println("It is not included");
        }
        scanner.close();
    }
}