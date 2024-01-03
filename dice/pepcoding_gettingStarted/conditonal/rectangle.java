package pepcoding_gettingStarted.conditonal;
import java.util.Scanner;
public class rectangle {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int len = scn.nextInt();
    int width = scn.nextInt();

    int areaofrec = areaOFRectangle(len, width);
    System.out.println(areaofrec);
  }
  public static int areaOFRectangle(int len, int width){
    return len*width;
  }
}
