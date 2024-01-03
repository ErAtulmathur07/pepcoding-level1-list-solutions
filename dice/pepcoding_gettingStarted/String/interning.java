package pepcoding_gettingStarted.String;

public class interning {
  public static void main(String[] args) {
    String s1 = "hello";
    String s2 = "hello";
    String s3 = new String("hello");
    String s4 = "hello";

    System.out.println(s1==s2);
    System.out.println(s1==s3);
    System.out.println(s1.equals(s3));
    System.out.println(s1.equals(s4));

    char ch = s1.charAt(0);
    char ch1 = s1.charAt(1);
    char ch2 = s1.charAt(2);
    char ch3 = s1.charAt(3);
    char ch4 = s1.charAt(4);

    System.out.println(ch);
    System.out.println(ch1);
    System.out.println(ch2);
    System.out.println(ch3);
    System.out.println(ch4);
    s1.replace('h','b');


    String s = " ";
    long start = System.currentTimeMillis();
    // for(int i = 0; i < 10000; i++){
    //   s = s + i;

    // }
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < 10000; i++){
    sb.append(i);
    
  }

    long end = System.currentTimeMillis();
    long duration = end-start;

  System.out.println(duration);

  

  }
}
