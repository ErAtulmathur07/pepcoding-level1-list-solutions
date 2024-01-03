import java.util.Scanner;

public class toggle_case {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(toggleCase(str));


  }

  public static String toggleCase(String str){
    StringBuilder sb = new StringBuilder(str);
    for(int i = 0; i < sb.length(); i++){
      char ch = sb.charAt(i);

      if(ch >= 'A' && ch <= 'Z'){
        // convert to lowercase
        char lc = (char)(ch -'A'+'a');
        sb.setCharAt(i, lc);
      }
      if(ch >= 'a' && ch <= 'z'){
        char uc =(char)(ch - 'a' + 'A');
        sb.setCharAt(i, uc);
      }

    }
    return sb.toString();
  }
}
