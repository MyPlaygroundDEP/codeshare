import java.util.Scanner;

void main() {
    final Scanner SCN = new Scanner(System.in);
    System.out.print("\033[40m\033[31m Enter A Day of Week  : \033[0m ");
    final String DAY = SCN.next();
    //System.out.println("\033[40m\033[35m Your day is : \033[0m " + "\033[48m\033[31m" + day + "\033[0m");
    if(DAY.equalsIgnoreCase("Monday")) System.out.println("\033[40m\033[35m Your day is : \033[0m " + "\033[48m\033[31m" + DAY + "\033[0m");
    else if (DAY.equalsIgnoreCase("Tuesday")) System.out.println("\033[40m\033[35m Your day is : \033[0m " + "\033[48m\033[31m" + DAY + "\033[0m");
    else if (DAY.equalsIgnoreCase("Wednesday")) System.out.println("\033[40m\033[35m Your day is : \033[0m " + "\033[48m\033[31m" + DAY + "\033[0m");
    else if (DAY.equalsIgnoreCase("Thursday")) System.out.println("\033[40m\033[35m Your day is : \033[0m " + "\033[48m\033[31m" + DAY + "\033[0m");
    else if (DAY.equalsIgnoreCase("Friday")) System.out.println("\033[40m\033[35m Your day is : \033[0m " + "\033[48m\033[31m" + DAY + "\033[0m");
    else if (DAY.equalsIgnoreCase("Saturday")) System.out.println("\033[40m\033[35m Your day is : \033[0m " + "\033[48m\033[31m" + DAY + "\033[0m");
    else if (DAY.equalsIgnoreCase("Sunday")) System.out.println("\033[40m\033[35m Your day is : \033[0m " + "\033[48m\033[31m" + DAY + "\033[0m");
    else System.out.println("\033[40m\033[35m Enter a valid day !  \033[0m ");

}