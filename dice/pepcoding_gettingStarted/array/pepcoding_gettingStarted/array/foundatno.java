package pepcoding_gettingStarted.array;
import java.util.Scanner;
public class foundatno {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] arr = new int [n];

    for(int i = 0; i < arr.length; i++){
      arr[i] = scn.nextInt();
    }

    int num = scn.nextInt();

    int foundat = -1;
    for(int i = 0; i < arr.length; i++){
      if(arr[i] == num){
        foundat = i;
        break;
      }
    }
    System.out.println(foundat);
  }
}
