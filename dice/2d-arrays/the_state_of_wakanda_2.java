import java.util.Scanner;

public class the_state_of_wakanda_2 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[][] arr = new int[n][n];
     for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        arr[i][j] = scn.nextInt();

      }
     }
     
     for(int g = 0; g < n; g++){
      for(int i = 0, j = g; j < n; i++, j++){
        System.out.println(arr[i][j]);
      }
     }

  }
}
