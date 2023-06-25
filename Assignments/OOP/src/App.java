/*
    Writer's notes
    ======================
    ! It is recommended to have the "Better Comments" extension while reading this file.
    ! This only the procedural part of the code.

*/

/*
    Explaining Car DMV (Department of Motor Vehicles)
    ======================
    ? 1 > This program has three different user types of users: customers, admins, and roots, with root being most privileged.
    ? 2 > Each customer owns a car while admins and roots just manage the system.
    ? 3 > The system requires username and password authentication as privileges vary and data has to be secure.
    ? 4 > All users are in object form.
    ? 5 > Each user type has it's own array.

*/

/*
    Explaining the code
    ======================
    ! 1 > Create and fill all the needed arrays.
    ! 2 > In a do-while create a recurring main menu for the user to choose from.
    ! 3 > Provide a list of all the users and create a sswitch for each user.
    ! 4 > Customer:
        * 5 > Check for the users's credentials if true return the customer's index else reutrn -1.
        * 6 > If number is greater than -1 display the info for the customer.
    ! 7 > Admin:
        * 8 > Check for the users's credentials if true return the user's index.
        * 9 > If number is greater than -1 let him choose from the admin menu.
        * 10 > If admin chooses searching:
            ? 11 > Let the admin choose from the customers list.
            ? 12 > Repeat 6.
        * 13 > If admin chooses change:
            ? 13 > Let the admin choose from customer list.
            ? 14 > After choosing the customer, let the admin choose the attribute to be changed.
            ? 15 > Change the attribute based on the admin's input.
        * 16 > If the admin chooses add customer:
            ? 17 > Prompt the user to add customer attributes.
            ? 18 > Arrays are modified using a function that changes the array in to arraylist and back.
    ! 19 > Root:
        * 20 > Repeat steps 8 through 18.
        * 21 > If the root chooses add admin:
            ? 22 > Prompt the user to enter admin attributes.
            ? 23 > Repeat 18. 
    
*/

//! ------------------------------------------------------ The Code ------------------------------------------------------ //

import java.util.*;
import car.Car;
import users.*;

