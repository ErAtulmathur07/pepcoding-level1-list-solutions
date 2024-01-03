import java.util.Scanner;

public class DigitsOfANumber{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int div = 1; 
    int temp = n; 
    while( temp >= 10){
      temp = temp / 10; 
      div = div * 10;

    }
    while(div != 0){
      int q = n / div;
      System.out.println(q);
      int rem = n % div;
      div = div/ 10;
      n = rem;

    }
    
  }
}
