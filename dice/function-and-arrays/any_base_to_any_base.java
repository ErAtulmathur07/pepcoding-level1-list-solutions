import java.util.Scanner;

public class any_base_to_any_base {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int sourceBase = scn.nextInt();
    int destBase = scn.nextInt();
    int res = getValue(n, sourceBase, destBase);
    System.out.println(res);

  }
  public static int getValue(int n, int b1, int b2){
    int dec = getValueIndecimal(n , b1);
    int dn =  getValueInBase(dec, b2);
    return dn;

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
  public static int getValueInBase(int n, int b){
    int dn = 0; 
    int tp = 1;
    while (n != 0) {
      int rem = n % b;
      n = n / b;

      dn = dn + rem * tp;
      tp = tp * 10;


    }
    return dn;
  }    
}
