import java.util.Scanner;

public class pattern_17 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int nspc = n/2;
    int nstr = 1;
    for(int i = 1; i<= n; i++){
      for(int j = 1; j<= nspc; j++){
        if(i == n/2+1){
          System.out.print("*\t");
        }else{
           System.out.print("\t");
        }
        
      }
      for(int j = 1; j <= nstr; j++){
        System.out.print("*\t");
      }
      if(i <= n/2){
        nstr++;
      }
      else{
        nstr--;
      }
      System.out.println();
    }
  }
}
