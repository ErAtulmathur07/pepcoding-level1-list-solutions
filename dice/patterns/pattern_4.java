import java.util.Scanner;

public class pattern_4 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int nstr = n;
    int npsc = 0; 
    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= npsc; j++){
        System.out.print("\t");
      }
      for(int j = 1; j <= nstr; j++){
        System.out.print("*\t");
      } 
      npsc++; 
      nstr--;
      System.out.println();    
    }
  }
}
