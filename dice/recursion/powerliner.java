import java.util.Scanner;

public class powerliner {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int x = scn.nextInt();
    int n = scn.nextInt();
    int ans = powerLinear(x, n);
    System.out.println(ans);

  }
  public static int powerLinear( int x, int n){
    if(n==0){
      return 1;
    }
    
   int xpnm1 = powerLinear(x, n-1);
   int xpn = xpnm1 * x;
   return xpn;
   
  }

}
