import java.util.Scanner;

void main() {

    final Scanner SCN = new Scanner(System.in);
    System.out.print("Enter Your First Name : ");
    String firstName = SCN.next();
    System.out.print("Enter Your Last Name : ");
    String lastName = SCN.next();

    System.out.print("Enter Subjesct 1 Marks : ");
    double sub1Mark = SCN.nextDouble();
    if (sub1Mark > 100 || sub1Mark < 0) {
        System.out.println("Invalid Marks ! ");
        System.exit(1);
    }

    System.out.print("Enter Subjesct 1 Marks : ");
    double sub2Mark = SCN.nextDouble();
    if (sub2Mark > 100 || sub2Mark < 0) {
        System.out.println("Invalid Marks ! ");
        System.exit(1);
    }
    System.out.print("Enter Subjesct 1 Marks : ");
    double sub3Mark = SCN.nextDouble();
    if (sub3Mark > 100 || sub3Mark < 0) {
        System.out.println("Invalid Marks ! ");
        System.exit(1);
    }

    final String GRADE1 = sub1Mark > 75 ? "A" : sub1Mark > 65 ? "B" : sub1Mark > 55 ? "C" : sub1Mark > 45 ? "S" : "Fail";
    final String GRADE2 = sub2Mark > 75 ? "A" : sub2Mark > 65 ? "B" : sub2Mark > 55 ? "C" : sub2Mark > 45 ? "S" : "Fail";
    final String GRADE3 = sub3Mark > 75 ? "A" : sub3Mark > 65 ? "B" : sub3Mark > 55 ? "C" : sub3Mark > 45 ? "S" : "Fail";

    final String COLOR1= GRADE1 == "A" ? "\033[32m" : GRADE1 == "B" ?"\033[34m" : GRADE1 == "C" ?"\033[33m" : GRADE1 == "S" ?"\033[37m" : "\033[31m" ;
    final String COLOR2= GRADE2 == "A" ? "\033[32m" : GRADE2 == "B" ?"\033[34m" : GRADE2 == "C" ?"\033[33m" : GRADE2== "S" ?"\033[37m" : "\033[31m" ;
    final String COLOR3= GRADE3 == "A" ? "\033[32m" : GRADE3 == "B" ?"\033[34m" : GRADE3== "C" ?"\033[33m" : GRADE3 == "S" ?"\033[37m" : "\033[31m" ;

    final String COLORDEFAULT ="\033[039m" ;
    System.out.println("---------------------------------");
    System.out.println("          Report Card");
    System.out.println("---------------------------------");

    System.out.println(STR."Name : \{firstName} \{lastName}\n");

    System.out.println("---------------------------------");
    System.out.println("Subject   |   Marks    |   Grade  ");
    System.out.println("---------------------------------");


    System.out.println(STR."Subject1  |   \{COLOR1}\{sub1Mark}     |   \{COLOR1}\{GRADE1}\{COLORDEFAULT} ");
    System.out.println(STR."Subject2  |   \{COLOR2}\{sub2Mark}     |   \{COLOR2}\{GRADE2}\{COLORDEFAULT} ");
    System.out.println(STR."Subject3  |   \{COLOR3}\{sub3Mark}     |   \{COLOR3}\{GRADE3}\{COLORDEFAULT} ");


}