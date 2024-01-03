import java.util.Scanner;

public class print_Kpc {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    printKPC(str, " ");

  }
 
  static String [] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
  public static void printKPC(String ques , String ans){
   // base case
   if(ques.length() == 0){
    System.out.println(ans);
    return;
   }


   char ch = ques.charAt(0);
   String qos = ques.substring(1);

   String codeforch = codes[ch - '0'];

   for(int i = 0; i < codeforch.length(); i++){
    char cho = codeforch.charAt(i);
    printKPC(qos, ans + cho);
   }

  }
}
