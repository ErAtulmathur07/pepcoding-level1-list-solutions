import java.util.Scanner;

public class prime_factorization_of_a_number {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    for(int div = 2; div * div <= n; div++){
      while(n % div == 0){
        System.out.println(div + " ");
        n = n/div;

      }
    }
    if( n != 1){
      System.out.println(n);
    }
  }
}
