import java.util.Scanner;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of people");
        int loops = sc.nextInt(); // ? 1 > Read the number of people entered by the user
        long[] ages = new long[loops];// ? 2 > Create an array of longs to store ages because we are dealing with
                                      // large numbers

        for (int i = 0; i < ages.length; i++) { // ? 3 > For each person Repeat the following
            System.out.println("Please enter the date as DD MM YYYY"); // ? 4 > read the day, month and year entered by
                                                                       // the user
            int day = sc.nextInt(), month = sc.nextInt(), year = sc.nextInt();

            if (checkDate(day, month, year)) { // ? 5 > Check if the date is valid
                ages[i] = getDateInSeconds(day, month, year); // ? 6 > If the date is valid, calculate the age in
                                                              // seconds and store it in the ages array
            }
        }

        insertionSort(ages); // ? 7 > Sort the ages array using insertion sort
        printArray(ages); // ? 8 > Print the ages array

        sc.close();
    }

    public static long getDateInSeconds(long day, long month, long year) {
        LocalDate date = LocalDate.now();
        long finalDay = day - date.getDayOfMonth(), finalMonth = month - date.getMonthValue() - 12,
                finalYear = date.getYear() - year; // ? 1 > Calculate the final day, month and year using the current
                                                   // date and the date entered by the user

        if (month > date.getMonthValue())
            finalYear--; // ? 2 > If the month is greater than the current month subtract 1 from the
                         // final years because the person didn't finish the year yet.
        if (finalMonth < 0)
            finalMonth = -finalMonth; // ? 3 > If the final months or days are less than zero multiply them -1 you
                                      // don't want a ngeative number
        if (finalDay < 0)
            finalDay = -finalDay;

        long ageInDays = finalDay + (finalYear * 365) + (finalMonth * 30); // ? 4 > Calculate the age in days
        System.out.printf("Age in days: [%d]\tAge in Seconds: [%d]\n", ageInDays, ageInDays * 86400);
        // ? 5 > Print the age in days and age in seconds
        return ageInDays * 86400;
    }

    public static void insertionSort(long ages[]) {
        for (int i = 1; i < ages.length; ++i) {
            long temp = ages[i]; // ? 1 > Store the current element in a temporary variable starting from 1
            int j = i - 1;

            while (j >= 0 && ages[j] < temp) {
                ages[j + 1] = ages[j]; // ? 2 > Compare the current element with the elements before it and shift them
                                       // to the right if they are greater than the current element
                j--;
            }
            ages[j + 1] = temp;
        }

    }

    public static Boolean checkDate(int day, int month, int year) {
        LocalDate date = LocalDate.now();
        /*
         * I. days, months, or years entered by the user must be greater than zero
         * II. days, months, or years entered by the user must be less than 31, 12, and
         * 2023 respectively
         * III. The date entered by the user must not be after the current date
         */
        if (day < 0 || month < 0 || year < 0 || year > 2023 || month > 12 || day > 31
                || ((day > date.getDayOfMonth()) && (month >= date.getMonthValue()) && (year >= date.getYear()))
                || ((month > date.getMonthValue()) && (year >= date.getYear()))) {
            System.out.println("Invalid date");
            return false;
        }
        return true;
    }

    public static void printArray(long[] ages) {
        int i = 0;
        System.out.println("The ages are as follows");
        for (long element : ages) {
            if (element == 0)
                continue;
            else
                System.out.printf("#%d [%d]\n", ++i, element);
        }
    }

}