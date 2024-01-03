import java.util.Scanner;

public class exit_point_of_a_matrix {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();
    int[][] arr = new int[n1][n2];

    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[0].length; j++){
        arr[i][j] = scn.nextInt();
      }
    }
    int i = 0;
    int j = 0;
    int dir = 0; // East->0 South->1 West->2 North->3

    while(true){
      dir = (dir + arr[i][j]) % 4; //To Keep the values between 0 and 3
      if(dir == 0){
        j++;
      }else if(dir == 1){
        i++;  
      }else if(dir == 2){
        j--;  
      }else if(dir == 3){
        i--;
      }

      if(i < 0){
        i++;
        break;
      }else if(j < 0){
        j++;
        break;
      }else if ( i == n1){
        i--;
        break;
      }else if( j == n2){
        j--;
        break;
      }
    }
     System.out.println(i);
     System.out.println(j);
    
  }
}
