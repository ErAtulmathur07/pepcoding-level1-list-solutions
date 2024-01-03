import java.util.Scanner;

public class isprime{
public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  int t = scn.nextInt();
  boolean isPrime = true;
  for(int i = 1; i <= t; i++){
    int n = scn.nextInt();
    
    for(int div = 2; div * div <= n; div++){
      if(n % div == 0){
        isPrime = false;
        break;
      }
    }
    if(isPrime){
      System.out.println("the number is prime");
    }
    else{
      System.out.println("number is notprime");
    }
  }
}
}
