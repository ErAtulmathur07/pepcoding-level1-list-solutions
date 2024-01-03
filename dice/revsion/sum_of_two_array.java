import java.util.Scanner;

public class sum_of_two_array{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int [] one = new int[n1];
    for(int i = 0; i < n1; i++){
      one[i] = scn.nextInt();
    }

    int n2 = scn.nextInt();
    int[] two = new int[n2];
    for(int i = 0; i< n2; i++){
      two[i] = scn.nextInt();

    }

    int[] sum = new int[n1>n2?n1:n2];

    int i = n1-1;
    int j = n2-1;
    int k = sum.length-1;
     
    int c = 0;
    while(k >= 0){
     int d = c;
     if(i >= 0){
      d = d + one[i];
     }
     if(j >= 0){
      d = d + two[j];
     }
     c = d/10;
     d = d % 10;
    sum[k] = d;

    i--;
    j--;
    k--;

    }
    if(c >0){
      System.out.println(c);
    }

    for(int x = 0; x < sum.length; x++){
      System.out.println(sum[x]);
    }


  }
}