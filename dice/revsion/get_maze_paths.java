import java.util.ArrayList;
import java.util.Scanner;

public class get_maze_paths {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    ArrayList<String> pths = getMazePaths(1,1,n,m);
    System.out.println(pths);
  }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
  public static ArrayList<String>getMazePaths(int sr, int sc, int dr , int dc){
  // base case
  if(sr == dr && sc == dc){
    ArrayList<String> bres = new ArrayList<>();
    bres.add(" ");
    return bres;
  }
  else if(sr > dr || sc > dc ){
    ArrayList<String> bres = new ArrayList<>(); 
    return bres; 
  }

   ArrayList<String> myres = new ArrayList<>();
   ArrayList<String> hpaths = getMazePaths(sr, sc+1, dr, dc);
   for(String hpath : hpaths){
    myres.add("h" + hpath);
   }
   ArrayList<String> vpaths = getMazePaths(sr+1, sc, dr, dc);
   for(String vpath : vpaths){
    myres.add("v" + vpath);
   }

   return myres;
  }
}
