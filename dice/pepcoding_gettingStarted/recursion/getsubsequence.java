import java.util.ArrayList;
import java.util.Scanner;
public class getsubsequence {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    ArrayList<String> ss = gss(str);
    System.out.println(ss);
  }

  public static ArrayList<String> gss(String str){
    if(str.length()==0){
      ArrayList<String>bres = new ArrayList<>();
      String theSS = "";
      bres.add(theSS);
      return bres;
    }
    char ch = str.charAt(0);// abc--> a
    String ros = str.substring(1); // abc --> bc
    ArrayList<String> rres = gss(ros); // gss(bc) = [--,-c,b-,bc]
    ArrayList<String> mres = new ArrayList<>();

    for(String rstr:rres){
      mres.add(rstr);
    }
    for(String rstr : rres){
      mres.add(ch + rstr);
    }
   return mres;
  }
}
