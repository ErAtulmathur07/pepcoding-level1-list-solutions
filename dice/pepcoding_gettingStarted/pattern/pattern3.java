package pepcoding_gettingStarted.pattern;
import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nstr = n;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= nstr; j++){
                System.out.print("*\t");
            }
            System.out.println();
            nstr--;

        }
        
    }
    
}
