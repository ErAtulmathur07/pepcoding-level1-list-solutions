import java.util.Scanner;

public class sum_of_two_arrays {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int [] one = new int[n1];
    for(int i = 0; i < one.length; i++){
      one[i] = scn.nextInt();
    }
    int n2 = scn.nextInt();
    int [] two = new int[n2];
    for(int j = 0; j < two.length; j++){
      two[j] = scn.nextInt();

    }
    int [] sum = new int[n1>n2?n1:n2];

    int i = one.length-1;
    int j = two.length-1;
    int k = sum.length-1;
    
    int c = 0; 
    while(k >= 0){
      int d = c;
       if(i >= 0){
        d += one[i];
      }
       if(j >= 0){
        d += two[j];

      }
       c = d / 10;
       d = d % 10;
       sum[k] = d;

      i--;
      j--;
      k--;


    }
    if(c > 0){
      System.out.println(c);
    }
    for(int x = 0; x < sum.length; x++){
        System.out.println(sum[x]);
    }

  }
}
