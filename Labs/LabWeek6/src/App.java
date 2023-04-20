import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanf = new Scanner(System.in);
        String choice = "y";
        System.out.println("Enter Array Size:");
        int arraySize = scanf.nextInt();
        int[] myArray = new int[arraySize];

        fill(myArray, scanf);
        print(myArray, scanf);

        while (choice.charAt(0) == 'y') {
            switch (menu(scanf)) {
                case 1:
                    print(myArray, scanf);
                    search(myArray, scanf);
                    break;
                case 2:
                    print(myArray, scanf);
                    replace(myArray, scanf);
                    break;
                case 3:
                    fill(myArray, scanf);
                    print(myArray, scanf);
                    break;

            }
            System.out.println("Do you need to try again <y,n>: ");
            choice = scanf.next();
            System.out.println(choice);
        }
    }

    public static void search(int[] myArray, Scanner scanf) {

        System.out.println("Enter item that you looking for: ");
        int number = scanf.nextInt(), foundIndex = 0;

        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] == number) {
                foundIndex = i;

            } else if (i == myArray.length && myArray[i] != number) {
                System.out.printf("%d not found\n", number);
            }

        }
        System.out.printf("%d found at %d\n", number, foundIndex);
    }

    public static void fill(int[] myArray, Scanner scanf) {

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * (10 - 1 + 1) + 1);

        }

    }

    public static void print(int[] myArray, Scanner scanf) {
        System.out.println("Array:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("  %d", myArray[i]);

        }
        System.out.println("");
    }

    public static int menu(Scanner scanf) {
        System.out.println("Enter 1. Search for item");
        System.out.println("Enter 2. replace an item");
        System.out.println("Enter 3. Filling Array randomly");
        System.out.println("Choice: ");

        return scanf.nextInt();
    }

    public static void replace(int[] myArray, Scanner scanf) {
        System.out.println("Enter item that you want to replace: ");
        int number = scanf.nextInt();
        System.out.println("Enter new item: ");
        int newNum = scanf.nextInt();

        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] == number) {
                myArray[i] = newNum;
                System.out.printf("Item replaced at %d\n", i);

            } else if (i == myArray.length && myArray[i] != number) {
                System.out.printf("%d not found\n", number);
            }

        }
        print(myArray, scanf);
    }
}
