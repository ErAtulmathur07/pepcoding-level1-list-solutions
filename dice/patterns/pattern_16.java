import java.util.Scanner;

public class pattern_16 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int nspc = 2*n-3;
    int nstr = 1;
    for(int i = 1; i <= n; i++){
      int val = 1;
      for(int j = 1; j <= nstr; j++){
        System.out.print(val+"\t");
        val++;
      }
      for(int j = 1; j <= nspc; j++){
        System.out.print("\t");
      }
      if(i == n){
        nstr--;
        val--;
      }
      for(int j = 1; j <= nstr; j++){
        val--;
        System.out.print(val+"\t");
      }      
      nstr++;
      nspc -= 2;
      System.out.println();
    }
     

   
  }
}

