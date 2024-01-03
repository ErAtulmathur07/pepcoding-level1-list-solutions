import java.util.ArrayList;
import java.util.Scanner;

public class get_kpc{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    ArrayList<String> words = getKPC(str);
    System.out.println(words);

  }

  static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

  public static ArrayList<String> getKPC(String str){
   // base case 
   if(str.length() == 0){
    ArrayList<String> bres = new ArrayList<>();
    bres.add(" ");
    return  bres;
   }

    char ch = str.charAt(0); // '3'
    String ros = str.substring(1);
    ArrayList<String> rres = getKPC(ros);
    ArrayList<String> myres = new ArrayList<>();
    
    int ii = ch - 48; // 3
    String code = codes[ii]; // ghi
    
    for(int i = 0; i < code.length(); i++){
      char chcode = code.charAt(i);
      for(String rstr: rres){
        myres.add(chcode + rstr);
      }

    }


    return myres;
  }
}