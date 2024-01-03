import java.util.Scanner;

public class plogarithmic {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int x = scn.nextInt();
    int n = scn.nextInt();
    int ans = power( x, n);
    System.out.println(ans);
  }
  public static int power(int x, int n){
    if(n == 0){
      return 1; 
  }
  int faith = power(x, n/2);
  int ans = faith * faith;
  if(n % 2 ==1){
    ans = ans * x;
  }
  return ans;
  }
}
