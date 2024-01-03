import java.util.Scanner;

public class pattern_15 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int nspc = n/2;
    int nstr = 1; 
    int val = 1;   
    for(int i = 1; i<= n; i++){
      for(int j =1; j <= nspc; j++){
        System.out.print("\t");
      }
      int cval = val; 
      for(int j = 1; j<= nstr; j++){
        System.out.print(cval+"\t");
        if(j <= nstr/2){
          cval++;
        }else{
          cval--;
        }
      }
      
      if(i <=n/2){
        nspc--;
        nstr += 2;
        val++;
      }
      else{
        nspc++;
        nstr -= 2;
        val--;
      }
      
      System.out.println();
    }
  }
}
