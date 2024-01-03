import java.util.Scanner;

public class print_maze_path_with_jumps {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n =scn.nextInt();
    int m = scn.nextInt();
    printMazePathWithJumps(1, 1, n, m, "");

  }

  public static void printMazePathWithJumps(int sr, int sc, int dr,int dc, String psf){
    // base case
    if(sr==dr && sc == dc){
      System.out.println(psf);
      return;
    }
    // horizontal print
    for(int ms = 1; ms <=dc-sc; ms++){
      printMazePathWithJumps(sr, sc+ms, dr, dc, psf + "h"+ms);
    }
    // vrtical print
    for(int ms = 1; ms <= dr-sr; ms++){
      printMazePathWithJumps(sr+ms, sc, dr, dc, psf + "v"+ms);
    }
    // diagonal print
    for(int ms = 1; ms <= dr-sr && ms <= dc-sc; ms++){
     printMazePathWithJumps(sr+ms, sc+ms, dr, dc, psf+"d"+ms);
    }
    
  }
}
