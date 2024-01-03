import java.util.Scanner;

public class print_all_permutations_of_a_string_iteratively{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    solution(str);
    scn.close();

  }
  public static int factorial(int n){
    int fact = 1;
    for(int i = 2; i <= n; i++){
      fact = fact * i;
    }
    return fact;
  }
  public static void solution(String str){
    int len = str.length();
    int total = factorial(len);

    for(int num = 0; num <= total; num++){
      StringBuilder sb = new StringBuilder(str);
      int temp = num;

      for(int div = len; div >= 1; div--){
          int q = temp / div;
          int r = temp % div;

          System.out.print(sb.charAt(r));
          sb.deleteCharAt(r);
          temp = q; 

      }
      System.out.println();
    }
  }
}