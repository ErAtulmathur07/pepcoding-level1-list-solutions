import java.util.Scanner;

public class pattern_7 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int nspc = 0;
    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= nspc; j++){
        System.out.print("\t");
      }
    System.out.println("*\t");
    nspc++;      
    }

    
  }
}
