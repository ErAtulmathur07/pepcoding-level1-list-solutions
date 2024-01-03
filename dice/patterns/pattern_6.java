import java.util.Scanner;

public class pattern_6 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int nstr = (n/2)+1;
    int nspc = 1;
    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= nstr; j++){
        System.out.print("*\t");
      }
      for(int j = 1; j <= nspc; j++){
        System.out.print("\t");
      }      
      for(int j = 1; j <= nstr; j++){
        System.out.print("*\t");
      }
      if(i <= n/2){
        nspc += 2;
        nstr--;
         
      }
      else{
        nspc -= 2;
        nstr++;
      }     
      System.out.println();
    }
  }
}
