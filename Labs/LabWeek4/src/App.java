import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanf = new Scanner(System.in);
        led(scanf);
    }

    public static void prints() {
        double sum = 2;
        for (int i = 0; i < 10; i++) {
            System.out.println(sum);
            sum = sum * 2;
        }
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static void max(double num1, double num2) {
        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num1);
        }
    }

    public static void reverse(Scanner scanf) {
        int number = scanf.nextInt(), remainder;
        while (number != 0) {
            remainder = number % 10;
            number /= 10;
            System.out.printf("%d", remainder);
        }

    }

    public static void fibo(Scanner scanf) {

        int userInput = scanf.nextInt();
        int[] fibo = new int[userInput];
        for (int i = 0; i < fibo.length; i++) {
            if (i < 2) {
                fibo[i] = i;
            } else {
                fibo[i] = fibo[i - 1] + fibo[i - 2];
            }
        }
        for (int i = 0; i < fibo.length; i++) {
            System.out.println(fibo[i]);
        }
    }

    public static void rectangle(double width, double length) {
        System.out.println("The area is: " + width * length);
    }

    public static void led(Scanner scanf) {
        int number = scanf.nextInt(), remainder, sum = 0;
        while (number != 0) {
            remainder = number % 10;
            number /= 10;
            if (remainder == 1) {
                sum += 2;
            } else if (remainder == 2 || remainder == 3 || remainder == 5) {
                sum += 5;
            } else if (remainder == 4) {
                sum += 4;
            } else if (remainder == 6 || remainder == 9 || remainder == 0) {
                sum += 6;
            } else if (remainder == 7) {
                sum += 3;
            } else if (remainder == 8) {
                sum += 7;
            }
        }
        System.out.println(sum + " LEDS");
    }
}
