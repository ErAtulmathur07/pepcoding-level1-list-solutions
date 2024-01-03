import java.util.Scanner;

public class find_element_in_an_array {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n =scn.nextInt();
    int [] arr = new int[n];
    for(int i = 0; i < arr.length; i++){
      arr[i] = scn.nextInt();

    }
    int d = scn.nextInt();
    int isFound = -1;
    for(int i = 0; i < arr.length; i++){
      if(d == arr[i]){
        isFound = i;
        break;
      }
    }
    System.out.println(isFound);

  }
}
