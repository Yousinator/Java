public class Staff {
    private int id, experienceYear, salary, age;
    private String name, section;

    public Staff() {
    }

    public Staff(int id, int experienceYear, int salary, int age, String name, String section) {
        setId(id);
        setExperienceYear(experienceYear);
        setSalary(salary);
        setAge(age);
        setName(name);
        setSection(section);
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

    public String getSection() {
        return this.section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void printInfo() {
        System.out.printf("Id [%d]\nSalary [%d]\nAge [%d]\nExperience [%d]\nname [%s]\nSection [%s]", id, salary,
                age, experienceYear, name, section);
    }

    public double calcAnnualSalary() {
        return salary * 12;
    }
}
