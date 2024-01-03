import java.util.Scanner;

public class pattern_18 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int nspc = 0;
    int nstr = n;

    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= nspc; j++){
        System.out.print("\t");
      }
      for(int j = 1; j <= nstr; j++){
        if(i > 1 && i <= n/2 && j > 1 && j < nstr){
          System.out.print("\t");
        }
        else{
          System.out.print("*\t");
        }
      }
      if(i <= n/2){
        nspc++;
        nstr -= 2;
      }
      else{
        nspc--;
        nstr += 2;
      }   
      System.out.println();   
    }
  }
}