public class App {
    public static void main(String[] args) {
        // ! -------------------------------- Ascii Art ---------------------------
        String welcomeMessage = "Welcome to the DMV!\n1- Customer  2- Admin  3- Root  4- Exit";
        String customerAsciiArt = "\n ██████╗██╗   ██╗███████╗████████╗ ██████╗ ███╗   ███╗███████╗██████╗ \n" +
                "██╔════╝██║   ██║██╔════╝╚══██╔══╝██╔═══██╗████╗ ████║██╔════╝██╔══██╗\n" +
                "██║     ██║   ██║███████╗   ██║   ██║   ██║██╔████╔██║█████╗  ██████╔╝\n" +
                "██║     ██║   ██║╚════██║   ██║   ██║   ██║██║╚██╔╝██║██╔══╝  ██╔══██╗\n" +
                "╚██████╗╚██████╔╝███████║   ██║   ╚██████╔╝██║ ╚═╝ ██║███████╗██║  ██║\n" +
                " ╚═════╝ ╚═════╝ ╚══════╝   ╚═╝    ╚═════╝ ╚═╝     ╚═╝╚══════╝╚═╝  ╚═╝";
        String welcomeAsciiArt = "\n" + "██████╗ ███╗   ███╗██╗   ██╗\n"
                + "██╔══██╗████╗ ████║██║   ██║\n"
                + "██║  ██║██╔████╔██║██║   ██║\n"
                + "██║  ██║██║╚██╔╝██║╚██╗ ██╔╝\n"
                + "██████╔╝██║ ╚═╝ ██║ ╚████╔╝ \n"
                + "╚═════╝ ╚═╝     ╚═╝  ╚═══╝  \n"
                + "\n" + welcomeMessage;
        String adminAsciiArt = "\n" + " █████╗ ██████╗ ███╗   ███╗██╗███╗   ██╗\n" +
                "██╔══██╗██╔══██╗████╗ ████║██║████╗  ██║\n" +
                "███████║██║  ██║██╔████╔██║██║██╔██╗ ██║\n" +
                "██╔══██║██║  ██║██║╚██╔╝██║██║██║╚██╗██║\n" +
                "██║  ██║██████╔╝██║ ╚═╝ ██║██║██║ ╚████║\n" +
                "╚═╝  ╚═╝╚═════╝ ╚═╝     ╚═╝╚═╝╚═╝  ╚═══╝" + "\n";
        String rootAsciiArt = "\n" + "██████╗  ██████╗  ██████╗ ████████╗\n" +
                "██╔══██╗██╔═══██╗██╔═══██╗╚══██╔══╝\n" +
                "██████╔╝██║   ██║██║   ██║   ██║   \n" +
                "██╔══██╗██║   ██║██║   ██║   ██║   \n" +
                "██║  ██║╚██████╔╝╚██████╔╝   ██║   \n" +
                "╚═╝  ╚═╝ ╚═════╝  ╚═════╝    ╚═╝   " + "\n";
        String byeAsciiArt = "\n" + " ██████╗  ██████╗  ██████╗ ██████╗     ██████╗ ██╗   ██╗███████╗\n" +
                "██╔════╝ ██╔═══██╗██╔═══██╗██╔══██╗    ██╔══██╗╚██╗ ██╔╝██╔════╝\n" +
                "██║  ███╗██║   ██║██║   ██║██║  ██║    ██████╔╝ ╚████╔╝ █████╗  \n" +
                "██║   ██║██║   ██║██║   ██║██║  ██║    ██╔══██╗  ╚██╔╝  ██╔══╝  \n" +
                "╚██████╔╝╚██████╔╝╚██████╔╝██████╔╝    ██████╔╝   ██║   ███████╗\n" +
                " ╚═════╝  ╚═════╝  ╚═════╝ ╚═════╝     ╚═════╝    ╚═╝   ╚══════╝" + "\n";
        // !---------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        int adminChoice = 0, menuChoice = 0, rootChoice = 0, rootChecker = 0, adminChecker = 0, customerChecker = 0;

        Car[] cars = {
                new Car("Toyota", "Camry", "2018", "Red", "9278364728", "I4", "Petrol", "2212Y"),
                new Car("Cheverolet", "Malibu", "2019", "Blue", "2373840291", "I4", "Diesel", "7832A"),
                new Car("Ferrari", "F40", "1985", "Yellow", "2734649302", "V8", "Petrol", "5432B"),
                new Car("Dodge", "Charger SRT8", "2014", "Grey", "2836514253", "V8", "Diesel", "4522M"),
                new Car("BMW", "M5", "2022", "Green", "8163534206", "V8TT", "Petrol", "1831K")
        };
        Admin[] admins = {
                new Admin("Saud", 2211),
                new Admin("Nizar", 9261),
        };
        Customer[] customers = {
                new Customer("Omar", 2378, cars[0]),
                new Customer("Ahmad", 7236, cars[1]),
                new Customer("Noor", 2389, cars[2]),
                new Customer("Amro", 2398, cars[3]),
                new Customer("Qais", 1267, cars[4])
        };
        Root roots[] = { new Root("Yousef", 2004) };

        do {

            System.out.println(welcomeAsciiArt);
            try {
                menuChoice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid menu choice.");
                sc.nextLine();
                continue;
            }
            switch (menuChoice) {
                case 1:
                    try {
                        System.out.println(customerAsciiArt);
                        System.out.println("Please Enter your name");
                        customerChecker = checkPassword(customers, sc);
                        if (customerChecker > -1) {
                            customers[customerChecker].searchInfo();
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid customer index.");
                        sc.nextLine(); // Clear the input buffer
                        break;
                    }
                    break;
                case 2:
                    System.out.println(adminAsciiArt);
                    try {
                        adminChecker = checkPassword(admins, sc);
                        if (adminChecker > -1) {
                            do {
                                System.out.println(adminAsciiArt);
                                System.out.println("1- Search Database  2- Edit Database  3- Add a new user  4- Exit");
                                try {
                                    adminChoice = sc.nextInt();
                                } catch (InputMismatchException ex) {
                                    System.out.println("Invalid input. Please enter a valid admin choice.");
                                    // Clear the input buffer
                                    break; // Restart the loop
                                }
                                switch (adminChoice) {

                                    case 1:
                                        try {
                                            userSearch(admins, customers, roots, sc);
                                        } catch (Exception e) {
                                            System.out.println("Something went wrong");
                                            break;
                                        }
                                        break;
                                    case 2:
                                        try {
                                            userChange(admins, customers, sc, adminChecker);
                                        } catch (Exception e) {
                                            System.out.println("Something went wrong");
                                            break;
                                        }
                                        break;
                                    case 3:
                                        try {
                                            customers = admins[adminChecker].addCustomer(customers);
                                        } catch (Exception e) {
                                            System.out.println("Something went wrong");
                                            break;
                                        }
                                        break;
                                    case 4:
                                        System.out.println("Exiting admin mode...");
                                        break;
                                    default:
                                        System.out.println("Choice unavailable");
                                        break;

                                }
                            } while (adminChoice != 4);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid admin index.");
                        sc.nextLine(); // Clear the input buffer
                        break;
                    }
                    break;

                case 3:
                    System.out.println(rootAsciiArt);
                    try {
                        rootChecker = checkPassword(roots, sc);
                    } catch (InputMismatchException exception) {
                        System.out.println("Something went wrong");
                        break;
                    }
                    if (rootChecker > -1) {
                        try {
                            do {
                                System.out.println("You have full control over the database.");
                                System.out.println(
                                        "1- Search Database  2- Edit Database 3- Add a new Customer 4- Add Admin 5- Exit");
                                try {
                                    rootChoice = sc.nextInt();
                                } catch (InputMismatchException exception) {
                                    System.out.println("Something went wrong");
                                    break;
                                }
                                switch (rootChoice) {

                                    case 1:
                                        try {
                                            userSearch(roots, customers, roots, sc);
                                        } catch (Exception e) {
                                            System.out.println("Something went wrong");
                                            break;
                                        }
                                        break;
                                    case 2:
                                        try {
                                            userChange(roots, customers, sc, rootChecker);
                                        } catch (Exception e) {
                                            System.out.println("Something went wrong");
                                            break;
                                        }
                                        break;

                                    case 3:
                                        try {
                                            customers = admins[rootChecker].addCustomer(customers);
                                        } catch (InputMismatchException exception) {
                                            System.out.println("Something went wrong");
                                            break;
                                        }
                                        break;
                                    case 4:
                                        try {
                                            admins = roots[rootChecker].addAdmin(admins);
                                        } catch (InputMismatchException exception) {
                                            System.out.println("Something went wrong");
                                            break;
                                        }
                                        break;
                                    case 5:
                                        System.out.println("Exiting root mode...");
                                        break;
                                    default:
                                        System.out.println("Choice unavailable");
                                        break;

                                }
                            } while (rootChoice != 5);
                        } catch (InputMismatchException exception) {
                            System.out.println("Something went wrong");
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the DMV system!\n" + byeAsciiArt);
                    break;
                default:
                    System.out.println("Choice unavailable");
                    break;

            }
        } while (menuChoice != 4);
        sc.close();
    }

    public static void chooseUser(Customer[] customers, Scanner sc) {
        int i = 0;
        System.out.println("Choose the user:");
        for (Customer customer : customers) {
            System.out.printf("%d- %s  ", ++i, customer.getUsername());
        }
        System.out.printf("%d- Exit\n", ++i);
    }

    public static int checkPassword(Customer[] customers, Scanner sc) {
        int i = 0;
        String username = sc.next();
        for (Customer customer : customers) {
            if (customer.getUsername().equals(username)) {
                if (customers[i].authintecate(username)) {
                    return i;

                }

            } else {
                ++i;
            }
        }
        System.out.println("User does not exist");
        return -1;
    }

    public static int checkPassword(Users[] users, Scanner sc) {
        int i = 0;
        System.out.println("Enter your username: ");
        String username = sc.next();
        for (Users customer : users) {
            if (customer.getUsername().equals(username)) {
                if (users[i].authintecate(username)) {
                    return i;

                }

            } else {
                ++i;
            }
        }
        return -1;
    }

    public static void userSearch(Users[] users, Customer[] customers, Root[] roots, Scanner sc) throws Exception {
        int searchChoice = 0;
        chooseUser(customers, sc);
        try {
            searchChoice = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Something wnet wrong");
            sc.nextLine();
            return;
        }
        if (searchChoice - 1 < customers.length) {

            users[0].searchInfo(customers[searchChoice - 1]);

        }
    }

    public static void userChange(Users[] users, Customer[] customers, Scanner sc, int checker)
            throws Exception {
        int changeChoice = 0;
        chooseUser(customers, sc);
        try {
            changeChoice = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Something wnet wrong");
            return;
        }
        if (changeChoice - 1 < customers.length) {
            users[checker].changeInfo(customers[changeChoice - 1]);
        }
    }
}
