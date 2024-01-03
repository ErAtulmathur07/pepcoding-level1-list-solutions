

import java.util.Scanner;

public class pd {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    printDecresing(n);

  }

  public static void printDecresing(int n){
  if( n==0){
    return;
  }
    System.out.println(n);
    printDecresing(n-1);
  }
}
