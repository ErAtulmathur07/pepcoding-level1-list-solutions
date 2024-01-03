package pepcoding_gettingStarted.recursioninarray;
import java.util.Scanner;

public class reversearray {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
   int arr[] = new int[n];
   for(int i = 0; i <arr.length; i++){
    arr[i]= scn.nextInt();

   }
   rvarray(arr, 0);
 
  }
  public static void rvarray(int arr[],int i){
    if(i == arr.length){
      return;
    }
    rvarray(arr, i+1);
    System.out.println(arr[i]);
  }

}
