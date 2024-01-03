import java.util.Scanner;

public class introduction_to_strings_1{
  public static void main(String[] args) {
   Scanner scn = new Scanner(System.in);

   /* 
   String s1 = scn.next();
   String s2 = scn.next();

   System.out.println(s1);
   System.out.println(s2);

   String s3 = scn.nextLine();
   String s4 = scn.next();
   
   System.out.println(s3);
   System.out.println(s4);

   String s5 = scn.nextLine();
   String s6 = scn.nextLine();

   System.out.println(s5);
   System.out.println(s6);

   char ch = s1.charAt(3);
   System.out.println(ch);
   */
/* 
   String s1 = "Hello";
   System.out.println(s1);
   for(int i = 0; i < s1.length(); i++){
    char ch = s1.charAt(i);
    System.out.println(ch);
   }
   s1 += "World";
   System.out.println(s1);

   System.out.println(10 + 20+ "hello" + 10 + 20);
  String s =  s1.substring(1, 3);
  System.out.println(s);
  
  String ss = s1.substring(0, 4);
  System.out.println(ss);
*/

String s = scn.nextLine();
System.out.println(s);
char ch = s.charAt(4);
System.out.println(ch);

for(int i = 0; i < s.length(); i++){
  char chh = s.charAt(i);
  System.out.println(chh);
}



  }
}