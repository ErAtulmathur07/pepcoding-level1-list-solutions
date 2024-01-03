import java.util.ArrayList;

public class arraylistloopwork {
  public static void main(String[] args) {
    ArrayList<String> rres = new ArrayList<>();
    rres.add("pt");
    rres.add("pu");
    rres.add("qt");
    rres.add("qu");
    rres.add("rt");
    rres.add("ru");
    rres.add("st");
    rres.add("su");

    String code = "ghi";
    for(int i = 0; i < code.length(); i++){
      char chcode = code.charAt(i);
      for(String rstr: rres){
        System.out.println(chcode + rstr);
      }

    }
  }
}
