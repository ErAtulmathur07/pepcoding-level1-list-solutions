import java.util.Scanner;

public class printincreasing {
  public static void main(String[] args) {
    Scanner scn =  new Scanner(System.in);
    int n = scn.nextInt();
    printIncrasing(n);
    
  }
  public static void printIncrasing(int n){

    if(n==0){
      return;
    }
    printIncrasing(n-1);
    System.out.println(n);
  }
}
