import java.util.*;

public class old_young {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int Atul = scn.nextInt();
        int suraj = scn.nextInt();
        int deepak = scn.nextInt();

        if(Atul > suraj && Atul > deepak){
            System.out.println("Atul is oldest ");
        }
        else if (suraj > Atul && suraj > deepak){
            System.out.println("Suraj is oldest");
        }
        else{
            System.out.println("deepak is oldest");
        }
    }
    
}
