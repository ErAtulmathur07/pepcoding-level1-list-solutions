public class String_builder_usage_and_performance {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello");
    
    System.out.println("length of string " + sb.length());
    System.out.println("charcter at index 2 " + sb.charAt(2));
    sb.setCharAt(3, 't');
    System.out.println("set " + sb);
    String s = "World";
    System.out.println(sb.append(s));
    sb.deleteCharAt(4);
    System.out.println(sb);
    sb.delete(2, 4);
    System.out.println(sb);
    sb.replace(3, 6, "ing");
    System.out.println(sb);
    String str = sb.toString();
    System.out.println(str);
  
// string builder is mutable string

    
    long start = System.currentTimeMillis();
    for(int i = 0; i < 100000; i++){
      sb.append(i);

    }
    long end = System.currentTimeMillis();
    long duration = end - start;
    System.out.println(duration);
    
  }
}
