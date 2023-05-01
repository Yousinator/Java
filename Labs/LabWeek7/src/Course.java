public class Course {
    private int code, creditHours, maxEnrollment;
    private String name;

    public Course() {
    }

    public Course(int code, int creditHours, int maxEnrollment, String name) {
        setCode(code);
        setCreditHours(creditHours);
        setMaxEnrollment(maxEnrollment);
        setName(name);
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCreditHours() {
        return this.creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public int getMaxEnrollment() {
        return this.maxEnrollment;
    }

    public void setMaxEnrollment(int maxEnrollment) {
        this.maxEnrollment = maxEnrollment;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.printf("Code [%d]\nCredit Hours [%d]\nMax Enrollment [%d]\nname [%s]\n", code, creditHours,
                maxEnrollment, name);
    }
}
