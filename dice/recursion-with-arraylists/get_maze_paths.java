import java.util.ArrayList;
import java.util.Scanner;

public class get_maze_paths {
  public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  int m = scn.nextInt();
  ArrayList<String> paths = getMazePaths(1, 1, n, m);
  System.out.println(paths);    
  }
    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column  
  public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
    // base case
    if(sr > dr || sc > dc ){
      ArrayList<String>bres = new ArrayList<>();
      return bres;
    } else if(sr == dr && sc == dc){
      ArrayList<String>bres = new ArrayList<>();
      bres.add(" ");
      return bres;      
    }
    
    ArrayList<String> mypaths = new ArrayList<>();
    ArrayList<String> myhpaths = getMazePaths(sr, sc+1, dr, dc);
    for(String myhpath: myhpaths){
      mypaths.add("h" + myhpath);
    }
    ArrayList<String> myvpaths = getMazePaths(sr+1, sc, dr, dc);
    for(String myvpath: myvpaths){
      mypaths.add("v" + myvpath);
    }  

    return mypaths;
  }  
}
