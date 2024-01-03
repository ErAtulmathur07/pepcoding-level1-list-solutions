import java.util.Scanner;
public class largestnumber {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num1 = scn.nextInt();
    int num2 = scn.nextInt();
    int maxnumber = (num1>num2?num1:num2);
    System.out.println(maxnumber);
  }
}
