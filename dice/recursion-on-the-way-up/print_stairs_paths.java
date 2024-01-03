import java.util.Scanner;

public class print_stairs_paths {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    printStairsPath(n,"");
    
  }

  public static void printStairsPath(int n, String path){
    if(n < 0){
      return;
    }
    if(n ==0){
      System.out.println(path);
      return;
    }
    printStairsPath(n-1, path + "1");
    printStairsPath(n-2, path + "2");
    printStairsPath(n-3, path + "3");
  }
}
