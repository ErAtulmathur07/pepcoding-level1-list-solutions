import java.util.Scanner;

public class any_base_to_decimal {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    int dn = getValueIndecimal(n, b);
    System.out.println(dn);

  }
  public static int getValueIndecimal(int n,int b){
    int dn = 0; 
    int bp = 1;
    while (n != 0) {
      int rem = n % 10;
      n = n / 10;

      dn = dn + rem * bp;
      bp = bp * b;

    }
    return dn;
  }
}
