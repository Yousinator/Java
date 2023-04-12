import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanf = new Scanner(System.in);

        // calc();
        date(scanf);

        scanf.close();
    }

    public static void calc() {
        Scanner scanf = new Scanner(System.in);
        int firstNum = 0, secondNum = 0;

        System.out.println("Enter a fooking thing man");
        String thing = scanf.nextLine(), firstText = "";
        char moderator = ' ';

        for (int i = 0; i < thing.length(); i++) {

            if (thing.charAt(i) != '*' && thing.charAt(i) != '+' && thing.charAt(i) != '-' && thing.charAt(i) != '/') {
                firstText = firstText + thing.charAt(i);

            } else if (thing.charAt(i) == '*' || thing.charAt(i) == '+' || thing.charAt(i) == '-'
                    || thing.charAt(i) == '/') {
                moderator = thing.charAt(i);
                firstNum = Integer.parseInt(firstText);
                firstText = "";

            }

        }
        secondNum = Integer.parseInt(firstText);

        switch (moderator) {
            case '*':
                System.out.printf("The result is: " + (firstNum * secondNum));
                break;
            case '/':
                float div = firstNum / secondNum;
                System.out.printf("The result is: [%.2f]", div);
                break;
            case '+':
                System.out.printf("The result is: " + (firstNum + secondNum));
                break;
            case '-':
                System.out.printf("The result is: " + (firstNum - secondNum));
                break;

        }
        scanf.close();
    }

    public static void date(Scanner scanf) {

        System.out.println("Please enter the first date followed by the second day");
        String date1 = scanf.nextLine(), date2 = scanf.nextLine(), text1 = "", text2 = "";
        int day1 = 0, month1 = 0, year1 = 0, day2 = 0, month2 = 0, year2 = 0;

        for (int i = 0; i < 2; i++) {
            text1 = text1 + date1.charAt(i);
        }
        day1 = Integer.parseInt(text1);
        text1 = "";

        for (int i = 3; i < 5; i++) {
            text1 = text1 + date1.charAt(i);
        }
        month1 = Integer.parseInt(text1);
        text1 = "";

        for (int i = 6; i < date1.length(); i++) {
            text1 = text1 + date1.charAt(i);
        }
        year1 = Integer.parseInt(text1);
        text1 = "";

        // ! Fuck Java

        for (int j = 0; j < 2; j++) {
            text2 = text2 + date2.charAt(j);
        }
        day2 = Integer.parseInt(text2);
        text2 = "";

        for (int i = 3; i < 5; i++) {
            text2 = text2 + date2.charAt(i);
        }
        month2 = Integer.parseInt(text2);
        text2 = "";

        for (int i = 6; i < date2.length(); i++) {
            text2 = text2 + date2.charAt(i);
        }
        year2 = Integer.parseInt(text2);
        System.out.println(year2);

        int day = day1 - day2, month = month1 - month2, year = year1 - year2;
        if (day < 0)
            day *= -1;
        if (month < 0)
            month *= -1;
        if (year < 0)
            year *= -1;

        System.out.printf("The difference is [%d] Day(s), [%d] Month(s), [%d] Year(s)", day, month, year - 1);
    }
}