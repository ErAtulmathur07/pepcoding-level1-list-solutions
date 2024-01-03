import java.util.Scanner;
public class simpleintrest {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.print("Enter the principal amount: ");
    double amount = scn.nextDouble();
    
     System.out.print("Enter the time period (in years): ");
     double time = scn.nextDouble();

     System.out.print("Enter the interest rate (in percentage): ");
     double rate = scn.nextDouble();

     double interest = (amount*time*rate)/100;
     System.out.println("The simple interest is: " + interest);

    
  }
}
