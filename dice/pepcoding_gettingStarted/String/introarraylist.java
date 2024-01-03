package pepcoding_gettingStarted.String;

import java.util.ArrayList;

public class introarraylist {
  public static void main(String[] args) {
    ArrayList<Integer>list = new ArrayList<>();
   System.out.println(list.size()+ " -->" + list);

   list.add(10);
   list.add(20);
   list.add(30);
   list.add(40);
   list.add(50);
   list.add(60);
   System.out.println(list.size()+ " -->" + list);

   list.set(1, 2000); // changes the values does not add the value.
   System.out.println(list.size()+ " -->" + list);

   int  cal = list.get(2);
   System.out.println(cal);

   list.add(1, 40);
   System.out.println(list.size()+ " -->" + list);

   list.remove(1);
   System.out.println(list.size()+ " -->" + list);


   for(int i = 0; i < list.size();i++){
    int val = list.get(i);
    System.out.println(val);
   }

   for(int val2:list){
    System.out.println(val2);
   }

  }
  
}
