package users;

import car.Car;
import java.util.*;

public class Customer {
    private String username;
    private int password;
    private Car car = new Car();
    private Scanner sc = new Scanner(System.in);

    public Customer() {
    }

    public Customer(String username, int password, Car car) {
        setUsername(username);
        setPassword(password);
        setCar(car);
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

    public Car getCar() {
        return this.car;
    }

    public void setCar(Car car) {
        this.car = car;
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
            System.out.println(getPassword());
            if (password == this.getPassword()) {
                System.out.println("\nWelcome " + username);
                return true;
            } else {
                System.err.println("\n> Wrong password");
                return false;
            }
        }
        System.err.println("\n> User does not exist");
        return false;
    }

    public void printAllInfo() {
        Users user = new Users();

        user.printAllInfo(this);
    }

    public void searchInfo() {
        Users user = new Users();
        user.searchInfo(this);
    }
}
