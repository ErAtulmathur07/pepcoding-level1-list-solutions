import java.util.Scanner;
public class operator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the first number: ");
      double number1 = scanner.nextDouble();

      System.out.print("Enter the second number: ");
      double number2 = scanner.nextDouble();

      System.out.print("Enter the operator (+, -, *, /): ");
      char operator = scanner.next().charAt(0);
     
     double ans = 0.0;
     if(operator =='+'){
      ans = number1 + number2;

     }else if(operator == '-'){
      ans = number1 - number2;

     }else if(operator=='*'){
      ans = number1 * number2;
     } 
     else if(operator=='/'){
      // Check if the second number is not zero to avoid division by zero
      if(number2 !=0){
        ans = number1 / number2;
      }
      else{
        System.out.println("Error: Division by zero is not allowed.");
        scanner.close();
        return;
      }
     }
     else{
      System.out.println("Error: Invalid operator.");
      scanner.close();
      return;
     }
     System.out.println(ans);
     scanner.close();
  }
}
