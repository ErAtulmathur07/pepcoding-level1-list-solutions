import java.util.Scanner;

public class string_compression {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    System.out.println(compression1(str));
    System.out.println(compression2(str));


  }
  public static String compression1(String str){
    String ans = " ";
    for(int i = 0; i < str.length()-1; i++){
      if(str.charAt(i) == str.charAt(i+1)){

      }
      else{
        ans = ans + str.charAt(i);
      }
    }
    ans = ans + str.charAt(str.length()-1);

    return ans;
  } 

   public static String compression2(String str){
    String ans = " ";
    int c = 1;
    for(int i = 0; i < str.length()-1; i++){
      if(str.charAt(i) == str.charAt(i+1)){
        c++;
      }
      else{
        ans = ans+ str.charAt(i);
        if(c > 1){
          ans = ans + c;
          c =1;

        }
      }
    }
    ans = ans + str.charAt(str.length()-1);
    if(c > 1){
      ans += c;

    }
    return ans;
  }
  

}