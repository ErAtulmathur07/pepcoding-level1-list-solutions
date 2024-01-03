import java.util.Scanner;

public class armstrong {
  public static void main(String[] args) {
    int originalnum , digit, cubeofdigit = 0; 
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
     originalnum = num;

    while(num != 0){
       digit = num % 10; 
       cubeofdigit = (int) (cubeofdigit + Math.pow(digit, 3));
       num =num / 10; 

    }
    if(originalnum == cubeofdigit){
      System.out.println("the number is armstong");
    }
    else{
      System.out.println("the number is not armstrog");
    }
  }
}
