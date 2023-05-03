public class Student {
    private int id, phoneNumber, secondaryGPA, age;
    private String name, major;

    public Student() {
    }

    public Student(int id, int phoneNumber, int secondaryGPA, int age, String name, String major) {
        setId(id);
        setPhoneNumber(phoneNumber);
        setSecondaryGPA(secondaryGPA);
        setAge(age);
        setName(name);
        setMajor(major);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSecondaryGPA() {
        return this.secondaryGPA;
    }

    public void setSecondaryGPA(int secondaryGPA) {
        this.secondaryGPA = secondaryGPA;
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

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void printInfo() {
        System.out.printf("Id [%d]\nPhone Number[%d]\nAge [%d]\nGPA [%d]\nname [%s]\nMajor [%s]", id, phoneNumber,
                age, secondaryGPA, name, major);
    }
}
