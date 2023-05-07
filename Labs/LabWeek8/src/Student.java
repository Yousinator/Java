public class Student extends User {
    private int studentId, secondaryGPA;
    private String major;
    static private int finalStudentId = 0;

    public Student() {
    }

    public Student(int phoneNumber, int secondaryGPA, int age, String name, String major) {
        super(phoneNumber, age, name);
        setSecondaryGPA(secondaryGPA);
        setMajor(major);
        setStudentId(studentId);
    }

    public int getSecondaryGPA() {
        return this.secondaryGPA;
    }

    public void setSecondaryGPA(int secondaryGPA) {
        this.secondaryGPA = secondaryGPA;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = ++finalStudentId;
    }

    public void printInfo() {
        System.out.printf("Id [%d]\nStudent Id [%d]\nPhone Number[%d]\nAge [%d]\nGPA [%d]\nname [%s]\nMajor [%s]",
                getId(),
                getStudentId(), getPhoneNumber(),
                getAge(), getSecondaryGPA(), getName(), getMajor());
    }
}
