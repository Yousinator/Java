public class factorial {
    int number;

    factorial(int number) {
        this.number = number;
    }

    int getFactorial(int number) {
        int factorial = 1;
        if (number < 0) {
            System.out.printf("numbers should be positive\n");
        }

        for (int i = 1; i <= number; i++) {
            factorial = i * factorial;
        }
        return factorial;
    }
}
