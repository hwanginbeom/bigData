package restaurant.controller;

import restaurant.service.RestaurantService;
import restaurant.view.RestaurantEndView;

public class RestaurantController {
	public static void deleteOne(String restaurantName) {
		if(RestaurantService.restaurantDelete(restaurantName)) {
			RestaurantEndView.printMsg('"'+restaurantName+'"'+" "+"음식점이 정상적으로 삭제 되었습니다.");
		}else {
			RestaurantEndView.printMsg("존재하지 않는 음식점입니다.");
		}
	}
	
	public static void updatepNumber(String restaurantName, String pNumber) {
		if(RestaurantService.restaurantUpdate(restaurantName,pNumber)) {
			RestaurantEndView.printMsg('"'+restaurantName+'"'+"의 음식점 전화번호가 "
					+" "+'"'+pNumber+'"'+"으로"+" "+"정상변경 되었습니다.");
		}else {
			RestaurantEndView.printMsg("존재하지 않는 음식점입니다.");
		}
	}
}