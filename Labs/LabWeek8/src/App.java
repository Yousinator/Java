public class App {
    public static void main(String[] args) throws Exception {
        Course myCourse = new Course(234236767, 3, 20, "math");
        myCourse.printInfo();
        System.out.println("------------------------------------------------");

        Department myDepartment = new Department(987655678, "informatics");
        myDepartment.printInfo();
        System.out.println("------------------------------------------------");

        Manager myManager = new Manager(020202, 16, "admin", 1, 2300);
        myManager.printInfo();
        System.out.println(myManager.calcAnnualSalary());
        System.out.println("------------------------------------------------");

        Professor myProfessor = new Professor(12, 2300, 3, 45, "Sobhi", 022);
        myProfessor.printInfo();
        System.out.println("------------------------------------------------");

        Staff myStaff = new Staff(987655678, 78, "ahmad", 1, 3400);
        myStaff.printInfo();
        System.out.println(myStaff.calcAnnualSalary());
        System.out.println("------------------------------------------------");

        Student myStudent = new Student(987655678, 4, 23, "admin", "Ai");
        myStudent.printInfo();
        System.out.println("\n------------------------------------------------");

    }
}
