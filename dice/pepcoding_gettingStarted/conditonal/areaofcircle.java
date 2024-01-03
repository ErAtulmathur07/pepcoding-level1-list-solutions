package pepcoding_gettingStarted.conditonal;
import java.util.Scanner;
public class areaofcircle{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    double radius = scn.nextDouble();

    double area = cicleKaArea(radius);
    System.out.println("The area of circle is:" + area);

  }

  public static double cicleKaArea(double radius){
    return Math.PI * radius * radius; // Pi*r^2
  }
  
}