import java.util.Scanner;
public class greetingmsg {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String name = scn.nextLine();
    
    System.out.println("Hello, " + name + "! good morning how are you.");
    System.out.println("Hello, " + name + "! Nice to meet you.");

  }
}
