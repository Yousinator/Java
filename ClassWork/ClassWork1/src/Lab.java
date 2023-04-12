import java.util.Scanner;;

/*
    Psuedocode
    ====================
    ! 1 > Declare 3 variables as integers.
    ! 2 > assign the values for the integers from user input.
    ! 3 > Declare a sum variable then add the three variables into the sum variable.
    ! 3 > Declare a average variable then devide the sum variable by 2 and store in the variable.
*/

public class Lab {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int num1 = scanf.nextInt(), num2 = scanf.nextInt(), num3 = scanf.nextInt(), sum = num1 + num2 + num3;
        double avg = sum / 3;
        System.out.println("The average is: " + avg + "\nThe sum is: " + sum);

    }
}
