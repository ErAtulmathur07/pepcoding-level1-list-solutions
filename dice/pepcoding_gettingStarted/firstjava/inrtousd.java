import java.util.Scanner;

public class inrtousd {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    double inr = scn.nextDouble();
    // Define the fixed exchange rate (1 USD = 81.92 INR)
     double exchangerate = 81.92;
    double usd = inr / exchangerate;
    System.out.println(usd);
  }
}
