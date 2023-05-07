public class Manager extends User {
    private int managerId, experienceYear, salary;
    private static int finalManagerId = 0;

    public Manager() {
    }

    public Manager(int phoneNumber, int age, String name, int experienceYear, int salary) {
        super(phoneNumber, age, name);
        setExperienceYear(experienceYear);
        setSalary(salary);
        setManagerId(managerId);
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

    public void printInfo() {
        System.out.printf("Id [%d]\nManager Id: [%d]\nSalary [%d]\nAge [%d]\nExperience [%d]\nname [%s]\n", getId(),
                getManagerId(), getSalary(),
                getAge(), getExperienceYear(), getName());
    }

    public double calcAnnualSalary() {
        return salary * 12;
    }

}
