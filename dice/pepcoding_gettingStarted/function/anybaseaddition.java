package pepcoding_gettingStarted.function;
import java.util.Scanner;
public class anybaseaddition {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();
    int d = getSum(b, n1, n2);
    System.out.println(d);
    


  }

  public static int getSum (int b , int n1, int n2){
   int sum = 0;
   int tp = 1;

   int c = 0; 
   while(n1 > 0 || n2 > 0 || c > 0){
    int d1 = n1 % 10; 
    n1 = n1 / 10;
    
    int d2 = n2 % 10; 
    n2 = n2 / 10;

    int d = d1 + c + d2;
    c = d / b;
    d = d % b;

    sum = sum + d * tp;
    tp = tp * 10;



   }
   return sum;
    
  }
}
