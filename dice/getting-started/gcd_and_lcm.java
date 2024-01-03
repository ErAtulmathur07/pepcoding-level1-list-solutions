import java.util.Scanner;

public class gcd_and_lcm {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num1 = scn.nextInt();
    int num2 = scn.nextInt();

    int tmp1 = num1; 
    int tmp2 = num2;

    while(tmp1 % tmp2 != 0){
      int rem = tmp1 % tmp2;
       tmp1 = tmp2;
       tmp2 = rem;
    }
    int gcd = tmp2;
    int lcm = (num1 * num2)/gcd;
    System.out.println(gcd);
    System.out.println(lcm);
  
   
  }
  
}
