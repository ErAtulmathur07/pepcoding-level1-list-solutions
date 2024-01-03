import java.util.Scanner;

public class printdecreasing {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    printDecrasing(n);

  }

  public static void printDecrasing(int n){
   if(n==0){
    return;
   }

    System.out.println(n);
    printDecrasing(n-1);

  }
}
