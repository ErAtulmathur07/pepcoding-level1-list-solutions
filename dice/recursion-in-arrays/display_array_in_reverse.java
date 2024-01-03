import java.util.Scanner;

public class display_array_in_reverse {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < arr.length; i++){
      arr[i] = scn.nextInt();
    }
    reverseArray(arr, 0);
   
  }

  public static void reverseArray(int[] arr , int idx){
    if(idx == arr.length){
      return;
    }
   reverseArray(arr, idx+1);
   System.out.println(arr[idx]); 

  }
}
