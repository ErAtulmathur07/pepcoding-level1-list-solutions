import java.util.ArrayList;
import java.util.Scanner;

public class getkpc {
  public static void main(String[] args) {
   Scanner scn = new Scanner(System.in);
   String str = scn.next();
   ArrayList<String>words = get_Kpc(str);
   System.out.println(words);

  }
  
  static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu","vwx", "yz"};

  public static ArrayList<String> get_Kpc(String str) {
    // base case
    if(str.length() == 0){
      ArrayList<String>bres = new ArrayList<>();
      bres.add(" ");
      return bres;
    }
   char ch = str.charAt(0);//'3'
   String ros = str.substring(1); // 67
   ArrayList<String>rres = get_Kpc(ros);
   ArrayList<String>myres = new ArrayList<>();

   int ii = ch-48;
   String chcode = codes[ii];
  for(int i = 0; i < chcode.length(); i++){
    char chcodes = chcode.charAt(i);
    for(String val : rres){
      myres.add(chcodes + val);

    }
  }
   return myres;
}
}
