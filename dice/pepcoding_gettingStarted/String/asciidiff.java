package pepcoding_gettingStarted.String;

import java.util.Scanner;

public class asciidiff {
   
  public static String Solution(String str){
    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < str.length(); i++){
      if(i == str.length()-1){
       char chi = str.charAt(i);
       sb.append(chi);

      }
      else{
        char chi = str.charAt(i);
        char chip1 = str.charAt(i+1);
        sb.append(chi);
        sb.append(chip1 - chi);

      }
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(Solution(str));
  }
}
