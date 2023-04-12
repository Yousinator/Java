import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanf = new Scanner(System.in);
        int arraySize = scanf.nextInt(), userNumber = scanf.nextInt(), search = 0;
        int[] myArray = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.printf("Enter myArray[%d]\n", i);
            myArray[i] = scanf.nextInt();
        }

        linearSearch(scanf, myArray, userNumber);
        max(scanf, myArray);

        scanf.close();

    }

    public static void myArray(Scanner scanf) {
        System.out.println("Pease enter the number");
        int choice = scanf.nextInt();
        int[] myArray = new int[choice];
        int sumOdd = 0, sumEven = 0;
        for (int i = 0; i < choice; i++) {
            myArray[i] = scanf.nextInt();
            if (myArray[i] % 2 == 0) {

                sumEven += myArray[i];
            } else {
                sumOdd += myArray[i];
            }

        }
        System.out.println("The sum of odds are: " + sumOdd);
        System.out.println("The sum of even numbers are: " + sumEven);
    }

    public static void myName(Scanner scanf) {
        String[] myArray = new String[4];
        for (int i = 0; i < 4; i++) {
            myArray[i] = scanf.next();
        }
        System.out.println("Your name is :");
        for (int i = 3; i >= 0; i--) {
            System.out.printf(" %s", myArray[i]);
            if (i == 0) {
                for (int j = 0; j < myArray[0].length(); j++) {
                    System.out.printf(" %s", myArray[0].charAt(j));
                }
            }
        }
    }

    public static void linearSearch(Scanner scanf, int[] myArray, int userNumber) {
        for (int j = 0; j < myArray.length; j++) {
            if (myArray[j] == userNumber) {
                System.out.printf("The element [%d] has been found at myArray[%d]\n", userNumber, j);
                break;
            } else if (j == myArray.length && myArray[j] != userNumber) {
                System.out.println("Element not found\n");
            }
        }

    }

    public static void max(Scanner scanf, int[] myArray) {
        int max = 0, tempMax = 0;

        for (int i = 0; i < myArray.length; i++) {
            tempMax = myArray[i];

            if (max < tempMax) {
                max = tempMax;
            }
        }
        System.out.printf("> The Highest number was: %d\n", max);
    }
}
