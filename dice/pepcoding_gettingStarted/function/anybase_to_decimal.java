package pepcoding_gettingStarted.function;
import java.util.Scanner;
public class anybase_to_decimal {
public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  int b = scn.nextInt();
  int ans = getValueIndecimal(n, b);
  System.out.println(ans);

}  

public static int getValueIndecimal(int n, int b){
  int rv = 0;
  int bp = 1; 

  while(n > 0){
    int dig = n % 10;
    n = n / 10;
    
    rv = rv + dig * bp;
    bp = bp * b;
  }
  return rv;

}
  
}
