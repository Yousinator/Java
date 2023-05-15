import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome Choose the Algorithm\n 1. Basic Algorithm\t 2. Enhanced Algorithm\t 3. Palindrome");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("******************************** Basic Algorithm ********************************");
                basicAlgorithm(sc);
                break;
            case 2:
                System.out.println(
                        "******************************** Enhanced Algorithm ********************************");
                enhancedAlgorithm(sc);
                break;
            case 3:
                System.out.println("******************************** Palindrome ********************************");
                palindrome(sc);
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }

        sc.close();
        return;

    }

    public static void basicAlgorithm(Scanner sc) {

        System.out.println("Enter array size"); // ? 1 > We take input from the user for array size.
        int size = sc.nextInt(), max = 0, secondMax = 0;
        int[] arr = new int[size];

        System.out.println("Enter array elements");
        for (int i = 0; i < arr.length; i++) { // ? 2 > We take input from the user for array elements.
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) { // ? 3 > We check for the highest number in the array and we store the
                                // previously largest number in second largest.
                secondMax = max;
                max = arr[i];
            }
            if (secondMax < arr[i] && max > arr[i]) { // ? 4 > This is a precaution as if the max was the first
                                                      // number in the array, we wouldn't be able to find the second
                                                      // largest number.
                secondMax = arr[i];
            }
        }

        System.out.println("Second Largest Solution: " + secondMax);
    }

    public static void enhancedAlgorithm(Scanner sc) {
        System.out.println("Enter array size"); // ? 1 > We take input from the user for array size.
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter array elements"); // ? 2 > We take input from the user for array elements.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // ? 3 > We sort the array.

        if (arr[arr.length - 2] != arr[arr.length - 1]) {
            System.out.println("Second Largest Solution: " + arr[arr.length - 2]); // ? 4 > We print the second largest
                                                                                   // number.
        } else {
            int i = 3;
            while (arr[arr.length - i] == arr[arr.length - 1]) {
                i++;
            }
            System.out.println("Second Largest Solution: " + arr[arr.length - i]);
        }
    }

    public static void palindrome(Scanner sc) {
        int num = sc.nextInt(); // ? 1 > We take input from the user for number
        int temp = num, rev = 0, rem; // ? 2 > We store the original number in temp for comaprison.

        while (num != 0) {
            rem = num % 10; // ? 3 > We take the last digit of the number.
            rev = rev * 10 + rem; // ? 4 > We multiply the number by 10 and add the remainder.
            num = num / 10; // ? 5 > We divide the number by 10 to move to the next digit.
        }

        if (rev == temp) { // ? 6 > if the reversed number is equal to the original number it will be
                           // palindrome.
            System.out.println("Number entered is a palindrome");
            return;
        } else {
            System.out.println("Number entered is not a palindrome");
        }
    }
}
