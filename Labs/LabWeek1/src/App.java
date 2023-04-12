import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Lab();
    }

    public static void Lab() {
        Scanner scanf = new Scanner(System.in);
        int num1 = scanf.nextInt(), num2 = scanf.nextInt(), num3 = scanf.nextInt(), sum = num1 + num2 + num3;
        double avg = sum / 3;
        System.out.println("The average is: " + avg + "\nThe sum is: " + sum);
    }
}
