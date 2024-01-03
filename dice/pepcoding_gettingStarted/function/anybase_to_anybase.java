package pepcoding_gettingStarted.function;
import java.util.Scanner;
public class anybase_to_anybase {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b1 = scn.nextInt();
    int b2 = scn.nextInt();
    int d = getValue(n, b1, b2);
    System.out.println(d);
  
  }
  public static int getValue(int n , int b1, int b2){
    int d1 = getAnybaseDecimal(n , b1);
    int d2 = getDecimalAnybase(d1, b2);
    return d2;
  }
  public static int getAnybaseDecimal(int n , int b){
    int rv = 0;
    
    int bp = 1;
    while(n > 0){
      int dig = n % 10;
      n = n/10;

      rv = rv + dig * bp;
      bp = bp * b;
    }


    return rv;

  }
  public static int getDecimalAnybase(int n , int b){

    int rv = 0;
    int tp = 1;

    while(n > 0){
      int dig = n % b;
      n = n / b;

      rv = rv + dig * tp;
      tp = tp * 10;

    }
    return rv;

  }
  
}
