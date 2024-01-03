import java.util.Scanner;

public class display_arrays{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[]arr = new int[n];
    for(int i = 0; i < n; i++){
      arr[i] = scn.nextInt();
    }
    displayAray(arr, 0);
  
  }

  public static void displayAray(int arr[], int idx){
    if(idx == arr.length){
      return;
    }
    System.out.println(arr[idx]);
    displayAray(arr, idx+1);
  }
}