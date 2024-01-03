package pepcoding_gettingStarted.function;
import java.util.Scanner;
public class any_Base_Multiplication {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();
    int b = scn.nextInt();
    int d = getProduct(n1, n2, b);
    System.out.println(d);

  }
  public static int getProduct(int n1 , int n2 ,int b){
    int ans = 0; 
    int tp = 1; 
    while( n2 > 0){
      int d2 = n2 % 10;
      n2 = n2 / 10; 
      int psd = getSingleDigitPrduct(n1, b, d2);
      ans = getSum(b, d2, psd * tp );
      tp = tp * 10 ;


    }
    return ans;
  }

  public static int getSingleDigitPrduct(int n1, int b, int d2 ){
   int ans = 0; 
   int p = 1; 
   int c = 0; 
   while(n1 > 0 || c > 0){
    int d1 = n1 % 10 ;
    n1 = n1 / 10; 

    int d = d1 * d2 + c;
    c = d / b; 
    d = d % b; 


    ans = ans + d * p; 
    p = p * 10; 

   }
   return ans;

  }
 
  public static int getSum(int b, int m1 , int m2){
    int ans = 0; 
    int tp = 1; 
    int c = 0; 

    while(m1 > 0 || m2 > 0 || c > 0){
     int d1 = m1 % 10 ; 
     m1 = m1 / 10; 

     int d2 = m2 % 10; 
     m2 = m2 / 10; 

     int d = m1 + m2 + c; 
     c = d / b; 
     d = d % b; 

     ans = ans + d * tp; 
     tp = tp * 10;

    }
    return ans; 
  }
  
}
