package pepcoding_gettingStarted;
import java.util.Scanner;
public class Broken_Economy {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] arr = new int [n];

    for(int i = 0; i < arr.length; i++){
        arr[i] = scn.nextInt();

    }
    int data = scn.nextInt();
    int left = 0;
    int right = arr.length-1;
    int ceil = 0;
    int floor = 0;
    while(left <= right){
        int mid = (left + right) / 2;

        if(data > arr[mid]){
            left = mid + 1;
            ceil = arr[mid];

        }
        else if ( data < arr[mid]){
            right  = mid - 1;
            floor = arr[mid];
                
            
        }
        else{
            floor = arr[mid];
            ceil = arr[mid];
           
            break;
                
            
        }
       
    }
        System.out.println(floor);
        System.out.println(ceil);
  }
}
