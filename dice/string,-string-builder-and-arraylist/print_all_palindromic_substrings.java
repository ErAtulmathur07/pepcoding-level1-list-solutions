import java.util.Scanner;

public class print_all_palindromic_substrings {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    
    for(int i = 0; i < str.length(); i++){
      for(int j = i+1; j < str.length(); j++){
         String sub = str.substring(i, j);
        boolean palindrome = isPalindrome(sub);
        if(palindrome == true){
          System.out.println(sub);
        }
      }
    }
    
  }

  public static boolean isPalindrome(String sub){
    boolean flag = true;
    int left = 0;
    int right = sub.length()-1;

    while(left < right){
      char chleft = sub.charAt(left);
      char chright = sub.charAt(right);

      if( chleft != chright){
        flag = false;
        break;

      }
      left++;
      right--;

    }

    return flag;

  }
}
