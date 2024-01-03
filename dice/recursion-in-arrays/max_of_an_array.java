import java.util.Scanner;

public class max_of_an_array {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < arr.length;i++){
      arr[i] = scn.nextInt();
    } 
   int m = maxOfAnArray(arr, 0);
   System.out.println(m);

  }
  public static int maxOfAnArray(int arr[] , int idx){
    if( idx >= arr.length){
      return Integer.MIN_VALUE;
    }
    int misa = maxOfAnArray(arr, idx+1);
    if(arr[idx] > misa){
     return arr[idx];
    }
      return misa;
  }
}
