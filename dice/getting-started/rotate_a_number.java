import java.util.Scanner;

public class rotate_a_number {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int k = scn.nextInt(); 
     int temp = n; 
     int dig = 0; 
     while(temp != 0){
       int rem = temp % 10;
       dig++;
       temp = temp/10;
     
     }
      k = k % dig;
      if(k < 0){
        k = k + dig;
      }
     int div = 1;
     int mult = 1; 
     
     for(int i = 1; i <= dig; i++){
      if(i <= k){
        div = div * 10;
      }
      else{
        mult = mult * 10;
      }

     }
     int q = n / div;
     int r = n % div;

     int rot = (r * mult) + q;
     System.out.println(rot);
    
  }
  
}
