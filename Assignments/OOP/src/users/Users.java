package users;

import car.Car;

import java.util.*;

public class Users {
    private String username;
    private int password;
    private static Scanner sc = new Scanner(System.in);

    public Users() {
    }

    public Users(String username, int password) {
        setUsername(username);
        setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return this.password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Boolean authintecate(String username) {
        int password = 0;
        if (username.equals(this.getUsername())) {
            System.out.println("Enter your password: ");
            try {
                password = sc.nextInt();
            } catch (InputMismatchException exception) {
                System.err.println("Password must be numbers");
                password = 0;
                sc.nextLine();
                return false;
            }
            if (password == this.getPassword()) {
                System.out.println("\nWelcome " + username);
                return true;
            } else {
                System.err.println("\n> Wrong password");
                return false;
            }
        }
        return false;
    }

    public void searchInfo(Customer customer) {
        int searchChoice = 0;
        Car car = customer.getCar();
        do {
            System.out.println(
                    "\nSearch for:\n1- Brand  2- Model  3- Year  4- Color 5- VIN  6- Engine  7- Fuel  8- Plate  9- All Info 10- Exit");
            try {
                searchChoice = sc.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("Something went wrong");
                sc.nextLine();
                continue;
            }
            switch (searchChoice) {
                case 1:
                    System.out.println("\nCar Make: " + car.getBrand());
                    break;
                case 2:
                    System.out.println("\nCar Model: " + car.getModel());
                    break;
                case 3:
                    System.out.println("\nCar Year: " + car.getYear());
                    break;
                case 4:
                    System.out.println("\nCar Color: " + car.getColor());
                    break;
                case 5:
                    System.out.println("\nCar VIN: " + car.getVin());
                    break;
                case 6:
                    System.out.println("\nCar Engine: " + car.getEngineType());
                    break;
                case 7:
                    System.out.println("\nCar Fuel: " + car.getFuelType());
                    break;
                case 8:
                    System.out.println("\nCar Plate: " + car.getLicensePlate());
                    break;
                case 9:
                    this.printAllInfo(customer);
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

    public void printAllInfo(Customer customer) {
        Car car = customer.getCar();
        System.out.println("\nCar Make: " + car.getBrand());
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Year: " + car.getYear());
        System.out.println("Car Color: " + car.getColor());
        System.out.println("Car VIN: " + car.getVin());
        System.out.println("Car Engine: " + car.getEngineType());
        System.out.println("Car Fuel: " + car.getFuelType());
        System.out.println("Car Plate: " + car.getLicensePlate());
    }

    public void changeInfo(Customer customer) {
        Car car = customer.getCar();
        int attributeEditChoice = 0;
        do {
            System.out.println(
                    "1- Color  2- Engine  3- Fuel  4- Plate  5- Exit");
            attributeEditChoice = sc.nextInt();
            switch (attributeEditChoice) {
                case 1:
                    System.out.println("Enetr New car color: ");
                    car.setColor(sc.next());
                    System.out.println("Color changed succefully to --> " + car.getColor());
                    break;
                case 2:
                    System.out.println("Enter New car Engine: ");
                    car.setEngineType(sc.next());
                    System.out.println("Engine type changed succefully to --> " + car.getEngineType());

                    break;
                case 3:
                    System.out.println("Enter New car Fuel: ");
                    car.setFuelType(sc.next());
                    System.out.println("Fuel type changed succefully to --> " + car.getFuelType());
                    break;
                case 4:
                    System.out.println("Enter New car plate: ");
                    car.setLicensePlate(sc.next());
                    System.out.println("License plate changed succefully to --> " + car.getLicensePlate());
                    break;
                case 5:
                    System.out.println("Exiting Editing mode...");
                    break;
                default:
                    System.out.println("Choice unavailable");
                    break;
            }
        } while (attributeEditChoice != 5);
        customer.setCar(car);

    }

    public Customer[] addCustomer(Customer[] customers) {
        Car car = new Car();
        Customer customer = new Customer();
        String nameAddition;
        Boolean result;
        int password = 0;

        System.out.println("Enter the new user: ");
        nameAddition = sc.next();
        result = true;
        for (Customer Admin : customers) {
            if (nameAddition.equals(Admin.getUsername())) {
                result = false;
            }
        }
        if (!result) {
            System.out.println("User already exists");
            return customers;
        }
        try {

            System.out.println("Enter the new user's password (Numbers Only): ");
            password = sc.nextInt();
            customer.setPassword(password);
        } catch (InputMismatchException ex) {
            System.out.println("Numbers only");
            sc.nextLine(); // Clear the input buffer
            return customers;
        }
        customer.setUsername(nameAddition);

        System.out.println("Enter the new user's car make: ");
        car.setBrand(sc.next());

        System.out.println("Enter the new user's car model: ");
        car.setModel(sc.next());

        System.out.println("Enter the new user's car year: ");
        car.setYear(sc.next());

        System.out.println("Enter the new user's car color: ");
        car.setColor(sc.next());

        System.out.println("Enter the new user's car VIN: ");
        car.setVin(sc.next());

        System.out.println("Enter the new user's car engine: ");
        car.setEngineType(sc.next());

        System.out.println("Enter the new user's car fuel: ");
        car.setFuelType(sc.next());

        System.out.println("Enter the new user's car plate: ");
        car.setLicensePlate(sc.next());

        customer.setCar(car);

        ArrayList<Customer> customersList = new ArrayList<Customer>(Arrays.asList(customers));
        customersList.add(customer);
        System.out.println("New user added successfully!");

        return customers = customersList.toArray(customers);
    }
}
