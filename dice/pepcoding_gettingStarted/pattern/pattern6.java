package pepcoding_gettingStarted.pattern;
import java.util.Scanner;
public class pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nstr = n/2+ 1;
        int nspc = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= nstr; j++){
                System.out.print("*\t");
            }
            for(int j = 1; j<= nspc; j++){
                System.out.print(" \t");
            }
            for(int j = 1; j<= nstr; j++){
                System.out.print("*\t");
            }
             
            if(i<(n/2+1)){
                nstr--;
                nspc = nspc + 2;
            }else{
                nstr++;
                nspc = nspc - 2;
            }
            System.out.println();
        }
    }
    
}
