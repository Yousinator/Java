package ClassWork;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        Scanner scanf = new Scanner(System.in);

        System.out.println("Please enter your first name");
        String name = scanf.next();

        System.out.println("Please enter your first major");
        String major = scanf.next();

        System.out.println("Please enter your Student Id");
        long stdId = scanf.nextLong();

        System.out.println("Please enter your age");
        int age = scanf.nextInt();

        System.out.println("Please enter your Student Id");
        long idNum = scanf.nextLong();

        System.out.println("Are You over 18?");
        Boolean old = scanf.nextBoolean();

        cred yousef = new cred(name, major, stdId, age, idNum);
        System.out.println("My name is : " + yousef.name + "\nMy age is : " +
                yousef.age + "\nMy major is : "
                + yousef.major + "\nMy Student ID is : " + yousef.num + "\nMy ID is : " +
                yousef.idNum
                + "\nAre you above 18?: " + old);

        scanf.close();
    }

}
