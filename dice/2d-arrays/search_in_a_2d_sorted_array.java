import java.util.Scanner;

public class search_in_a_2d_sorted_array {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][]arr = new int[n][m];

    for(int i = 0; i < n; i++){
      for(int j = 0; j < m; j++){
        arr[i][j] = scn.nextInt();

      }
    }

    // liner search
    /* 
    int data = scn.nextInt();
    scn.close();

    for(int row = 0; row < n; row++){
      for(int col =0 ; col < m; col++){
        if(arr[row][col] == data){
          System.out.println(row);
          System.out.println(col);
          return;

        }
      }
      System.out.println("Invalid input");
    }
    */

    int data = scn.nextInt();
    int row = 0; 
    int col = n-1;
    while(row < n && col >= 0){
      if(arr[col][row]==data){
        System.out.println(row);
        System.out.println(col);
        return;
      }
      if(arr[row][col] > data){
        col--;
      }else{
        row++;
      }
    }
    System.out.println("Not found");

  }
}
