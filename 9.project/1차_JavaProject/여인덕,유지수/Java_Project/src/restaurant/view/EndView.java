package restaurant.view;

import java.util.ArrayList;

import restaurant.domain.RestaurantDTO;

public class EndView {
	
 public static void printmsg(String msg){
	 System.out.println(msg);
 }
 public static void printAll(ArrayList<RestaurantDTO> all) {
	 int count= all.size();
	 for(int i=0;i<count; i++) {
		 System.out.println(all.get(i).toString());
	 }
 }
}
