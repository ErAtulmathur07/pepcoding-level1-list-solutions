
import java.util.Scanner;

public class reverseofannumber {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    while(n >0){
      int r = n % 10;
       n = n / 10;
       System.out.println(r);
    }
  }
  
}
