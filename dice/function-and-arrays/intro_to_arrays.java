import java.util.Scanner;

public class intro_to_arrays {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] marks = new int[n];
    for(int i = 0; i < marks.length; i++){
      marks[i] = scn.nextInt();
    }
    for(int i = 0; i < marks.length; i++){
      System.out.print(" "+ marks[i]);
    }

  }
}
