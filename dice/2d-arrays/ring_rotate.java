import java.util.Scanner;

public class ring_rotate {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();

    int[][]arr =new int[n][m];
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[0].length; j++){
        arr[i][j] = scn.nextInt();
      }
    }

    int s = scn.nextInt();
    int r = scn.nextInt();
    display(arr);
    rotateShell(arr, s, r);

  }
  public static void rotateShell(int[][]arr, int s, int r){
    int []oned = fillOnedFromShell(arr, s);
    rotate(oned, r);
    fillShellFromOned(arr, oned, s);
  }

  // make a shell 1-D array and then rotate and then reverse
  public static void rotate(int[]oned, int r){
    r = r % oned.length;
    if(r < 0){
      r = r + oned.length;
    }
    reverse(oned, 0, oned.length-r-1);
    reverse(oned, oned.length-r, oned.length-1);
    reverse(oned, 0, oned.length-1);

  }

  public static void reverse(int[]oned, int li, int ri){
    while(li < ri){
      int temp = oned[li];
      oned[li] = oned[ri];
      oned[ri] = temp;
      
      li++;
      ri--;

    }
  }
  public static int[] fillOnedFromShell(int[][]arr, int s){
    int minr = s-1;
    int minc = s-1;
    int maxr = arr.length-s;
    int maxc = arr[0].length-s;
    int size = 2 *(maxr-minr) + 2*(maxc-minc);
    int [] oned = new int[size];


    int index = 0; 
    for(int i = minr,j = minc;  i <= maxr; i++){
     oned[index] = arr[i][j];
     index++;
    }
    
    for(int i= maxr, j = minc+1; j <= maxc; j++){
      oned[index] = arr[i][j];
      index++;

    }
    for(int i = maxr-1, j = maxc; i >= minr; i--){
      oned[index] = arr[i][j];
      index++;
    }
    for(int i = minr, j = maxc-1; j> minc; j--){
      oned[index] = arr[i][j];
      index++;

    }


    return oned;
  }

  public static void fillShellFromOned(int[][]arr, int oned[], int s){
    int minr = s-1;
    int minc = s-1;
    int maxr = arr.length-s;
    int maxc = arr[0].length-s;

    int index = 0;
    for(int i = minr, j = minc; i <= maxr; i++){
      arr[i][j] = oned[index];
      index++;
    }
    for(int i = maxr, j = minc+1; j <= maxc; j++){
      arr[i][j] = oned[index];
      index++;

    }
    for(int i = maxr -1, j = maxc; i >= minr; i--){
      arr[i][j] = oned[index];
      index++;

    }
    for(int i = minr,j = maxc-1; j > minc; j--){
      arr[i][j] = oned[index];
      index++;
    }
  }

   public static void display(int[][]arr){
    for(int i = 0; i < arr.length; i++){
      for(int j =0; j < arr[0].length; j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
   }
}
