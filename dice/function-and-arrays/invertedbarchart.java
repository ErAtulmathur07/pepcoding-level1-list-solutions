import java.util.Scanner;

public class invertedbarchart {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[]arr = new int[n];
    for(int i = 0; i < arr.length; i++){
      arr[i] = scn.nextInt();

    }
    int max = arr[0];
    for(int i = 1; i < arr.length; i++){
      if(arr[i] > max){
        max = arr[i];
      }
    }
  for(int ht = 1; ht <= max; ht++){
    for(int i = 0; i < arr.length; i++){
      if(arr[i] >=  max){
        System.out.print("*\t");
      }
      else{
        System.out.print("\t");
      }
      
    }
    System.out.println();
  }



  }
}
