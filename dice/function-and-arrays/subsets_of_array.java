import java.util.Scanner;

public class subsets_of_array {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[]arr = new int[n];
    for(int i = 0; i < arr.length; i++){
      arr[i] = scn.nextInt();
    }

    int lim = (int) Math.pow (2, arr.length);
    for(int i = 0; i < lim; i++){
      int temp = i;
      String str = " ";
      for(int j = arr.length - 1; j >= 0; --j){
        int rem = temp % 2;
        temp = temp / 2;

        if(rem == 0){
          str = "-\t" + str;
        }
        else{
          str = arr[j] + "\t" + str;
        }
      }
      System.out.println(str);
      
    }
  }
}
