import java.util.Scanner;

public class arrays_memory_management {
  public static void main(String[] args) {
  int [] arr = new int[5];
  arr[0] = 99;
  arr[1] = 98;
  arr[2] = 97;
  arr[3] = 96;
  arr[4] = 95;

  swap(arr, 0, 4);
  for(int i = 0; i < arr.length; i++){
    System.out.println(arr[i]);
  }
  }
  public static void swap(int []arr, int i , int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

  }
}
