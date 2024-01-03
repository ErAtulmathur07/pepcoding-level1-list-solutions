import java.util.ArrayList;
import java.util.Scanner;

public class get_maze_paths_with_jumps {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    ArrayList<String> paths = getMazePathWithJumps(1, 1, n, m);
    System.out.println(paths);
    
  }

  public static ArrayList<String> getMazePathWithJumps(int sr, int sc, int dr, int dc){
    //base case
    if(sr==dr && sc == dc){
      ArrayList<String>bres = new ArrayList<>();
      bres.add("");
      return bres;
    }
  
    ArrayList<String> myres= new ArrayList<>();

    // horizontal moves
    for(int ms = 1; ms <= dc-sc; ms++){
      ArrayList<String> hpaths = getMazePathWithJumps(sr, sc+ms, dr, dc);
      for(String hpath :hpaths){
        myres.add("h" + ms + hpath);
      }
    }
    // vertical moves
    for(int ms =1; ms <= dr-sr; ms++){
      ArrayList<String> vpaths =getMazePathWithJumps(sr+ms, sc, dr, dc);
      for(String vpath: vpaths){
        myres.add("v"+ ms + vpath);
      }
    }

    // diagonal moves
    for(int ms = 1; ms <= dc-sc && ms <= dr-sr; ms++){
     ArrayList<String>dpaths = getMazePathWithJumps(sr+ms, sc+ms, dr, dc);
     for(String dpath: dpaths){
      myres.add("d" + ms + dpath);
     }
    }

    return myres;

  }
}
