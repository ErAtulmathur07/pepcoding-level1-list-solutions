package pepcoding_gettingStarted.recursion;
import java.util.Scanner;

public class plinear{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int x = scn.nextInt();
    int n = scn.nextInt();
    int ans = power( x, n);
    System.out.println(ans);

  }
  public static int power(int x, int n) {
    if(n == 0){
        return 1; 
    }
    
        int faith = power(x, n-1);
        int ans = faith * x; 
        return ans;

  }
}
