public class Professor {
    private int id, experienceYear, salary, load, age;
    private String name;

    public Professor() {
    }

    public Professor(int id, int experienceYear, int salary, int load, int age, String name) {
        setId(id);
        setExperienceYear(experienceYear);
        setSalary(salary);
        setLoad(load);
        setAge(age);
        setName(name);
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

    public int getLoad() {
        return this.load;
    }

    public void setLoad(int load) {
        this.load = load;
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
        System.out.printf("Id [%d]\nSalary [%d]\nLoad [%d]\nAge [%d]\nExperience [%d]\nname [%s]\n", id, salary, load,
                age, experienceYear, name);
    }
}
