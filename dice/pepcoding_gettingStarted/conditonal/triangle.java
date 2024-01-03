package pepcoding_gettingStarted.conditonal;
import java.util.Scanner;
public class triangle {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
    double base = scn.nextDouble();
    double height = scn.nextDouble();
   double areaoftri = areaOfTriangle(base, height);
   System.out.println(areaoftri);

  
  }
  public static double areaOfTriangle(double base, double height){

    double area = (height * base)/2;
     return area;
  }
  
}
