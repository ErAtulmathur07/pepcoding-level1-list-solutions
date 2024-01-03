import java.util.Scanner;

public class factorial {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int ans = Factorial(n);
    System.out.println(ans);

  }
 public static int Factorial(int n){
  if(n==0||n==1){
     return 1;
  }

  int ans = Factorial(n-1);
  int ewf = n * ans;
  
  return ewf;
  
 }
 

}
