import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int[] myArray = new int[30];
        String[] myStrings = { "Saud", "Ahmad", "Yousef", "Amro", "Omar" };
        Random rand = new Random();

        printString(myStrings);
        stringBubbleSort(myStrings);
        System.out.println("\nSorted");
        printString(myStrings);

    }

    public static void bubbleSort(int myArray[]) {

        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = 0; j < myArray.length - i - 1; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }

    }

    public static void stringBubbleSort(String myStrings[]) {

        for (int i = 0; i < myStrings.length - 1; i++) {
            for (int j = 0; j < myStrings.length - i - 1; j++) {
                if (myStrings[j].compareTo(myStrings[j + 1]) > 1) {
                    String temp = myStrings[j];
                    myStrings[j] = myStrings[j + 1];
                    myStrings[j + 1] = temp;
                }
            }

        }

    }

    public static void quickSort(int myArray) {

    }

    public static void mergeSort(int myArray) {

    }

    public static void fill(int myArray[]) {
        Random rand = new Random();
        for (int i = 0; i < myArray.length - 1; i++) {

            myArray[i] = rand.nextInt(97);
        }

    }

    public static void print(int myArray[]) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("[%d],", myArray[i]);
        }
    }

    public static void printString(String myArray[]) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("[%s],", myArray[i]);
        }
    }

}
