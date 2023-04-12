import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanf = new Scanner(System.in);

        // reverse(scanf); //? Reverse an entered number

        // evens(scanf); //? Only takes even numbers to store them into an array

        // fact(scanf); //? Stores the factorial of the index index in its position

        // fibo(scanf); //? Fibo

        scanf.close();
    }

    public static void reverse(Scanner scanf) {
        int number = scanf.nextInt(), remainder;
        while (number != 0) {
            remainder = number % 10;
            number /= 10;
            System.out.printf("%d", remainder);
        }

    }

    public static void evens(Scanner scanf) {

        int[] evens = new int[5];
        int userInput;

        for (int i = 0; i < evens.length; i++) {
            userInput = scanf.nextInt();
            while (userInput % 2 != 0) {
                userInput = scanf.nextInt();
            }
            evens[i] = userInput;
        }
        for (int i = 0; i < evens.length; i++) {
            System.out.println(evens[i]);
        }
    }

    public static void fact(Scanner scanf) {
        int[] factorial = new int[6];

        for (int i = 0; i < factorial.length; i++) {
            int factoriala = 1;
            for (int j = 1; j <= i; j++) {
                factoriala = j * factoriala;
            }
            factorial[i] = factoriala;
        }
        for (int i = 0; i < factorial.length; i++) {
            System.out.println(factorial[i]);
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
}
