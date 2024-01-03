import java.util.Scanner;

public class grading_system {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    if(n >= 80 && n <= 100){
      System.out.println("A");
    }
    else if(n >= 73 && n <= 79){
      System.out.println("B");
    }
    else if(n >= 0 && n <= 64){
      System.out.println("C");
    }
    else{
      System.out.println("Z");
    }
  }
}
