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
    ? 4 > Each attribute of the cars in a sequenced array and the username and password.
    ? 5 > Each username has its password and car attribute in the other arrays corresponding to its index.

*/

/*
    Explaining the code
    ======================
    ! 1 > Create and fill all the needed arrays.
    ! 2 > In a do-while create a recurring main menu for the user to choose from.
    ! 3 > Provide a list of all the users and create a sswitch for each user.
    ! 4 > Customer:
        * 5 > Check for the users's credentials if true return the customer's index else reutrn -1.
        * 6 > If number is greater than -1 display the info for the customer at that index.
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

public class App {
    public static void main(String[] args) throws Exception {
        // ! -------------------------------- Ascii Art ---------------------------
        String welcomeMessage = "Welcome to the DMV!\n1- Customer  2- Admin  3- Root  4- Exit";
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
        String addition, nameAddition;
        Boolean result = true;

        int menuChoice = 0, adminChoice = 0, rootChoice = 0;
        // ! 1
        String[] roots = { "Yousef" };
        Integer[] rootPasswords = { 2004 };

        String[] admins = { "Saud", "Lubna", "Nizar", "Faris" };
        Integer[] adminPasswords = { 2211, 5534, 9261, 1924 };

        String[] customers = { "Omar", "Ahmad", "Noor", "Amro", "Qais" };
        Integer[] customerPasswords = { 2378, 7236, 2389, 2398, 1267 };

        String[] carBrand = { "Toyota", "Cheverolet", "Ferrari", "Dodge", "BMW" };
        String[] carModel = { "Camry", "Malibu", "F40", "Charger SRT8", "M5" };
        String[] carYear = { "2018", "2019", "1985", "2014", "2022" };
        String[] carColor = { "Red", "Blue", "Yellow", "Grey", "Green" };
        String[] carVin = { "9278364728", "2373840291", "2734649302", "2836514253", "8163534206" };
        String[] carEngine = { "I4", "I4", "V8", "V8", "V8 TT" };
        String[] carFuel = { "Petrol", "Diesel", "Petrol", "Diesel", "Petrol" };
        String[] carPlate = { "2212Y", "7832A", "5432B", "4522M", "1831K" };

        do { // ! 2
            System.out.println(welcomeAsciiArt);
            try {
                menuChoice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid menu choice.");
                sc.nextLine(); // Clear the input buffer
                continue; // Restart the loop
            }
            switch (menuChoice) { // ! 3
                case 1:

                    try {
                        int customerChecker = checkPassword(customers, customerPasswords, sc);
                        if (customerChecker > -1) {
                            searchInfo(carBrand, carModel, carYear, carColor, carVin, carEngine, carFuel, carPlate,
                                    sc, customerChecker);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid customer index.");
                        sc.nextLine(); // Clear the input buffer
                    }
                    break;
                case 2:
                    System.out.println(adminAsciiArt);
                    try {
                        int adminChecker = checkPassword(admins, adminPasswords, sc);
                        if (adminChecker > -1) {
                            do {
                                System.out.println(adminAsciiArt);
                                System.out.println("1- Search Database  2- Edit Database 3- Add a new user  4- Exit");
                                try {
                                    adminChoice = sc.nextInt();
                                } catch (InputMismatchException ex) {
                                    System.out.println("Invalid input. Please enter a valid admin choice.");
                                    sc.nextLine(); // Clear the input buffer
                                    continue; // Restart the loop
                                }
                                switch (adminChoice) {

                                    case 1:
                                        try {
                                            chooseUser(customers, sc);
                                            int adminUserChoice = sc.nextInt();
                                            if (adminUserChoice - 1 < customers.length) {
                                                searchInfo(carBrand, carModel, carYear, carColor, carVin, carEngine,
                                                        carFuel, carPlate, sc, adminUserChoice - 1);
                                            }
                                        } catch (InputMismatchException ex) {
                                            System.out.println("Invalid input. Please enter a valid customer index.");
                                            sc.nextLine(); // Clear the input buffer
                                        }
                                        break;
                                    case 2:
                                        try {
                                            chooseUser(customers, sc);
                                            int adminUserEditChoice = sc.nextInt();
                                            if (adminUserEditChoice < customers.length + 1) {
                                                changeInfo(carColor, carEngine, carFuel, carPlate, sc,
                                                        adminUserEditChoice - 1);
                                            }
                                        } catch (InputMismatchException ex) {
                                            System.out.println("Invalid input. Please enter a valid customer index.");
                                            sc.nextLine(); // Clear the input buffer
                                        }
                                        break;

                                    case 3:
                                        System.out.println("Enter the new user: ");
                                        nameAddition = sc.next();
                                        result = true;
                                        for (String customer : customers) {
                                            if (nameAddition.equals(customer)) {
                                                result = false;
                                            }
                                        }
                                        if (!result) {
                                            System.out.println("User already exists");
                                            break;
                                        }
                                        try {
                                            System.out.println("Enter the new user's password (Numbers Only): ");
                                            customerPasswords = assignInt(customerPasswords, sc);
                                        } catch (InputMismatchException ex) {
                                            System.out.println("Numbers only");
                                            sc.nextLine(); // Clear the input buffer
                                            break;
                                        }
                                        customers = assignString(customers, sc, nameAddition);

                                        System.out.println("Enter the new user's car Brand: ");
                                        addition = sc.next();
                                        carBrand = assignString(carBrand, sc, addition);

                                        System.out.println("Enter the new user's car model: ");
                                        addition = sc.next();
                                        carModel = assignString(carModel, sc, addition);

                                        System.out.println("Enter the new user's car year: ");
                                        addition = sc.next();
                                        carYear = assignString(carYear, sc, addition);

                                        System.out.println("Enter the new user's car color: ");
                                        addition = sc.next();
                                        carColor = assignString(carColor, sc, addition);

                                        System.out.println("Enter the new user's car VIN: ");
                                        addition = sc.next();
                                        carVin = assignString(carVin, sc, addition);

                                        System.out.println("Enter the new user's car engine: ");
                                        addition = sc.next();
                                        carEngine = assignString(carEngine, sc, addition);

                                        System.out.println("Enter the new user's car fuel: ");
                                        addition = sc.next();
                                        carFuel = assignString(carFuel, sc, addition);

                                        System.out.println("Enter the new user's car plate: ");
                                        addition = sc.next();
                                        carPlate = assignString(carPlate, sc, addition);
                                        System.out.println("New user added successfully!");

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
                    }

                    break;
                // ! Done with
                case 3:
                    System.out.println(rootAsciiArt);
                    try {
                        int rootChecker = checkPassword(roots, rootPasswords, sc);
                        if (rootChecker > -1) {
                            do {
                                System.out.println(rootAsciiArt);
                                System.out.println("Welcome, " + roots[rootChecker] + "!");
                                System.out.println("You have full control over the database.");
                                System.out.println(
                                        "1- Search Database  2- Edit Database 3- Add a new Customer 4- Add Admin 5- Exit");
                                rootChoice = sc.nextInt();
                                switch (rootChoice) {

                                    case 1:
                                        try {
                                            chooseUser(customers, sc);
                                            int rootUserChoice = sc.nextInt();
                                            if (rootUserChoice - 1 < customers.length) {
                                                searchInfo(carBrand, carModel, carYear, carColor, carVin, carEngine,
                                                        carFuel, carPlate, sc, rootUserChoice - 1);
                                            }
                                        } catch (InputMismatchException ex) {
                                            System.out.println("Invalid input. Please enter a valid customer index.");
                                            sc.nextLine(); // Clear the input buffer
                                        }
                                        break;
                                    case 2:
                                        try {
                                            chooseUser(customers, sc);
                                            int rootUserEditChoice = sc.nextInt();
                                            if (rootUserEditChoice < customers.length + 1) {
                                                changeInfo(carColor, carEngine, carFuel, carPlate, sc,
                                                        rootUserEditChoice - 1);
                                            }
                                        } catch (InputMismatchException ex) {
                                            System.out.println("Invalid input. Please enter a valid customer index.");
                                            sc.nextLine(); // Clear the input buffer
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Enter the new user: ");
                                        nameAddition = sc.next();
                                        result = true;
                                        for (String customer : customers) {
                                            if (nameAddition.equals(customer)) {
                                                result = false;
                                            }
                                        }
                                        if (!result) {
                                            System.out.println("User already exists");
                                            break;
                                        }
                                        try {
                                            System.out.println("Enter the new user's password (Numbers Only): ");
                                            customerPasswords = assignInt(customerPasswords, sc);
                                        } catch (InputMismatchException ex) {
                                            System.out.println("Numbers only");
                                            sc.nextLine(); // Clear the input buffer
                                            break;
                                        }
                                        customers = assignString(customers, sc, nameAddition);

                                        System.out.println("Enter the new user's car Brand: ");
                                        addition = sc.next();
                                        carBrand = assignString(carBrand, sc, addition);

                                        System.out.println("Enter the new user's car model: ");
                                        addition = sc.next();
                                        carModel = assignString(carModel, sc, addition);

                                        System.out.println("Enter the new user's car year: ");
                                        addition = sc.next();
                                        carYear = assignString(carYear, sc, addition);

                                        System.out.println("Enter the new user's car color: ");
                                        addition = sc.next();
                                        carColor = assignString(carColor, sc, addition);

                                        System.out.println("Enter the new user's car VIN: ");
                                        addition = sc.next();
                                        carVin = assignString(carVin, sc, addition);

                                        System.out.println("Enter the new user's car engine: ");
                                        addition = sc.next();
                                        carEngine = assignString(carEngine, sc, addition);

                                        System.out.println("Enter the new user's car fuel: ");
                                        addition = sc.next();
                                        carFuel = assignString(carFuel, sc, addition);

                                        System.out.println("Enter the new user's car plate: ");
                                        addition = sc.next();
                                        carPlate = assignString(carPlate, sc, addition);

                                        System.out.println("New user added successfully!");

                                        break;
                                    case 4:
                                        System.out.println("Enter the new user: ");
                                        nameAddition = sc.next();
                                        result = true;
                                        for (String customer : customers) {
                                            if (nameAddition.equals(customer)) {
                                                result = false;
                                            }
                                        }
                                        if (!result) {
                                            System.out.println("User already exists");
                                            break;
                                        }
                                        try {
                                            System.out.println("Enter the new user's password (Numbers Only): ");
                                            adminPasswords = assignInt(customerPasswords, sc);
                                        } catch (InputMismatchException ex) {
                                            System.out.println("Numbers only");
                                            sc.nextLine(); // Clear the input buffer
                                            break;
                                        }
                                        admins = assignString(customers, sc, nameAddition);
                                        break;
                                    case 5:
                                        System.out.println("Exiting root mode...");
                                        break;
                                    default:
                                        System.out.println("Choice unavailable");
                                        break;

                                }
                            } while (rootChoice != 5);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid root index.");
                        sc.nextLine(); // Clear the input buffer
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

    public static int checkPassword(String[] customers, Integer[] passwords, Scanner sc) throws Exception {
        System.out.println("Enter your username: ");
        String username = sc.next();
        int password = 0;
        for (int i = 0; i < customers.length; i++) {
            if (username.equals(customers[i])) {
                System.out.println("Enter your password: ");
                try {
                    password = sc.nextInt();
                } catch (NumberFormatException e) {
                    System.out.println("Password has to be numbers");
                    return -1;
                }
                if (password == passwords[i]) {
                    System.out.println("\nWelcome " + username);
                    return i;
                } else {
                    System.err.println("\n> Wrong password");
                    return -1;
                }
            }
        }
        System.err.println("\n> User does not exist");
        return -1;
    }

    public static void searchInfo(String[] carBrand, String[] carModel, String[] carYear, String[] carColor,
            String[] carVin, String[] carEngine, String[] carFuel, String[] carPlate, Scanner sc,
            int index) {
        int searchChoice = 0;
        do {
            System.out.println(
                    "\nSearch for:\n1- Brand  2- Model  3- Year  4- Color 5- VIN  6- Engine  7- Fuel  8- Plate  9- All Info 10- Exit");
            searchChoice = sc.nextInt();
            switch (searchChoice) {
                case 1:
                    System.out.println("\nCar Brand: " + carBrand[index]);
                    break;
                case 2:
                    System.out.println("\nCar Model: " + carModel[index]);
                    break;
                case 3:
                    System.out.println("\nCar Year: " + carYear[index]);
                    break;
                case 4:
                    System.out.println("\nCar Color: " + carColor[index]);
                    break;
                case 5:
                    System.out.println("\nCar VIN: " + carVin[index]);
                    break;
                case 6:
                    System.out.println("\nCar Engine: " + carEngine[index]);
                    break;
                case 7:
                    System.out.println("\nCar Fuel: " + carFuel[index]);
                    break;
                case 8:
                    System.out.println("\nCar Plate: " + carPlate[index]);
                    break;
                case 9:
                    printAllInfo(
                            index, carBrand, carModel, carYear, carColor, carVin, carEngine,
                            carFuel,
                            carPlate);
                    break;
                case 10:
                    System.out.println("Exiting Searching mode...");
                    break;
                default:
                    System.out.println("Choice unavailable");
                    break;

            }
        } while (searchChoice != 10);
    }

    public static void changeInfo(String[] carColor, String[] carEngine, String[] carFuel, String[] carPlate,
            Scanner sc,
            int index) {
        int adminAttributeEditChoice = 0;
        do {
            System.out.println(
                    "\nChange:\n1- Color  2- Engine  3- Fuel  4- Plate  5- Exit");
            adminAttributeEditChoice = sc.nextInt();
            switch (adminAttributeEditChoice) {
                case 1:
                    System.out.println("Enter new color: ");
                    carColor[index] = sc.next();
                    System.out.println("Color changed succefully to --> " + carColor[index]);
                    break;
                case 2:
                    System.out.println("Enter new engine type: ");
                    carEngine[index] = sc.next();
                    System.out.println("Engine type changed succefully to --> " + carFuel[index]);
                    break;
                case 3:
                    System.out.println("Enter new fuel type:");
                    carFuel[index] = sc.next();
                    System.out.println("Fuel type changed succefully to --> " + carFuel[index]);
                    break;
                case 4:
                    System.out.println("Enter new license plate: ");
                    carPlate[index] = sc.next();
                    System.out.println("License plate changed succefully to --> " + carPlate[index]);
                    break;
                case 5:
                    System.out.println("Exiting Editing mode...");
                    break;
                default:
                    System.out.println("Choice unavailable");
                    break;

            }
        } while (adminAttributeEditChoice != 5);
    }

    public static void chooseUser(String[] customers, Scanner sc) {
        int i = 0;
        System.out.println("\nChoose the user:");
        for (String user : customers) {
            System.out.printf("%d- %s  ", ++i, user);
        }
        System.out.printf("%d- Exit\n", ++i);
    }

    public static String[] assignString(String[] customers, Scanner sc, String addition) {

        ArrayList<String> customersList = new ArrayList<String>(Arrays.asList(customers));

        customersList.add(addition);
        return customers = customersList.toArray(customers);

    }

    public static Integer[] assignInt(Integer intArray[], Scanner sc) {

        List<Integer> intList = new ArrayList<Integer>(Arrays.asList(intArray));
        try {
            intList.add(sc.nextInt());
        } catch (NumberFormatException e) {
            System.out.println("Password has to be numbers");
            return intArray;
        }

        return intArray = intList.toArray(intArray);

    }

    public static void printAllInfo(int i, String[] carBrand, String[] carModel, String[] carYear, String[] carColor,
            String[] carVin, String[] carEngine, String[] carFuel, String[] carPlate) {
        System.out.println("\nCar Brand: " + carBrand[i]);
        System.out.println("Car Model: " + carModel[i]);
        System.out.println("Car Year: " + carYear[i]);
        System.out.println("Car Color: " + carColor[i]);
        System.out.println("Car VIN: " + carVin[i]);
        System.out.println("Car Engine: " + carEngine[i]);
        System.out.println("Car Fuel: " + carFuel[i]);
        System.out.println("Car Plate: " + carPlate[i]);
    }
    // ! Done with
}