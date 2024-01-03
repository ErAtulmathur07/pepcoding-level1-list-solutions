import java.util.Scanner;

public class binary_search_algorithm {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[]arr = new int[n];
    
    for(int i = 0; i < arr.length; i++){
      arr[i] = scn.nextInt();

    }
    
    int num = 20;
    int l= 0; 
    int h = arr.length-1;


    if(l<=h){
      int mid = (l + h)/2;
      if(num < mid){
        h = mid - 1;
      }
      else if(num > mid){
        l = mid + 1;
      }
      else{
        System.out.println(mid);
        return;
      }
    }
    System.out.println(-1);


  }
}
