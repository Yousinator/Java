import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int[] myArray = new int[30];
        Random rand = new Random();

        fill(myArray);
        print(myArray);
        bubbleSort(myArray);
        System.out.println("\nSorted");
        print(myArray);

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

}
