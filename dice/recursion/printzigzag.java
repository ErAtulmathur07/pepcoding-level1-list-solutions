import java.util.Scanner;

public class printzigzag{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    printZigZag(n);
    
  }
  public static void printZigZag(int n){
    if(n == 0){
      return;
    }
    System.err.println(n + " pre");
    printZigZag(n-1);
    System.out.println(n + "in ");
    printZigZag(n-1);
    System.out.println(n + "post ");
  }
}
