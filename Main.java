public class Main {    public static void main(String[] args) {

    Administrator administrator = new Administrator("Anna", "Pavlova", 1, "Facultet CZ", false,4,"Bachelor",12,100 );
    Professor professor = new Professor("Yulia", "Nazar",1,"ITTS",true,9,200);
//    System.out.println("Salary administrator : " + administrator.calculateSalary());
//    System.out.println("Salary professor : " + professor.calculateSalary());
//
//
//    administrator.performDuties();
//    professor.performDuties();
//    professor.isDuty();
//    administrator.isDuty();
//    System.out.println("Details administrator : " + administrator.getDetails());
    System.out.println("Administrator :");
    administrator.performDuties();
    administrator.isDuty();
    System.out.println(administrator.getDetails());
    administrator.generateReport();

    System.out.println("Professor :");
    professor.performDuties();
    professor.isDuty();
    professor.generateReport();;
    }
}






