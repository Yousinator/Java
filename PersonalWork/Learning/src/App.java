import java.util.Scanner;

//! import java.util.Scanner; this for the scan.
//? Scanner scanf = new Scanner(System.in);.
//? int a = scanf.nextInt();.
//? "scanf" can be replaced by any other word, but i choose it to match with the c lang.
//! import java.util.Arrays; this is used for array functions.

public class App {
    public static void main(String[] args) {
        // * ----------------------------- Car -----------------------------------

        Scanner scanf = new Scanner(System.in);
        String color = scanf.nextLine(), make = scanf.nextLine();

        suv ahmad = new suv();
        ahmad.setColor(color);
        ahmad.setMake(make);
        System.out.println(ahmad.getColor());
        System.out.println(ahmad.getMake());
        System.out.println(ahmad.type);
        System.out.println(ahmad.license);
        System.out.println("\n###############################################################\n");

        // * ---------------------------- Button ----------------------------------

        button print = new smallButton("20 px", "30 px");
        print.redirect();
    }

}