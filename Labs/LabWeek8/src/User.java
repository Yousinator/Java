import java.util.Scanner;

public class User {
    private int id, phoneNumber, age;
    private static int lastId = 0;
    String name;
    Scanner scanf = new Scanner(System.in);

    public User() {
    }

    public User(int phoneNumber, int age, String name) {
        setPhoneNumber(phoneNumber);
        if (age >= 18) {
            setAge(age);
        } else {
            while (age < 18) {
                System.out.println("Age must be greater than 18");
                age = scanf.nextInt();
            }
        }
        setName(name);
        setId(id);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = ++lastId;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.printf("Id [%d]\nPhone Number [%d]\nAge [%d]\nname [%s]\n", getId(), getPhoneNumber(),
                getAge(), getName());
    }
}
