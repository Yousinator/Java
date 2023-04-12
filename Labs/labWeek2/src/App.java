import java.util.Scanner;;

public class App {
    public static void main(String[] args) throws Exception {
        int choice = 0;
        Scanner scanf = new Scanner(System.in);

        while (choice != 7) {
            System.out.println(
                    "Please enter your choice\n 1- Find the QUADRANT   2- Find the GREATEST   3- Interval for a number 4- Clock 5-Even or odd 6- Positive or Negative 7- Exit");
            choice = scanf.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please enter X followed by Y to find on which quadrant it exists");
                    float pointx = scanf.nextFloat(), pointy = scanf.nextFloat();
                    System.out.println("It is on " + quadrant(pointx, pointy));
                    System.out.println("\n*********************************\n");
                    break;
                case 2:
                    System.out.println("Please enter 3 numbers to find the greatest");
                    int number1 = scanf.nextInt(), number2 = scanf.nextInt(), number3 = scanf.nextInt();
                    System.out.println("The greatest is: " + greatest(number1, number2, number3));
                    System.out.println("\n*********************************\n");
                    break;
                case 3:
                    System.out.println("Enter a floating point to find the interval");
                    float number = scanf.nextFloat();
                    System.out.println("It is on " + interval(number));
                    System.out.println("\n*********************************\n");
                    break;
                case 4:
                    System.out.println("Enter the starting time follwed by the finish");
                    int start = scanf.nextInt(), finish = scanf.nextInt();
                    System.out.printf("The game lasted %d hours", clock(start, finish));
                    System.out.println("\n*********************************\n");
                    break;
                case 5:
                    System.out.println("Enter a number to find or not");
                    int evenOrOdd = scanf.nextInt();
                    System.out.printf("The number %d is %s", evenOrOdd, evenOdd(evenOrOdd));
                    System.out.println("\n*********************************\n");
                    break;
                case 6:
                    System.out.println("Enter a number to find positive or negative");
                    int positiveOrNegative = scanf.nextInt();
                    System.out.printf("The number %d is %s", positiveOrNegative, positiveNegative(positiveOrNegative));
                    System.out.println("\n*********************************\n");
                    break;
                case 7:
                    break;

            }
        }
    }

    static String quadrant(float pointx, float pointy) {
        if (pointx > 0 && pointy > 0) {
            return "Q1";
        } else if (pointx > 0 && pointy < 0) {
            return "Q4";
        } else if (pointx < 0 && pointy > 0) {
            return "Q2";
        } else if (pointx < 0 && pointy < 0) {
            return "Q3";
        } else if (pointx == 0 && pointy != 0) {
            return "On the y axis";
        } else if (pointy == 0 && pointy != 0) {
            return "On the x axis";
        } else if (pointx == 0 && pointy == 0) {
            return "On the origin";
        }
        return "ERROR";
    }

    static int greatest(int number1, int number2, int number3) {

        if (number1 > number2 && number1 > number3) {
            return number1;
        } else if (number2 > number1 && number2 > number3) {
            return number2;
        } else
            return number3;
    }

    static String interval(float number) {
        if (number >= 0 && number <= 25) {
            return "[0,25]";
        } else if (number > 25 && number <= 50) {
            return "(25,50]";
        } else if (number > 50 && number <= 75) {
            return "(50,75]";
        } else if (number > 75 && number <= 100) {
            return "(75,100]";
        } else if (number < 0) {
            return "Out Of Interval";
        }
        return "ERROR";
    }

    static int clock(int start, int finish) {
        int counter = 0;
        if (start == finish) {
            return 24;
        }
        for (int i = 0; i < 24; i++) {
            start++;
            if (start == 24) {
                start = 0;
            } else
                counter++;

            if (finish == start) {
                return counter;
            }
        }
        return 1;
    }

    static String evenOdd(int evenOrOdd) {
        if (evenOrOdd % 2 == 0) {
            return "Even";
        } else
            return "Odd";
    }

    static String positiveNegative(int positiveOrNegative) {
        if (positiveOrNegative < 0) {
            return "Negative";
        } else
            return "Positive";
    }
}
