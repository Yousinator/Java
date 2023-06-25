package users;

import car.Car;
import java.util.*;

public class Root extends Users {
    Scanner sc = new Scanner(System.in);

    public Root() {
    }

    public Root(String rootName, int rootPassword) {
        super(rootName, rootPassword);
    }

    public void changeInfo(Customer customer) {
        Admin admin = new Admin();
        admin.changeInfo(customer);
    }

    public Admin[] addAdmin(Admin[] admins) {
        Admin admin = new Admin();
        String nameAddition;
        Boolean result;
        int password = 0;

        System.out.println("Enter the new user: ");
        nameAddition = sc.next();
        result = true;
        for (Admin Admin : admins) {
            if (nameAddition.equals(Admin.getUsername())) {
                result = false;
            }
        }
        if (!result) {
            System.out.println("User already exists");
            return admins;
        }
        try {

            System.out.println("Enter the new user's password (Numbers Only): ");
            password = sc.nextInt();
            admin.setPassword(password);
        } catch (InputMismatchException ex) {
            System.out.println("Numbers only");
            sc.nextLine(); // Clear the input buffer
            return admins;
        }
        admin.setUsername(nameAddition);

        ArrayList<Admin> adminList = new ArrayList<Admin>(Arrays.asList(admins));
        adminList.add(admin);

        return admins = adminList.toArray(admins);
    }

    @Override
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
        System.out.println("Customer Name: " + customer.getUsername());
        System.out.println("Customer Password: " + customer.getPassword());
    }
}
