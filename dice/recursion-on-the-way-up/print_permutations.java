import java.util.Scanner;

public class print_permutations {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    printPermutatuons(str, "");

  }

  public static void printPermutatuons(String ques, String asf){
  // base case
  if(ques.length() == 0){
    System.out.println(asf);
    return;
  }

    for(int i = 0; i < ques.length(); i++){
      char ch = ques.charAt(i);
      String qlpart = ques.substring(0, i);
      String rlpart = ques.substring(i+1);
      String roq = qlpart + rlpart;
      printPermutatuons(roq, asf + ch);
    }
  }
}
