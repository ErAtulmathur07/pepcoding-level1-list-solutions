import java.util.Scanner;

public class palidrome {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String input = scn.nextLine();

    // Remove spaces and convert to lowercase for case-insensitive comparison
    String formattedInput = input.replaceAll("\\s+"," ").toLowerCase();
    //Check if the string is a palindrome
    boolean isPalindrome = checkPalindrome(formattedInput);

    if(isPalindrome){
      System.out.println("String is palindrome");
    }
    else{
      System.out.println("String is not palidnrome");
    }
  }
 public static boolean checkPalindrome(String str){
  int left = 0; 
  int right = str.length()-1;

  while(left < right){
    if(str.charAt(left) != str.charAt(right)){
      return false;
    }
    left++;
    right--;

  }
  return true;
 }

}
