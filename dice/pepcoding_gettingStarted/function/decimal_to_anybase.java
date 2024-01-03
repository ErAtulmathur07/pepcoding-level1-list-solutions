package pepcoding_gettingStarted.function;
import java.util.Scanner;
public class decimal_to_anybase {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    int ans = getValueInBase(n, b);
    System.out.println(ans);

  }

  public static int getValueInBase(int n, int b){
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
