import java.util.Scanner;

public class factorial {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int f = factRecursion(n);
    System.out.println(f);
    



  }
  public static int factRecursion(int n){
  if(n==1){
    return 1;
  }
  int nmfact = factRecursion(n-1);
  int fact = n * nmfact;
  return fact;

  }
  
}
