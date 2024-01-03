import java.util.Scanner;

public class powerlogarthmic {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int x = scn.nextInt();
    int n = scn.nextInt();
    int ans = powrLogrthmic(x, n);
    System.out.println(ans);

  }
  public static int powrLogrthmic(int x, int n){
  if(n == 0){
    return 1;
  }
  int xpnb2 = powrLogrthmic(x, n/2);
  int xpn = xpnb2 * xpnb2;

  if (n % 2 == 1){
    xpn =   x * xpn;
  }

  return xpn;

  }
}
