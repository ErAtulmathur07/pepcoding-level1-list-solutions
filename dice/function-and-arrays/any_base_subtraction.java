import java.util.Scanner;

public class any_base_subtraction {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();
    int sub = getDifference(b, n1, n2);
    System.out.println(sub);

  }
  public static int getDifference(int b, int n1, int n2){
    int diff = 0;
    int c = 0; 
    int tp = 1;

    while(n2>0){
      int d1 = n1 % 10;
      n1 = n1 /10;

      int d2 = n2 % 10; 
      n2 = n2 / 10; 
       
      int d = d2-d1-c;
      if(d < 0){
        c = 1;
        d = d +b; 
      } else{
        c = 0;
      }
      diff = diff + d * tp;
      tp = tp * 10; 

    }
    return diff;
  }
}
