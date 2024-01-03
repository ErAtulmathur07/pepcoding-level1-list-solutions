import java.util.Scanner;

public class matrix_multiplication {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int[][] arr = new int[n1][n2];
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[0].length; j++){
        arr[i][j] = scn.nextInt();
      }
    }
    int m1 = scn.nextInt();
    int m2 = scn.nextInt();
    int[][]arrr = new int[m1][m2];
    for(int i = 0;i < arrr.length; i++){
     for(int j = 0; j < arrr[0].length; j++){
      arrr[i][j] = scn.nextInt();

     }
    }
    if(n2 != m1){
      System.out.println("Invalid");
      return;
    }

    int[][] prd = new int[n1][m2];
    for(int i = 0; i < prd.length; i++){
      for(int j = 0; j < prd[0].length;j++){
        int val = 0;
        for(int k = 0; k < m1; k++){
          val += arr[i][k]*arrr[k][j]; 
        } 
        prd[i][j] = val;
      }  
    }
      for(int i = 0; i < n1; i++){
        for(int j = 0; j < m2; j++){
          System.out.print(prd[i][j]);
        }
        System.out.println();
      }

  }
}
