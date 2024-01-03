import java.util.Scanner;

public class pattern_5 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int npsc = n/2;
    int nstr = 1; 
    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= npsc; j++){
        System.out.print("\t");
      }
      for(int j = 1; j <= nstr; j++){
        System.out.print("*\t");
      }
     if(i <=n/2){
        npsc--;     
        nstr += 2;     
     }
     else{
      npsc++;
      nstr -= 2;
     }
     System.out.println();
    }
  }
}
