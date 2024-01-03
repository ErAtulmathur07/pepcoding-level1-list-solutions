package pepcoding_gettingStarted.recursioninarray;
import java.util.Scanner;
public class displayarray {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];

    for(int i=0; i<arr.length;i++){
      arr[i] = scn.nextInt();
    }
    darray(arr, 0);
  }


  public static void darray(int arr[], int vdx){
   if(vdx == arr.length){
    return;

   }
    System.out.println(arr[vdx]);
    darray(arr, vdx+1);

  }
}
