import java.util.Scanner;

public class numberisprime {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();

    for(int i = 1; i <= t; i++){
      int n = scn.nextInt();

      int count = 0;
      for(int div = 2; div*div <= n; div++){
        if(n % div ==0){
          count++;
           break;
        }
      }
      if(count==0){
        System.out.println("number is prime");
      }else{
        System.out.println("number is not prime");
      }
    }
  }
  
}
