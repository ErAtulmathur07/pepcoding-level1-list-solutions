import java.util.Scanner;

public class power_logarithmic {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int x = scn.nextInt();
    int n = scn.nextInt();
    int p = powerLog(x, n);
    System.out.println(p);

  }
  public static int powerLog(int x, int n){
    if(n == 0){
      return 1;
    }
    int xpnn2 = powerLog(x, n/2);

    int xpn = xpnn2 * xpnn2;
    if(n % 2 == 1){
      xpn = x * xpn;
    }
    return xpn;
}

}