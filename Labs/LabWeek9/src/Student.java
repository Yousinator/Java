public class Student extends User {
    private int studentId, secondaryGPA;
    private String major;
    static private int finalStudentId = 0;
    private Department department;

    public Student() {
    }

    public Student(int phoneNumber, int secondaryGPA, int age, String name, String major, Department department) {
        super(phoneNumber, age, name);
        setSecondaryGPA(secondaryGPA);
        setMajor(major);
        setStudentId(studentId);
        setDepartment(department);
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

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Object getDepartment() {
        return department;
    }

    public void printInfo() {
        System.out.printf("Id [%d]\nStudent Id [%d]\nPhone Number[%d]\nAge [%d]\nGPA [%d]\nname [%s]\nMajor [%s]",
                getId(),
                getStudentId(), getPhoneNumber(),
                getAge(), getSecondaryGPA(), getName(), getMajor());
    }
}
