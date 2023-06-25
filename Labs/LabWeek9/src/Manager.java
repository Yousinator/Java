public class Manager extends User {
    private int managerId, experienceYear, salary;
    private static int finalManagerId = 0;
    private Department department;

    public Manager() {
    }

    public Manager(int phoneNumber, int age, String name, int experienceYear, int salary, Department department) {
        super(phoneNumber, age, name);
        setExperienceYear(experienceYear);
        setSalary(salary);
        setManagerId(managerId);
        setDepartment(department);
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

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = ++finalManagerId;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Object getDepartment() {
        return department;
    }

    public void printInfo() {
        System.out.printf(
                "Id [%d]\nManager Id: [%d]\nSalary [%d]\nAge [%d]\nExperience [%d]\nname [%s]\nDepartment [%s]",
                getId(),
                getManagerId(), getSalary(),
                getAge(), getExperienceYear(), getName(), department.getDepartmentName());
    }

    public double calcAnnualSalary() {
        return salary * 12;
    }

}
