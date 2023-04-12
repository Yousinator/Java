import java.util.Scanner;
import java.util.Random;;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] matrix = new int[15][30];
        Scanner scanf = new Scanner(System.in);
        Random rand = new Random();

        fill(matrix, rand, scanf);
        seqSearch(matrix, rand, scanf);
        bubbleMatrix(matrix, rand, scanf);
        System.out.println(matrix[0][0]);
        System.out.println(matrix[0][1]);

        scanf.close();
    }

    public static void fill(int[][] matrix, Random rand, Scanner scanf) {
        System.out.println("Enter min followed by the max");
        int min = scanf.nextInt(), max = scanf.nextInt();

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt() * max - (min + 1) + min;

            }
        }

    }

    public static void seqSearch(int[][] matrix, Random rand, Scanner scanf) {
        int min = scanf.nextInt(), max = scanf.nextInt();

        int randomNumber = rand.nextInt() * max - (min + 1) + min;
        System.out.println(randomNumber);

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == randomNumber) {
                    System.out.printf("The element [%d] has been found at myArray[%d][%d]\n", randomNumber, i, j);
                    break;
                } else if (i == matrix.length && matrix[i][j] != randomNumber) {
                    System.out.println("Element not found\n");
                }

            }
        }

    }

    public static void bubbleSort(int[] myArray, Random rand, Scanner scanf) {
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

    public static void bubbleMatrix(int[][] matrix, Random rand, Scanner scanf) {
        for (int i = 0; i < 15; i++) {
            bubbleSort(matrix[i], rand, scanf);
        }
    }
}
