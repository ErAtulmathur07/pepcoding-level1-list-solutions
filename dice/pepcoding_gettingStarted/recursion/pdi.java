

import java.util.Scanner;

public class pdi {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    printDecresingInceasing(n);
  }

  public static void printDecresingInceasing(int n){
    if(n==0){
      return;
    }
    System.out.println(n);//pre area
    printDecresingInceasing(n-1); // recursive call
    System.out.println(n);// post area
  }
}
