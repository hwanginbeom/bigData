package restaurant.view;

import java.util.ArrayList;
import java.util.HashMap;

import restaurant.domain.RestaurantDTO;
import restaurant.service.RestaurantService;

public class RestaurantEndView {


	public static void restaurantView(RestaurantDTO restaurant){
		System.out.println(restaurant);	
	}
	
	public static void aListdataView(ArrayList<RestaurantDTO> allRestaurant){
		for(int i = 0; i < allRestaurant.size(); i++){			
			if(allRestaurant.get(i) != null){
				System.out.println("\n" + allRestaurant.get(i));
			}
		}
	}
	
	/*Set keys = map.keySet();
	System.out.println(keys);
	System.out.println(keys.size());*/
	
	
	
	/*public static void aListdataView2(ArrayList<RestaurantDTO> allRestaurant){
		RestaurantDTO dto = null;
		for(int i = 0; i < allRestaurant.size(); i++){
			dto = allRestaurant.get(i);
			if(dto != null){
				System.out.println(dto.getRestaurantName());
			}
		}
	}*/
	
	public static void printMsg(String msg) {
		System.out.println(msg);
}

	/*public static boolean hmSubwayView(String allSubway) {
		HashMap<String, Object>hmSubway = RestaurantService.hmSubway;
		for(int i = 0; i < hmSubway.size(); i++) {
			if(hmSubway.get(allSubway) != null){
				System.out.println("\n" + RestaurantService.hmSubway.get(allSubway));
			} return true;
		} return false;
	}	*/


		
}


