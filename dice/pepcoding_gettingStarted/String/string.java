package pepcoding_gettingStarted.String;

import java.io.CharArrayReader;
import java.util.Scanner;

public class string {
  /**
   * @param args
   */
  public static void main(String[] args) {
    
    String s1 = "hello";
    String s2 = "world";
    System.out.println(s1);
    for(int i = 0; i < s1.length(); i++){
      char ch =  s1.charAt(i);
      System.out.println(ch);
      
    }
       System.out.println(10 + 20 + " hello" + 10 + 20);
       s1 = s1 + "Atul";
       System.out.println(s1);
        s1.substring(1, 4);
        System.out.println(s1.substring(0, 5));
        System.out.println(s1.substring(2, 5));
        System.out.println(s1.substring(1, 4));

        // input
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.replace('a', 'v'));

        


  }
}
