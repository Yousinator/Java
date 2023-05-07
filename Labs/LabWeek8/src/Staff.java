public class Staff extends User {
    private int staffId, experienceYear, salary;
    private String section;
    static private int finalStaffId = 0;

    public Staff() {
    }

    public Staff(int phoneNumber, int age, String name, int experienceYear, int salary) {
        super(phoneNumber, age, name);
        setExperienceYear(experienceYear);
        setSalary(salary);
        setSection(section);
        setStaffId(staffId);
    }

    public int getExperienceYear() {
        return this.experienceYear;
    }

    public void setExperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSection() {
        return this.section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getStaffId() {
        return this.staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = ++finalStaffId;
    }

    public void printInfo() {
        System.out.printf("Id [%d]\nStaff Id: [%d]\nSalary [%d]\nAge [%d]\nExperience [%d]\nname [%s]\nSection [%s]",
                getId(), getStaffId(), getSalary(),
                getAge(), getExperienceYear(), getName(), getSection());
    }

    public double calcAnnualSalary() {
        return salary * 12;
    }
}
