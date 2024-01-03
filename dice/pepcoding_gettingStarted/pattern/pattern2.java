package pepcoding_gettingStarted.pattern;
import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
         int nspc = n - 1;
         int nstr = 1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= nspc; j++){
                System.out.print(" \t");
            }
            for(int j = 1; j <= nstr; j++){
                System.out.print("*\t");
            }
            System.out.println();
            nspc--;
            nstr++;
        }
    }
    
}
