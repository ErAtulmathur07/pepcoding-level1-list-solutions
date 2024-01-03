package pepcoding_gettingStarted.String;

import java.util.ArrayList;
import java.util.Scanner;

public class removeprimenumbers {

  public static boolean isprime(int num){
    boolean isprime = true;
    for(int div = 2; div*div < num; div++){
    if(num%div == 0){
      isprime = false;
      break;
    }
    }

    return isprime;
  }
  public static void solution(ArrayList<Integer> al){
		for(int i = 0; i < al.size(); i++){
      int val = al.get(i);
      boolean isThisValPrime = isprime(val);
      if(isThisValPrime == true){
        al.remove(i);
        i--;
      }
    }
		
	}
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    ArrayList<Integer>al = new ArrayList<>();
    for(int i = 0; i < n; i++){
      al.add(scn.nextInt());
    
    }

  }
  
}
