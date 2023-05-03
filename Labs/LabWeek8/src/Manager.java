public class Manager extends User {
    private int id, experienceYear, salary, age;
    private String name;

    public Manager() {
    }

    public Manager(int id, int experienceYear, int salary, int age, String name) {
        super(id, age, name);
        setExperienceYear(experienceYear);
        setSalary(salary);

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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
        System.out.printf("Id [%d]\nSalary [%d]\nAge [%d]\nExperience [%d]\nname [%s]\n", id, salary,
                age, experienceYear, name);
    }

    public double calcAnnualSalary() {
        return salary * 12;
    }

}
