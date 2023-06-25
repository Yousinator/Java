public class Professor extends User {
    private int professorId, experienceYear, salary, load;
    static private int lastProfessorId = 0;

    public Professor() {
    }

    public Professor(int experienceYear, int salary, int load, int age, String name, int phoneNumber) {
        super(phoneNumber, age, name);
        setExperienceYear(experienceYear);
        setSalary(salary);
        setLoad(load);
        setProfessorId(professorId);
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

    public void setProfessorId(int professorId) {
        this.professorId = ++lastProfessorId;
    }

    public int getProfessorId() {
        return this.professorId;
    }

    public void printInfo() {
        System.out.printf("Id [%d]\nProfessor Id [%d]\nSalary [%d]\nLoad [%d]\nAge [%d]\nExperience [%d]\nname [%s]\n",
                getId(), getProfessorId(), getSalary(), getLoad(), getAge(), getExperienceYear(), getName());
    }
}
