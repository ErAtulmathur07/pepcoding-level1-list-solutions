import java.util.Scanner;

public class broken_economy {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < arr.length; i++){
      arr[i] = scn.nextInt();

    }
    int d = scn.nextInt();
    int lo = 0;
    int hi = arr.length-1;
    int floor = 0;
    int ceil = 0;
    
    while(lo <= hi){
      int mid = (lo+hi)/2;
      if(d < arr[mid]){
      hi = mid -1;
      ceil = arr[mid];
      }
      else if(d > arr[mid]){
        lo = mid + 1;
        floor = arr[mid];
      }
      else{
        floor = arr[mid];
        ceil = arr[mid];
      }

    }
    System.out.println(floor);
    System.out.println(ceil);

  }
}
