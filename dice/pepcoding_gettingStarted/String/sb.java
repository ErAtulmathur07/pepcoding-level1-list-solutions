package pepcoding_gettingStarted.String;

public class sb {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("hello");
    char ch = sb.charAt(0);
    System.out.println(ch);

    sb.setCharAt(0,'b'); // change
    System.out.println(sb);

    sb.deleteCharAt(0); // delete first char.
    System.out.println(sb); 

    sb.insert(0, 't'); // inset the char at index 0.
    System.out.println(sb);

    String s = sb.toString(); // after if make string.
    System.out.println(s); 


  }
}
