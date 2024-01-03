package pepcoding_gettingStarted.String;

import java.util.Scanner;

public class printallpalaindromicstring {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String s = scn.nextLine();

    for(int i = 0; i < s.length(); i++){
      for(int j = i+1; j <= s.length(); j++){
        String sub = s.substring(i, j);
        Boolean isPalindrome = IsPalindrome(sub);
        if(isPalindrome == true){
          System.out.println(sub);
        } 
      }
    }
    }
    public static boolean IsPalindrome(String sub){
      boolean flag = true;
      int left = 0; 
      int right = sub.length()-1;

      while(left < right){
        char chleft = sub.charAt(left);
        char chright = sub.charAt(right);
        if(chleft != chright){
          flag = false;
          break;

        }
        left++;
        right--;
      }
      return flag;
    }
}
