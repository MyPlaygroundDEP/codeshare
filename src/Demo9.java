import java.util.Scanner;

void main() {

    Scanner scn = new Scanner(System.in);
    System.out.print("Enter your First Name : ");
    String firstName = scn.next();

    System.out.print("Enter your Last Name : ");
    String lastName = scn.next();

    System.out.print("Enter Subject 1 Marks : ");
    double firstSubMark = scn.nextDouble();

    System.out.print("Enter Subject 2 Marks : ");
    double secondSubMark = scn.nextDouble();

    System.out.print("Enter Subject 3 Marks : ");
    double thirdSubMark = scn.nextDouble();

    System.out.println("-----------------------------------------");
    System.out.println("          STUDENT REPORT CARD  ");
    System.out.println("-----------------------------------------");

    System.out.println(" Name : "+ firstName+"\s"+lastName );
    System.out.println("-----------------------------------------\n");
    System.out.println("\nSubject  |  Mark    | Grade");

    if(firstSubMark < 45)   System.out.println("Subject1 |\t"+"\033[31m"+firstSubMark+"\t| F\033[0m");
    else if (45<=firstSubMark & firstSubMark < 55)  System.out.println("Subject1 |\t"+"\033[37m"+firstSubMark+"\t| S\033[0m");
    else if (55<=firstSubMark & firstSubMark < 65)  System.out.println("Subject1 |\t"+"\033[33m"+firstSubMark+"\t| C\033[0m");
    else if (65<=firstSubMark & firstSubMark < 75)  System.out.println("Subject1 |\t"+"\033[34m"+firstSubMark+"\t| B\033[0m");
    else if (75<=firstSubMark)  System.out.println("Subject1 |\t"+"\033[32m"+firstSubMark+"\t| A\033[0m");


    if(secondSubMark < 45)   System.out.println("Subject2 |\t"+"\033[31m"+secondSubMark+"\t| F\033[0m");
    else if (45<=secondSubMark & secondSubMark < 55)  System.out.println("Subject2 |\t"+"\033[37m"+secondSubMark+"\t| S\033[0m");
    else if (55<=secondSubMark & secondSubMark < 65)  System.out.println("Subject2 |\t"+"\033[33m"+secondSubMark+"\t| C\033[0m");
    else if (65<=secondSubMark & secondSubMark < 75)  System.out.println("Subject2 |\t"+"\033[34m"+secondSubMark+"\t| B\033[0m");
    else if (75<=secondSubMark)  System.out.println("Subject2 |\t"+"\033[32m"+secondSubMark+"\t| A\033[0m");

    if(thirdSubMark < 45)   System.out.println("Subject3 |\t"+"\033[31m"+thirdSubMark+"\t| F\033[0m");
    else if (45<=thirdSubMark & thirdSubMark < 55)  System.out.println("Subject3 |\t"+"\033[37m"+thirdSubMark+"\t| S\033[0m");
    else if (55<=thirdSubMark & thirdSubMark < 65)  System.out.println("Subject3 |\t"+"\033[33m"+thirdSubMark+"\t| C\033[0m");
    else if (65<=thirdSubMark & thirdSubMark < 75)  System.out.println("Subject3 |\t"+"\033[34m"+thirdSubMark+"\t| B\033[0m");
    else if (75<=thirdSubMark)  System.out.println("Subject3 |\t"+"\033[32m"+thirdSubMark+"\t| A\033[0m");

    double total= firstSubMark+secondSubMark+thirdSubMark;
    double average =total/3;
    System.out.println("-----------------------------------------");
    System.out.println("Total Marks : "+ total);
    System.out.println("Average : "+ average);
}