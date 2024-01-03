import java.util.Scanner;

public class spiral_display {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n =scn.nextInt();
    int m = scn.nextInt();
    int[][]arr = new int[n][m];
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[0].length; j++){
        arr[i][j] = scn.nextInt();
      }
    }
    int minrow = 0;
    int mincol = 0; 
    int maxrow = arr.length-1;
    int maxcol = arr[0].length-1;

    int tne = n * m;
    int count = 0;

    while(count < tne){
      // left wall
      for(int i = minrow; i <= maxrow && count < tne; i++){
        System.out.println(arr[i][mincol]);
        count++;
      }
      mincol++;
      
      //bottom wall
      for(int j = mincol; j <= maxcol && count < tne; j++){
        System.out.println(arr[maxrow][j]);
        count++;
      }
      maxrow--;


      //right wall
      for(int i = maxrow; i >= minrow && count < tne; i--){
        System.out.println(arr[i][maxcol]);
        count++;
      }
      maxcol--;


      // top wall
      for(int j = maxcol; j >= mincol && count < tne; j--){
        System.out.println(arr[minrow][j]);
      }
      mincol++;


    }
  }
}
