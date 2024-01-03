package pepcoding_gettingStarted.String;

import java.util.ArrayList;

public class remove_oddnumbers {
  public static void main(String[] args) {
    ArrayList<Integer>list = new ArrayList<>();
    list.add(10);
    list.add(12);
    list.add(15);
    list.add(17);
    list.add(18);
    list.add(19);
    list.add(21);
    list.add(22);

    for(int i = 0; i < list.size();i++){
      int val = list.get(i);
      if(val % 2==1){
        list.remove(i);
        i--;
      }
    }
    System.out.println(list.size()+ "-->" + list);
  }
  
}
