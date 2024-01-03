import java.util.Scanner;

public class all_indices_in_an_array {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < arr.length; i++){
      arr[i] = scn.nextInt();
    }

    int x = scn.nextInt();

  }

  public static int[] allIndices(int[]arr, int x, int idx, int fsf){
    if(idx == arr.length){
      return new int[fsf];
    }
    
  }
}
