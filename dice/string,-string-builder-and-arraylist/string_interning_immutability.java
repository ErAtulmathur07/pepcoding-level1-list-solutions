public class string_interning_immutability {
  public static void main(String[] args) {
    String s1 = "hello";
    String s2 = "hello";
    String s3 = new String("hello");

    boolean flag = (s1 == s2);
    System.out.println(flag);

    boolean flg = (s1 == s3);
    System.out.println(flg);

    boolean flagg = s1.equals(s2);
    boolean flaag = s1.equals(s3);

    System.out.println(flagg);
    System.out.println(flaag);

    String str = "hello";
   str = str.replace('h', 'b');
   System.out.println(str);

   String s = " ";
   long start = System.currentTimeMillis();
   for(int i = 0; i < 100000; i++){
       s = s + i;
   }
   long end = System.currentTimeMillis();
   long duration = end - start;
   System.out.println(duration);

  }
}
