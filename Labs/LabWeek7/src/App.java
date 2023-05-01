public class App {
    public static void main(String[] args) throws Exception {
        Course myCourse = new Course(234236767, 3, 20, "math");
        myCourse.printInfo();
        System.out.println("------------------------------------------------");

        Department myDepartment = new Department(987655678, "informatics");
        myDepartment.printInfo();
        System.out.println("------------------------------------------------");

        Manager myManager = new Manager(8765467, 15, 20000, 47, "Ahmad");
        myManager.printInfo();
        System.out.println(myManager.calcAnnualSalary());
        System.out.println("------------------------------------------------");

        Professor myProfessor = new Professor(876546789, 12, 13000, 4, 36, "sobhi");
        myProfessor.printInfo();
        System.out.println("------------------------------------------------");

        Staff myStaff = new Staff(452636732, 7, 7000, 27, "Amro", "Art");
        myStaff.printInfo();
        System.out.println(myStaff.calcAnnualSalary());
        System.out.println("------------------------------------------------");

        Student myStudent = new Student(74646733, 7892367, 3, 20, "Khalid", "AI");
        myStudent.printInfo();
        System.out.println("\n------------------------------------------------");

    }
}
